package com.mindtree.kubernetes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.kubernetes.Users;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepositoryImpl userrepo;
	
	@Transactional
	public List<Users> findAllUsers() {

		List<Users> users = userrepo.findAllusers();
		List<Users> userList = new ArrayList<>();
		if (!users.isEmpty()) {
			for (Users u : users) {
				Users udto = new Users();
				udto.setName(u.getName());
				udto.setPassword(u.getPassword());
				udto.setEmail(u.getEmail());
				udto.setMobile(u.getMobile());
				userList.add(udto);
			}
		}
		return userList;
	}
	@Transactional
	public String addUser(Users uDto) {
		Users u = new Users();
		u.setName(uDto.getName());
		u.setEmail(uDto.getEmail());
		u.setMobile(uDto.getMobile());
		u.setPassword(uDto.getPassword());
		return "added";
	}
	@Override
	public String addUser2(Users uDto) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<Users> getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String updateUser(Users user) {
		// TODO Auto-generated method stub
		return null;
	}
}
