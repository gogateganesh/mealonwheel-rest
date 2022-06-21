package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Menu;
import com.example.demo.entities.ServiceProvider;
import com.example.demo.repositories.MenuRepo;

@Service
public class MenuService 
{
	@Autowired
	MenuRepo menuRepo;
	
	
	public List<Menu> getAllMenu()
	{
		return menuRepo.findAll();
	}
	
	public Menu save(Menu menu)
	{
		return menuRepo.save(menu);
	}
	
	public Menu getMenuById(int id)
	{
		return menuRepo.getMenuById(id);
	}
	
	public Menu getMyMenu(ServiceProvider serProvider)
	{
		return menuRepo.getMyMenu(serProvider);
	}
	
	public void delete(int menuid)
	{
		menuRepo.deleteById(menuid);
	}
	
}
