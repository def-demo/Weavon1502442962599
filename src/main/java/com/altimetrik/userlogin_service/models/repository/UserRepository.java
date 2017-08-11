package com.altimetrik.userlogin_service.models.repository;

import com.altimetrik.userlogin_service.models.*;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}



