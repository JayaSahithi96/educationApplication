package com.example.demo.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class UserRepository{
    
  public List<User> getUsers(){
    
    ArrayList<User> users = new ArrayList<User>();
    
    User user1 = new User(1, "user1", "Student","Jaya", "Sahithi", "email", "916");
    User user2 = new User(2, "user2", "Instructor","Srinivas", "Nandigam", "email", "9165073602");
    User user3 = new User(3, "user3", "Student","Usha", "Rani", "email", "888");
    users.add(user1);
    users.add(user2);
    users.add(user3);
    return users;                     
}
}