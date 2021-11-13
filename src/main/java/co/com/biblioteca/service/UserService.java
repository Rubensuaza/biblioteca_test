package co.com.biblioteca.service;

import java.util.List;

import co.com.biblioteca.entity.UserEntity;

public interface UserService {
	
	List<UserEntity> findAll();
	UserEntity findByid(Integer id);
	void create(UserEntity userEntity);
	void update(UserEntity userEntity);
	void delete(Integer id);
	

}
