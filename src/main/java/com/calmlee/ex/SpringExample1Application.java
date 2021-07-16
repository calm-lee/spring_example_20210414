package com.calmlee.ex;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@ComponentScan(basePackages = "com.*")
@SpringBootApplication

public class SpringExample1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringExample1Application.class, args);
	}
	
}