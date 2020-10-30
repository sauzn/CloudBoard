package com.sauzn.cloudboard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.sauzn.cloudboard.mapper")
@SpringBootApplication
public class CloudboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudboardApplication.class, args);
    }

}
