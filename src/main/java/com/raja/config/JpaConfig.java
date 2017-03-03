package com.raja.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan(basePackages="com.raja.model")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages= "com.raja")
public class JpaConfig {

}
