package com.lege.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lege
 * @Description
 * @create 2022-06-13 17:20
 */
@Configuration
@MapperScan({"com.lege.mbg.mapper","com.lege.dao"})
public class MyBatisConfig {
}
