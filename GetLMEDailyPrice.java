/**
 * Project Name:ctrm-bat
 * File Name:GetLMEDailyPrice.java
 * Package Name:com.maikegroup.delight.ctrm.bat.transTask
 * Copyright (c) 2018, *****.
 *
 */
package com.maikegroup.delight.data.consumer;

import java.util.Date;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.maikegroup.delight.data.common.HttpPost;
import com.maikegroup.delight.data.repository.data.lmePrice.dao.LmePriceMapper;
import com.maikegroup.delight.data.repository.data.lmePrice.model.LmePrice;

/**
 * ClassName: GetLMEDailyPrice <br/>
 * Function: TODO 将LME数据写入数据库表中（定时刷新）. <br/>
 * 
 * @author juan.yang
 */
@Component
public class GetLMEDailyPrice {

	Logger logger = Logger.getLogger(GetLMEDailyPrice.class);

	@Autowired
	private LmePriceMapper lmePriceMapper;

	public static final String url = "http://hq.sinajs.cn/rn=4im3g&list=hf_AHD,hf_CAD,hf_NID,hf_PBD,hf_SND,hf_ZSD";
	public static final String companyName = "新浪LME数据";
	public static final String mateCu = "LME铜";
	public static final String mateAl = "LME铝";
	public static final String matePb = "LME铅";
	public static final String mateZn = "LME锌";
	public static final String mateNi = "LME镍";
	public static final String mateSn = "LME锡";
	public static final String raiseState = "red";
	public static final String downState = "green";

