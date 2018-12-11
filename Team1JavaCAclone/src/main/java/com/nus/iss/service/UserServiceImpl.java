package com.nus.iss.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nus.iss.model.CapsUser;
import com.nus.iss.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserRepository userRepository;

	@Override
	public CapsUser authenticate(String uid, String pwd) {

		CapsUser u1 = null;

		try {
			u1 = userRepository.findUserByNamePwd(uid, pwd);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return u1;
	}

	@Override
	public CapsUser getUser(String id) {
		CapsUser u1 = null;
		try {
			u1 = userRepository.findById(id).get();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return u1;
	}
}
