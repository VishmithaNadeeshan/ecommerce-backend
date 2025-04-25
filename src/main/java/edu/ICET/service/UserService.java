package edu.ICET.service;

import edu.ICET.dto.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    User searchUser(Integer id);
    void updateUser(User user);
    void deleteUser(Integer id);
    List<User>getAll();
}
