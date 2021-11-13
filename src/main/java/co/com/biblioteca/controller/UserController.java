package co.com.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.biblioteca.entity.UserEntity;
import co.com.biblioteca.service.UserService;

@RestController
@RequestMapping("/user/v1")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<UserEntity> finAll(){
		return userService.findAll();		
	}
	
	@GetMapping("/user/{id}")
	public UserEntity findById(@PathVariable Integer id) {
		return userService.findByid(id);
	}
	
	@PostMapping("/create")
	public void create(@RequestBody UserEntity user) {
		userService.create(user);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody UserEntity user) {
		userService.update(user);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		userService.delete(id);
	}
	

}