	@Scheduled(cron="0/5 * * * * ? ")
	// 测试每五秒钟执行一次
	public void task() throws Exception {
		String resultStr = "";
		try {
			resultStr = HttpPost.sendPost(url, null);
		} catch (Exception e) {
			logger.warn("新浪LME期货数据网站请求超时");
		}
		// 初始化金属的最新价
		String cuLmePrice = "0";
		String alLmePrice = "0";
		String pbLmePrice = "0";
		String znLmePrice = "0";
		String niLmePrice = "0";
		String snLmePrice = "0";
		// 初始化涨跌的状态
		String cuState = raiseState;
		String alState = raiseState;
		String pbState = raiseState;
		String znState = raiseState;
		String niState = raiseState;
		String snState = raiseState;
		// 初始化金属昨日结算价
		String cuLmeYestodayPrice = "0";
		String alLmeYestodayPrice = "0";
		String pbLmeYestodayPrice = "0";
		String znLmeYestodayPrice = "0";
		String niLmeYestodayPrice = "0";
		String snLmeYestodayPrice = "0";
		
		// 初始化金属交易更新时间
		String cuTradeTime = "0";
		String alTradeTime = "0";
		String pbTradeTime = "0";
		String znTradeTime = "0";
		String niTradeTime = "0";
		String snTradeTime = "0";

		if (StringUtils.isNotBlank(resultStr)) {
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("js");
			engine.put("out", System.out);
			String js = resultStr;
			engine.eval(js);
			// 铜的LME价格
			Object cuObj = engine.get("hq_str_hf_CAD");
			String[] cuStr = cuObj.toString().split(",");
			if (null != cuStr) {
				cuLmePrice = StringUtils.isNotBlank(cuStr[0]) ? cuStr[0] : "0";
				cuLmeYestodayPrice = StringUtils.isNotBlank(cuStr[7]) ? cuStr[7] : "0";
				cuTradeTime = StringUtils.isNotBlank(cuStr[12] + cuStr[6]) ? cuStr[12] +" " + cuStr[6] : (new Date()).toString();
				String cuRaiseOrDown = StringUtils.isNotBlank(cuStr[1]) ? cuStr[1] : "1";
				if (judegeWithZero(cuRaiseOrDown)) {
					cuState = downState;
				}
			}
			logger.info("+++++++++++" + cuLmePrice + "   " + cuState+"   " +cuLmeYestodayPrice+ "   " + cuTradeTime );

			// 铝的LME价格
			Object alObj = engine.get("hq_str_hf_AHD");
			String[] alStr = alObj.toString().split(",");
			if (null != alStr) {
				alLmePrice = StringUtils.isNotBlank(alStr[0]) ? alStr[0] : "0";
				alLmeYestodayPrice = StringUtils.isNotBlank(alStr[7]) ? alStr[7] : "0";
				alTradeTime = StringUtils.isNotBlank(alStr[12] + alStr[6]) ? alStr[12] +" " + alStr[6] : (new Date()).toString();
				String alRaiseOrDown = StringUtils.isNotBlank(alStr[1]) ? alStr[1] : "1";
				if (judegeWithZero(alRaiseOrDown)) {
					alState = downState;
				}
			}
			logger.info("+++++++++++" + alLmePrice + "   " + alState +"  " +alLmeYestodayPrice+ "  " + alTradeTime);

			// 铅的LME价格
			Object pbObj = engine.get("hq_str_hf_PBD");
			String[] pbStr = pbObj.toString().split(",");
			if (null != pbStr) {
				pbLmePrice = StringUtils.isNotBlank(pbStr[0]) ? pbStr[0] : "0";
				pbLmeYestodayPrice = StringUtils.isNotBlank(pbStr[7]) ? pbStr[7] : "0";
				pbTradeTime = StringUtils.isNotBlank(pbStr[12] + pbStr[6]) ? pbStr[12] +" " + pbStr[6] : (new Date()).toString();
				String pbRaiseOrDown = StringUtils.isNotBlank(pbStr[1]) ? pbStr[1] : "1";
				if (judegeWithZero(pbRaiseOrDown)) {
					pbState = downState;
				}
			}
			logger.info("+++++++++++" + pbLmePrice + "   " + pbState +"  " +pbLmeYestodayPrice+ "  " + pbTradeTime);

			// 锌的LME价格
			Object znObj = engine.get("hq_str_hf_ZSD");
			String[] znStr = znObj.toString().split(",");
			if (null != znStr) {
				znLmePrice = StringUtils.isNotBlank(znStr[0]) ? znStr[0] : "0";
				znLmeYestodayPrice = StringUtils.isNotBlank(znStr[7]) ? znStr[7] : "0";
				znTradeTime = StringUtils.isNotBlank(znStr[12] + znStr[6]) ? znStr[12] +" " + znStr[6] : (new Date()).toString();
				String znRaiseOrDown = StringUtils.isNotBlank(znStr[1]) ? znStr[1] : "1";
				if (judegeWithZero(znRaiseOrDown)) {
					znState = downState;
				}
			}
			logger.info("+++++++++++" + znLmePrice + "   " + znState+"  " +znLmeYestodayPrice+ "  " + znTradeTime);

			// 镍的LME价格
			Object niObj = engine.get("hq_str_hf_NID");
			String[] niStr = niObj.toString().split(",");
			if (null != niStr) {
				niLmePrice = StringUtils.isNotBlank(niStr[0]) ? niStr[0] : "0";
				niLmeYestodayPrice = StringUtils.isNotBlank(niStr[7]) ? niStr[7] : "0";
				niTradeTime = StringUtils.isNotBlank(niStr[12] + niStr[6]) ? niStr[12] +" " + niStr[6] : (new Date()).toString();
				String niRaiseOrDown = StringUtils.isNotBlank(niStr[1]) ? niStr[1] : "1";
				if (judegeWithZero(niRaiseOrDown)) {
					niState = downState;
				}
			}
			logger.info("+++++++++++" + niLmePrice + "   " + niState+"  " +niLmeYestodayPrice+ "  " + niTradeTime);


			// 锡的LME价格
			Object siObj = engine.get("hq_str_hf_SND");
			String[] siStr = siObj.toString().split(",");
			if (null != siStr) {
				snLmePrice = StringUtils.isNotBlank(siStr[0]) ? siStr[0] : "0";
				snLmeYestodayPrice = StringUtils.isNotBlank(siStr[7]) ? siStr[7] : "0";
				snTradeTime = StringUtils.isNotBlank(niStr[12] + niStr[6]) ? niStr[12] +" " + niStr[6] : (new Date()).toString();
				String snRaiseOrDown = StringUtils.isNotBlank(siStr[1]) ? siStr[1] : "1";
				if (judegeWithZero(snRaiseOrDown)) {
					snState = downState;
				}
			}
			logger.info("+++++++++++" + snLmePrice + "   " + snState+"  " +snLmeYestodayPrice+ "  " + snTradeTime);

		}

		// 每5分钟更新cu 数据 到 tb_lme_daily_price 表中
		LmePrice lmeCuRecord = new LmePrice();
		lmeCuRecord.setMarName(mateCu);
		LmePrice lmeCuPrice = lmePriceMapper.selectByPrimaryKey(mateCu);
		
		if (null == (lmeCuPrice)) {
			//lmeCuRecord.setMarName(mateCu);
			lmeCuRecord.setRealPrice(cuLmePrice);
			lmeCuRecord.setRaiseState(cuState);
			lmeCuRecord.setYestodayPrice(cuLmeYestodayPrice);
			lmeCuRecord.setTradeTime(cuTradeTime);
			lmePriceMapper.insertSelective(lmeCuRecord);

		} else {
			lmeCuRecord.setRealPrice(cuLmePrice);
			lmeCuRecord.setRaiseState(cuState);
			lmeCuRecord.setYestodayPrice(cuLmeYestodayPrice);
			lmeCuRecord.setTradeTime(cuTradeTime);
			lmePriceMapper.updateByPrimaryKeySelective(lmeCuRecord);
		}

		
		// 每5分钟更新al 数据 到 tb_lme_daily_price 表中
		LmePrice lmeAlRecord = new LmePrice();
		lmeAlRecord.setMarName(mateAl);
		LmePrice lmeAlPrice = lmePriceMapper.selectByPrimaryKey(mateAl);
		if (null == (lmeAlPrice)) {
			//lmeAlRecord.setMarName(mateAl);
			lmeAlRecord.setRealPrice(alLmePrice);
			lmeAlRecord.setRaiseState(alState);
			lmeAlRecord.setYestodayPrice(alLmeYestodayPrice);
			lmeAlRecord.setTradeTime(alTradeTime);
			lmePriceMapper.insertSelective(lmeAlRecord);
		} else {
			lmeAlRecord.setRealPrice(alLmePrice);
			lmeAlRecord.setRaiseState(alState);
			lmeAlRecord.setYestodayPrice(alLmeYestodayPrice);
			lmeAlRecord.setTradeTime(alTradeTime);
			lmePriceMapper.updateByPrimaryKeySelective(lmeAlRecord);
		}

		// 每5分钟更新pb 数据 到 tb_lme_daily_price 表中
		LmePrice lmePbRecord = new LmePrice();
		lmePbRecord.setMarName(matePb);
		LmePrice lmePbPrice = lmePriceMapper.selectByPrimaryKey(matePb);
		if (null == (lmePbPrice)) {
			//lmePbRecord.setMarName(matePb);
			lmePbRecord.setRealPrice(pbLmePrice);
			lmePbRecord.setRaiseState(pbState);
			lmePbRecord.setYestodayPrice(pbLmeYestodayPrice);
			lmePbRecord.setTradeTime(pbTradeTime);
			lmePriceMapper.insertSelective(lmePbRecord);
		} else {
			lmePbRecord.setRealPrice(pbLmePrice);
			lmePbRecord.setRaiseState(pbState);
			lmePbRecord.setYestodayPrice(pbLmeYestodayPrice);
			lmePbRecord.setTradeTime(pbTradeTime);
			lmePriceMapper.updateByPrimaryKeySelective(lmePbRecord);
		}
		// 每5分钟更新zn 数据 到 tb_lme_daily_price 表中
		LmePrice lmeZnRecord = new LmePrice();
		lmeZnRecord.setMarName(mateZn);
		LmePrice lmeZnPrice = lmePriceMapper.selectByPrimaryKey(mateZn);
		if (null == (lmeZnPrice)) {
			//lmeZnRecord.setMarName(mateZn);
			lmeZnRecord.setRealPrice(znLmePrice);
			lmeZnRecord.setRaiseState(znState);
			lmeZnRecord.setYestodayPrice(znLmeYestodayPrice);
			lmeZnRecord.setTradeTime(znTradeTime);
			lmePriceMapper.insertSelective(lmeZnRecord);

		} else {
			lmeZnRecord.setRealPrice(znLmePrice);
			lmeZnRecord.setRaiseState(znState);
			lmeZnRecord.setYestodayPrice(znLmeYestodayPrice);
			lmeZnRecord.setTradeTime(znTradeTime);
			lmePriceMapper.updateByPrimaryKeySelective(lmeZnRecord);

		}
		// 每5分钟更新 ni 数据 到 tb_lme_daily_price 表中
		LmePrice lmeNiRecord = new LmePrice();
		lmeNiRecord.setMarName(mateNi);
		LmePrice lmeNiPrice = lmePriceMapper.selectByPrimaryKey(mateNi);
		if (null == (lmeNiPrice)) {
			//lmeNiRecord.setMarName(mateNi);
			lmeNiRecord.setRealPrice(niLmePrice);
			lmeNiRecord.setRaiseState(niState);
			lmeNiRecord.setYestodayPrice(niLmeYestodayPrice);
			lmeNiRecord.setTradeTime(niTradeTime);
			lmePriceMapper.insertSelective(lmeNiRecord);

		} else {
			lmeNiRecord.setRealPrice(niLmePrice);
			lmeNiRecord.setRaiseState(niState);
			lmeNiRecord.setYestodayPrice(niLmeYestodayPrice);
			lmeNiRecord.setTradeTime(niTradeTime);
			lmePriceMapper.updateByPrimaryKeySelective(lmeNiRecord);

		}

		// 每5分钟更新sn 数据 到 tb_lme_daily_price 表中
		LmePrice lmeSnRecord = new LmePrice();
		lmeSnRecord.setMarName(mateSn);
		LmePrice lmeSnPrice = lmePriceMapper.selectByPrimaryKey(mateSn);
		if (null == (lmeSnPrice)) {
			//lmeSnRecord.setMarName(mateSn);
			lmeSnRecord.setRealPrice(snLmePrice);
			lmeSnRecord.setRaiseState(snState);
			lmeSnRecord.setYestodayPrice(snLmeYestodayPrice);
			lmeSnRecord.setTradeTime(snTradeTime);
			lmePriceMapper.insertSelective(lmeSnRecord);

		} else {
			lmeSnRecord.setRealPrice(snLmePrice);
			lmeSnRecord.setRaiseState(snState);
			lmeSnRecord.setYestodayPrice(snLmeYestodayPrice);
			lmeSnRecord.setTradeTime(snTradeTime);
			lmePriceMapper.updateByPrimaryKeySelective(lmeSnRecord);

		}
		
		
	}

	/**
	 * 判断是否大于0，大于为涨，小于为跌 judegeWithZero:(这里用一句话描述这个方法的作用). <br/>
	 *
	 * @author juan.yang
	 * @param text
	 * @return
	 */
	public boolean judegeWithZero(String text) {
		if (0 > Double.valueOf(text)) {
			return true;
		}
		return false;
	}
}
