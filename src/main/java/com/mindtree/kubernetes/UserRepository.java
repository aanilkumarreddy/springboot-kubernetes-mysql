package com.mindtree.kubernetes;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.kubernetes.Users;

@Repository
public interface UserRepository extends CrudRepository<Users,String>{

	
}