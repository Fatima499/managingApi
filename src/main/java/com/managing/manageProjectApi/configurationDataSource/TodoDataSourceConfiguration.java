package com.managing.manageProjectApi.configurationDataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TodoDataSourceConfiguration {

	@Bean
	@ConfigurationProperties("spring.datasource.user")
	public DataSourceProperties userDataSourceProperties() {
		return new DataSourceProperties();
	}
	
	@Bean
	@ConfigurationProperties("spring.datasource.managingapp")
	public DataSourceProperties managingAppDataSourceProperties() {
		return new DataSourceProperties();
	}
}
