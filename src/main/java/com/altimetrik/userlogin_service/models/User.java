package com.altimetrik.userlogin_service.models;


import java.util.Objects;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;






@Entity

public class User  {
  
  
   
  
  @Id
   
  
  private Long userId = null;
  
   
   
  
  private String emailId = null;
  
   
   
  
  private String password = null;
  
   
   
  
  private String firstName = null;
  
   
   
  
  private String lastName = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getUserId() {
    return userId;
  }
  public void setUserId(Long userId) {
    this.userId = userId;
  }

  
  /**
   * {}
   **/
  public String getEmailId() {
    return emailId;
  }
  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  
  /**
   * {}
   **/
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * {}
   **/
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * {}
   **/
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(userId, user.userId) &&
        Objects.equals(emailId, user.emailId) &&
        Objects.equals(password, user.password) &&
        Objects.equals(firstName, user.firstName) &&
        Objects.equals(lastName, user.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, emailId, password, firstName, lastName);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  emailId: ").append(emailId).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

