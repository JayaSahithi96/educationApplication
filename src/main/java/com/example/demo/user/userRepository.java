package com.example.demo.user;

import org.springframework.stereotype.Repository;
@Repository
public class UserRepository{
    
  public List<User> getUsres(){
    
    ArrayList<> users = new ArrayList<Users>();
    
    User user1 = new User("user1", "abc",""xyz");
    User user2 = new User("user2", "abc",""xyz");
    User user3 = new User("user3", "abc",""xyz");
    users.add(user1);
    users.add(user2);
    users.add(user3);
    return users;                     
}
