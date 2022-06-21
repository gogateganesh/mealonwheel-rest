package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Login;

@Repository
public interface Loginrepo extends JpaRepository<Login, Integer> {
	
	@Query("select l from Login l where l.username = :username and l.password = :password")
	public Login checkLogin(String username,String password);
	
	@Transactional
	@Modifying
	@Query("update Login set password = :newpassword where username = :username and password = :oldpassword")
	public int changePassword(String username,String oldpassword,String newpassword);
	
}
