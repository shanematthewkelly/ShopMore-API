package com.example.backend.Dao;

import com.example.backend.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


//This now allows me to have multiple implementations
@Repository("fakeDao")
public class DatabaseFaker implements UserDao {

    private static List<User> Database = new ArrayList<>();

    //Insert the user's information into the database
    @Override
    public int insert(UUID user_id, User user) {
        Database.add(new User(
                user_id,
                user.getFirstName(),
                user.getLastname(),
                user.getAddress(),
                user.getMobile()
                ));

        //return 1 in order to know that the insertion always works
        return 1;
    }
}
