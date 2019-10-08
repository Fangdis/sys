package com.fangdi.sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fangdi.sys.mapper")
public class SysServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SysServerApplication.class, args);
	}

}
