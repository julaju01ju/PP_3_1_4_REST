package com.example.PP_3_1_4_REST.dao;

import com.example.PP_3_1_4_REST.model.User;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getById(Long id);

    User getByLogin(String email);

    void save(User user);

    void update(User updatedUser);

    void delete(Long id);
}
