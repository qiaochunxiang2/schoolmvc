package com.sk.schoolmvc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("sk.sk.schoolmvc.dao")
public class SchoolmvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolmvcApplication.class, args);
    }

}
