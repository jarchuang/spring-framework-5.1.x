package com.lagou.edu.testDefaultProxyMode;

import org.springframework.stereotype.Service;

/**
 * Created by Kit on 2021/1/12 11:57
 * e-mail: laijiachuang@corp.netease.com
 */
@Service
public class UserService implements IUserService {
	@Override
	public void work() {
		System.out.println("开始干活...coding...");
	}
}
