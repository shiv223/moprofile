package com.moprofile.moprofilev1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.moprofile.moprofilev1.config.AppProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class MoprofileV1Application {

	public static void main(String[] args) {
		SpringApplication.run(MoprofileV1Application.class, args);
	}
	
	
	

}
