package com.eta.jkm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
			.allowedOrigins("http://localhost:3000", 
					"http://10.125.121.170:3000", // 이창현
					"http://10.125.121.186:3000", // 이정민
					"http://10.125.121.204:3000", // 금민경 
					"http://10.125.121.173:3000", // 최정인
					"http://10.125.121.203:3000" // 변혁
					);
	}
}
