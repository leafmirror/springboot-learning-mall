package com.leafmirror.malllearning.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan({"com.leafmirror.malllearning.mapper", "com.leafmirror.malllearning.dao"})
public class MyBatisConfig {
}
