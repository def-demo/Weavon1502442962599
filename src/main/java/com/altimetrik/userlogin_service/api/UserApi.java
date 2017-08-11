package com.altimetrik.userlogin_service.api;

import com.altimetrik.userlogin_service.models.*;

import com.altimetrik.userlogin_service.api.service.UserApiService;

import com.altimetrik.userlogin_service.exception.NotFoundException;

import com.altimetrik.userlogin_service.models.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/api" )

public class UserApi {

   @Autowired
   private UserApiService service;
  

  @RequestMapping(value = "/user", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<User>> findAllUser()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<User>>(service.findAllUser(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/user", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< User> updateUser(@RequestBody User user
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<User>(service.updateUser(user), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/user", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< User> addUser(@RequestBody User user
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<User>(service.addUser(user), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/user/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< User> findByIdUser(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<User>(service.findByIdUser(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/user/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteUser(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteUser(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

