package com.example.backend.Dao;

import com.example.backend.Model.User;

import java.util.UUID;

public interface UserDao {

    //insert users with a given ID into the database
    int insert(UUID user_id, User user);

    //Randomly generate IDs for users without a specified ID
    default int insert(User user) {
        UUID user_id = UUID.randomUUID();

        return insert(user_id, user);
    }
}
