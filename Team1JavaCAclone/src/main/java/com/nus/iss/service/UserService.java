package com.nus.iss.service;

import org.springframework.stereotype.Service;

import com.nus.iss.model.CapsUser;

@Service
public interface UserService {

	CapsUser getUser(String id);
	CapsUser authenticate(String uid, String pwd);
}
