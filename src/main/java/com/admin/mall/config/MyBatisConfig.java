package com.admin.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * @author Lyy
 * mybatis配置类
 * @date 2020/12/19 13:49
 **/
@Configurable
@MapperScan("com.admin.mall.mbg.mapper")
public class MyBatisConfig {
}
