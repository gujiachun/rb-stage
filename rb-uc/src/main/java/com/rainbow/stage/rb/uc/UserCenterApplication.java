package com.rainbow.stage.rb.uc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.rainbow.stage.rb.uc.mapper")
@EnableTransactionManagement
public class UserCenterApplication 
{
	public static void main(String[] args) {
        SpringApplication.run(UserCenterApplication.class, args);
    }
}
