package com.example.backend.Api;

import com.example.backend.Model.User;
import com.example.backend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//This class acts as the REST controller
//Create an endpoint for clients to direct to.
@RequestMapping("api/v1/user")
@RestController
public class UserController {

    //Handle on UserService class
    private final UserService userService;

    //Inject the service into this constructor
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //Making this method a Post request - Sending a User to a server.
    @PostMapping
    public void addUser(@RequestBody User user) {
        //make a call to the 'addUser' method within the userService class
        userService.addUser(user);
    }
}
