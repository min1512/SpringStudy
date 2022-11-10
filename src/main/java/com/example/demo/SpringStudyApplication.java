package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.demo.DIExample.MyCats;


@SpringBootApplication
public class SpringStudyApplication {

	public static void main(String[] args) {
		
		//bean을 설정한 xml파일이 있는 위치 지정
		String configLocation = "classpath:applicationContext.xml";
		
		//지정한 위치를 참고하여 설정파일을 얻어옴
		AbstractApplicationContext ctx =  new GenericXmlApplicationContext(configLocation);
		
		//설정파일에서 bean을 가져옴
		//getBean()를 이용해서 MyCats타입에서 myCats를 얻어와서 객체를 생성 
		// = 방법1 예제처럼 직접 생성이 아닌 외부에서 얻어옴(주입을 시켜줌)
		MyCats myCat = ctx.getBean("myCats",MyCats.class);
		
		myCat.catsNameInfo();
		myCat.catsAgeInfo();
		
		SpringApplication.run(SpringStudyApplication.class, args);
	}

}
