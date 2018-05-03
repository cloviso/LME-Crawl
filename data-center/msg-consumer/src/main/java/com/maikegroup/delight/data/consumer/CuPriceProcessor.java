/**
 * Project Name:data-consumer
 * File Name:CuPriceProcessor.java
 * Package Name:com.maikegroup.delight.data.consumer
 * Copyright (c) 2018, *******.
 *
 */
package com.maikegroup.delight.data.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maikegroup.delight.data.repository.data.cuPrice.dao.CuPriceMapper;
import com.maikegroup.delight.data.repository.data.cuPrice.model.CuPrice;
import com.maikegroup.delight.dlservice.common.util.IdGenerator;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

/**
 * ClassName: CuPriceProcessor <br/>
 * Function: 洋山铜溢价（提单）等数据抓取. <br/>
 * 
 * @author juan.yang
 */
@Component
public class CuPriceProcessor implements PageProcessor {
	@Autowired
	private CuPriceMapper cuPriceMapper;
	// 抓取网站的相关配置，包括：编码、抓取间隔、重试次数等
	private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);

	@Override
	public Site getSite() {
		return site;
	}

	@Override
	// process是定制爬虫逻辑的核心接口，在这里编写抽取逻辑
	public void process(Page page) {
		// 列表页
		List<String> links = page.getHtml().links().regex("https://hq.smm.cn/tong").all();
		page.addTargetRequests(links);

		List<Selectable> nodes = page.getHtml().xpath("//ul[@class='tab-item-ul']/li").nodes();

		for (Selectable selectable : nodes) {
			CuPrice cuPriceModel = new CuPrice();
			String keyId = IdGenerator.generateId();
			// 设置金属名称
			cuPriceModel.setTitle(selectable.xpath("//a/text()").get());
			// 设置价格范围
			cuPriceModel.setPricerange(selectable.xpath("//div[@class='value2']/span/text()").get());
			// 设置均价
			cuPriceModel.setAvgprice(selectable.xpath("//span[@class='value3']/text()").get());
			// 设置涨跌价
			cuPriceModel.setRollprice(selectable.xpath("//span[@class='value4']/text()").get());
			// 设置单位
			cuPriceModel.setUnit(selectable.xpath("//span[@class='value5']/text()").get());
			// 设置时间
			cuPriceModel.setDatestr(selectable.xpath("//span[@class='value6']/text()").get());
			// 生成主键
			cuPriceModel.settId(keyId);

			// 插入数据库
			cuPriceMapper.insert(cuPriceModel);

		}
	}
}
