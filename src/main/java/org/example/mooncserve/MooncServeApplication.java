package org.example.mooncserve;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.example.mooncserve.mapper")
public class MooncServeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MooncServeApplication.class, args);
    }

}
