package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Menu;
import com.example.demo.entities.ServiceProvider;

@Repository
public interface MenuRepo extends JpaRepository<Menu, Integer>
{
	@Query("select m from Menu m where m.menuid = :menuid")
	public Menu getMenuById(int menuid);

	@Query("select m from Menu m where m.spid = :spid")
	public Menu getMyMenu(ServiceProvider spid);
	
	
}
