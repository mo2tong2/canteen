package com.wdcanteen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //纯前端项目可以添加此注释，避免数据源等问题报错 (exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.wdcanteen.canteen.dao")
public class CanteenApplication {

	public static void main(String[] args) {
		SpringApplication.run(CanteenApplication.class, args);
	}

}
