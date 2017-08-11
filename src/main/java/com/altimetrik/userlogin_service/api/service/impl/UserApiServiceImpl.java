package com.altimetrik.userlogin_service.api.service.impl;

import com.altimetrik.userlogin_service.api.service.*;
import com.altimetrik.userlogin_service.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.userlogin_service.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.userlogin_service.models.User;


import java.util.List;
import com.altimetrik.userlogin_service.exception.NotFoundException;


@Service
@Transactional
public class UserApiServiceImpl implements UserApiService {
		  	  
	  @Autowired
	
  	  private UserRepository  userRepository ;
	   
  
  
				
			
      @Override
      public List<User> findAllUser()
      throws NotFoundException {
      
        
  		
  		
  			return userRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public User updateUser(User user)
      throws NotFoundException {
      
         
        	return userRepository.save(user);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public User addUser(User user)
      throws NotFoundException {
      
         
        	return userRepository.save(user);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public User findByIdUser(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return userRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteUser(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

