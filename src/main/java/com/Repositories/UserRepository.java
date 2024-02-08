package com.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Enteties.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
}
