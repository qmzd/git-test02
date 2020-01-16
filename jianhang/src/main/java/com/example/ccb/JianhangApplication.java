package com.example.ccb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EntityScan("com.example.ccb.model") // 扫描到要用得实体类
@MapperScan("com.example.ccb.mapper")
public class JianhangApplication {

    public static void main(String[] args) {
        SpringApplication.run(JianhangApplication.class, args);
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("--------------------------建行demo启动成功------------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------");
    }

}
