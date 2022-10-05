package com.springbook.restconsumer.Config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients (basePackages = "com.springbook.restconsumer")
public class ProjectConfig {
}
