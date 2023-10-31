package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.SeasonFinder;

@SpringBootApplication
public class BootProj01DependencyinjectionApplication {
	
	@Bean("ld")
public LocalDate createdate() {
		
		return LocalDate.now();
		
	}

	public static void main(String[] args) {
		//get ioc container
	ApplicationContext ctx=	SpringApplication.run(BootProj01DependencyinjectionApplication.class, args);
	//get target class Spring bean Object ref
	
	SeasonFinder finder= ctx.getBean("sf",SeasonFinder.class);
	
	String SeasonName= finder.SeasonFinder();
	
	System.out.println("SasonNAme::"+SeasonName);
	
((	ConfigurableApplicationContext)ctx).close();
	
	
	
	}
	

}
