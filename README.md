# LME-Crawl
这是一个基于 Spring boot + webmagic + mybaties + mysql 的数据爬取并持久化到数据库。 实验爬取的是SMM（有色金属行情数据） 
配置了数据源写入本地数据库，并通过注解写了定时任务抽取，并没有完全实现 webmagic 的 PageProcessor 接口。
实质上就是一个Java的批量插入更新操作。 谢谢。请不要吐槽，我是小透明。第一次正式提交代码，请多多关照。

至于webmagic 是个Maven项目 添加配置就好

plus：
又添加模拟了一个请求HTTP 去爬取LME的各种金属价格涨幅。

先在本地跑了一下，把项目打成 jar 包。
