package com.lagou.edu.testDefaultProxyMode;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Kit on 2021/1/12 11:58
 */
@Component
@Aspect
public class UserServiceAspect {
	@Before("execution(* com.lagou.edu.testDefaultProxyMode.UserService.work(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("UserServiceAspect.....()");
	}

}
