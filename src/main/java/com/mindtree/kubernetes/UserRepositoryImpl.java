package com.mindtree.kubernetes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindtree.kubernetes.Users;
import com.mindtree.kubernetes.UserRepository;

@Service
public class UserRepositoryImpl {
	@Autowired
	UserRepository userRepo;

	public List<Users> findAllusers() {

		return (List<Users>) userRepo.findAll();
	}

	public String addUser(Users u) {
		userRepo.save(u);
		return "added success";
		

	}


	public String addUser2(Users u) {
		userRepo.save(u);
		return "added success";
	}

	public Optional<Users> getUser(String email) {
		return userRepo.findById(email);
	}

	public String updateUser(Users user) {

		userRepo.save(user);
		return "updated";
	}
}
