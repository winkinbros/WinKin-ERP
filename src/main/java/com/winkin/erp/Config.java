package com.winkin.erp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.winkin.erp.model.WKM_COMPANY;
import com.winkin.erp.model.WKM_OPTION;
import com.winkin.erp.model.WKM_ROLE;
import com.winkin.erp.model.WKM_USER;
import com.winkin.erp.model.WKR_ROLE_OPTION;
import com.winkin.erp.model.WKR_USER_ROLE;

import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import java.util.Properties;

@Configuration
@PropertySource("classpath:application.properties")
@PropertySource("classpath:db.properties")
@PropertySource("classpath:mail.properties")
@EnableTransactionManagement
@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
@ComponentScan(basePackages = { "com.winkin.erp.*" })
public class Config {

	@Autowired
	private Environment env;

	@Bean
	public DataSource getDataBaseSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(env.getProperty("db.driver"));
		dataSource.setUrl(env.getProperty("db.url"));
		dataSource.setUsername(env.getProperty("db.username"));
		dataSource.setPassword(env.getProperty("db.password"));
		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setDataSource(getDataBaseSource());

		Properties props = new Properties();
		props.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		props.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
		props.put("hibernate.dialect", env.getProperty("hibernate.dialect"));

		factoryBean.setHibernateProperties(props);

		// CORE
		factoryBean.setAnnotatedClasses(WKM_USER.class, WKM_ROLE.class, WKM_COMPANY.class, WKM_OPTION.class,
				WKR_ROLE_OPTION.class, WKR_USER_ROLE.class);

		return factoryBean;
	}

	@Bean
	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(getSessionFactory().getObject());
		return transactionManager;
	}
}
