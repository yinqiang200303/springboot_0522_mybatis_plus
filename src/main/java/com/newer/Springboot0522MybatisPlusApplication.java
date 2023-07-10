package com.newer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.newer.dept.mapper")
@EnableTransactionManagement
public class Springboot0522MybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot0522MybatisPlusApplication.class, args);
    }

}
