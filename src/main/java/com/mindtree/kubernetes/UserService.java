package com.mindtree.kubernetes;

import java.util.List;
import java.util.Optional;



public interface UserService {
	public String addUser(Users uDto) ;
	public String addUser2(Users uDto);

	public List<Users> findAllUsers();



	Optional<Users> getUser(String email);

	String updateUser(Users user);

}
