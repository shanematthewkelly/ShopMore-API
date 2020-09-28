package com.example.backend.Service;

import com.example.backend.Dao.UserDao;
import com.example.backend.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    //Calling the interface
    //We can have multiple database types for this interface
    private final UserDao userDao;

    //Injecting into the constructor using @AutoWired
    //This line (19) is responsible for the database platform used, e.g @Qualifier("mongo")
    @Autowired
    public UserService(@Qualifier("fakeDao") UserDao userDao) {
        this.userDao = userDao;
    }

    //Method used for inserting a new User
    public int addUser(User user) {
        //Making a call to the userDao
        return userDao.insert(user);
    }
}
