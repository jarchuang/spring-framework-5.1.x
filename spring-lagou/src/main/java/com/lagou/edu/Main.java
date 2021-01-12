package com.lagou.edu;

import com.lagou.edu.testDefaultProxyMode.IUserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Kit on 2021/1/12 12:01
 * 用于测试springAop中默认代码模式
 */
@EnableAspectJAutoProxy
@ComponentScan
@Configuration
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		context.start();
		IUserService bean = context.getBean(IUserService.class);
		bean.work();
	}
}
