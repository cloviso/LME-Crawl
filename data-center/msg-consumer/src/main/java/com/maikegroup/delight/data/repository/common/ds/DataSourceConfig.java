/**
 * Project Name:msg-repository
 * File Name:CtrmDataSourceConfig.java
 * Package Name:com.maikegroup.delight.msg.repository.common.ds
 * Copyright (c) 2017, *******.
 *
 */
package com.maikegroup.delight.data.repository.common.ds;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * ClassName: CtrmDataSourceConfig <br/>
 * Function: CTRM 数据库配置. <br/>
 * @author xiangpan.wang
 */
@Configuration
//扫描 Mapper 接口并容器管理
@MapperScan(basePackages = DataSourceConfig.PACKAGE, sqlSessionFactoryRef = "ctrmSqlSessionFactory")
public class DataSourceConfig {
	// 精确到 ctrm 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.maikegroup.delight.data.repository.data";
    static final String MAPPER_LOCATION = "classpath:com/maikegroup/delight/data/repository/data/**/mapper/*.xml";
 
    @Value("${ctrm.datasource.url}")
    private String url;
 
    @Value("${ctrm.datasource.username}")
    private String user;
 
    @Value("${ctrm.datasource.password}")
    private String password;
 
    @Value("${ctrm.datasource.driverClassName}")
    private String driverClass;
 
    @Bean(name = "ctrmDataSource")
    public DataSource ctrmDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }
 
    @Bean(name = "ctrmTransactionManager")
    public DataSourceTransactionManager ctrmTransactionManager() {
        return new DataSourceTransactionManager(ctrmDataSource());
    }
 
    @Bean(name = "ctrmSqlSessionFactory")
    public SqlSessionFactory ctrmSqlSessionFactory(@Qualifier("ctrmDataSource") DataSource ctrmDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(ctrmDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(DataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
