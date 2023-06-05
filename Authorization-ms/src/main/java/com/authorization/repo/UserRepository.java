package com.authorization.repo;

import org.springframework.stereotype.Repository;

import com.authorization.entity.User;

@Repository
public class UserRepository extends JpaRepository<User, Integer> {

		User findByUserName(String username);

}