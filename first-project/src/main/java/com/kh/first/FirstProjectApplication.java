package com.kh.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* 스프링부트는 main 메소드가 선언 된 클래스를 기준으로 실행 */
@SpringBootApplication
/* @SpringBootApplication 어노테이션은 스프링부트의 가장 기본적인 설정을 선언
 * - @ComponentScan : @Component, @Configuration, @Service, @Repository, @Controller, @RestController
 * 					  등의 어노테이션을 스캔하여 bean으로 등록해주는 어노테이션
 * - @EnabledAutoConfiguration : 사전에 정의한 라이브러리들을 bean으로 등록해주는 어노테이션 */
public class FirstProjectApplication {

	/* resources
	 *  ㄴ static : content directory (css, js, image)
	 *  ㄴ templates : thymeleaf (HTML)
	 *  ㄴ application.properties : 스프링부트가 애플리케이션을 구동할 때 자동으로 로딩하는 설정 파일 */
	
	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	
	
	
	
	
	}

}
