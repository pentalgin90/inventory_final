package by.htp.inventory.config;

import java.util.Properties;

import javax.sql.DataSource;
import javax.transaction.TransactionManager;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PreferencesPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="by.htp.inventory.*")
@PropertySource("classpath:database.properties")
@EnableTransactionManagement
public class AppConfig {
	
	@Value("${jdbc.drivername}")
	private String drivername;
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.password}")
	private String password;
	
	@Value("${hibernate.dialect}")
	private String hibernateDialect;
	
	@Value("${hibernate.format_sql}")
	private String formatSql;
	
	@Value("${hibernate.show_sql}")
	private String showSql;
	
	@Value("${hibernate.creation_policy}")
	private String creationPolicy;
	
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(drivername);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource();
	}
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource());
		sessionFactoryBean.setPackagesToScan("by.htp.inventory.entity");
		sessionFactoryBean.setHibernateProperties(hibernateProperties());
		return sessionFactoryBean;
	}
	
	public Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", hibernateDialect);
		properties.setProperty("hibernate.show_sql", showSql);
		properties.setProperty("hibernate.format_sql", formatSql);
		properties.setProperty("hibernate.hbm2ddl.auto", creationPolicy);
		return properties;
	}
	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory);
		return null;
	}
	@Bean
	public PreferencesPlaceholderConfigurer placeholderConfigurer() {
		return new PreferencesPlaceholderConfigurer();
	}
}
