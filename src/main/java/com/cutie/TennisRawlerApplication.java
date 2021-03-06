package com.cutie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.cutie.mapper")//将项目中对应的mapper类的路径加进来就可以了
@ComponentScan(basePackages = "com.cutie.mapper.*")
public class TennisRawlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TennisRawlerApplication.class, args);
	}
}
