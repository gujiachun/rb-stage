package com.rainbow.stage.rb.uc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rainbow.stage.rb.common.handler.GlobalExceptionHandler;

/**
 * Created by ace on 2017/9/10.
 */
@Configuration
public class WebConfig {

    @Bean
    public GlobalExceptionHandler getGlobalExceptionHandler(){
        return new GlobalExceptionHandler();
    }

}
