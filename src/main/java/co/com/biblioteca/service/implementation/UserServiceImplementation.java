package co.com.biblioteca.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.biblioteca.entity.UserEntity;
import co.com.biblioteca.repository.UserRepository;
import co.com.biblioteca.service.UserService;

@Service
public class UserServiceImplementation implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserEntity> findAll() {		
		return userRepository.findAll();
	}

	@Override
	public UserEntity findByid(Integer id) {		
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public void create(UserEntity userEntity) {			
		userRepository.save(userEntity);	
	}
	
		
	

	@Override
	public void delete(Integer id) {
		if(findByid(id)!=null) {
			userRepository.delete(findByid(id));			
		}
		
	}

	@Override
	public void update(UserEntity userEntity) {
		if(findByid(userEntity.getId())!=null) {
			userRepository.save(userEntity);			
		}
		
	}

}
