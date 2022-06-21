package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Menu;
import com.example.demo.entities.ServiceProvider;
import com.example.demo.repositories.ServiceProviderRepo;
import com.example.demo.services.MenuService;

@RestController
@CrossOrigin(origins = {"http://localhost:3000","http://localhost:80"})
public class MenuController 
{
	@Autowired
	MenuService menuService;
	
	@Autowired
	ServiceProviderRepo serviceProviderRepo;
	
	@GetMapping("/menus") //end point to get all the menu items
	public List<Menu> menus()
	{
		return menuService.getAllMenu();
	}
	
	@PostMapping("/addmenu") //to get menu by service providersid
	public Menu addmenu(@RequestBody Menu menu) 
	{
		System.out.println(menu);
	    return menuService.save(menu);
	}
	
	@GetMapping("/menu/{menuid}")
	public Menu getOneMenu(@PathVariable(value="menuid")int menuid)
	{
		return menuService.getMenuById(menuid);
	}
	
	@PostMapping("/mymenu") //to get menu by serviceprovidersid	
	public Menu mymenu(@RequestBody ServiceProvider  serProvider) 
	{
	    return menuService.getMyMenu(serProvider);
	}
	
	@PostMapping("/update") //delete and update
	public Menu update(@RequestBody Menu menu) 
	{	
		menuService.delete(menu.getMenuid());
		return menuService.save(menu);
	}
	
}
