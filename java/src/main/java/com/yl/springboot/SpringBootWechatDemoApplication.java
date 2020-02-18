package com.yl.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "com.yl.springboot.mapper")
@SpringBootApplication
public class SpringBootWechatDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWechatDemoApplication.class, args);
	}

}
