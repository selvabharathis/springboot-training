package com.example.demo.config;

import com.example.demo.controller.model.UserModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public UserModel createUserModel() {
        return new UserModel("selva", "sample title");
    }
}
