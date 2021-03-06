package com.example.demo.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.UserService;
import com.example.demo.domain.User;

@RestController
public class UserController {
        @Autowired
	 UserService userService;
	
	@GetMapping("/students")
	public List<User> getUsers() {
	    return userService.getUser();
	}
	
	@GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") String id) {
		User user= userService.findUserById(id);
		if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
    	
    }
	@DeleteMapping("/user/{id}")
	public ResponseEntity deleteUser(
	        @PathVariable("id") String id) {
	    userService.deleteUserById(id);
	    return new ResponseEntity(HttpStatus.OK);
	}
	

    @PostMapping("/user")
    public User addNewUsers(@RequestBody User user) {
	
	return userService.addNewUser(user);
}


}
