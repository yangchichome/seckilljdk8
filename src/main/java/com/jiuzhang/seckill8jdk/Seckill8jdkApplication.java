package com.jiuzhang.seckill8jdk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.jiuzhang.seckill8jdk.db.mappers")
@ComponentScan(basePackages = {"com.jiuzhang"})
public class Seckill8jdkApplication {

    public static void main(String[] args) {
        SpringApplication.run(Seckill8jdkApplication.class, args);
    }

}
