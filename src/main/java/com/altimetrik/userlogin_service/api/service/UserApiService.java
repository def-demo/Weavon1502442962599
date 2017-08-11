package com.altimetrik.userlogin_service.api.service;

import com.altimetrik.userlogin_service.models.User;


import com.altimetrik.userlogin_service.exception.NotFoundException;
import java.util.List;

public interface UserApiService {
  
      List<User> findAllUser()
      throws NotFoundException;
  
      User updateUser(User user)
      throws NotFoundException;
  
      User addUser(User user)
      throws NotFoundException;
  
      User findByIdUser(Long id)
      throws NotFoundException;
  
      void deleteUser(Long id)
      throws NotFoundException;
  
}

