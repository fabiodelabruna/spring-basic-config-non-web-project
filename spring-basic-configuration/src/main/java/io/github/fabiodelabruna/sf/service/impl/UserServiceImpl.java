package io.github.fabiodelabruna.sf.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import io.github.fabiodelabruna.sf.model.User;
import io.github.fabiodelabruna.sf.service.UserService;

// @Scope("singleton") default do spring
@Scope("prototype")
@Service
public class UserServiceImpl implements UserService {

	@Override
	public void save(User user) {
		System.out.println("Novo usuário: " + user);
	}
	
}
