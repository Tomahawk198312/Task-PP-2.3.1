package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    void removeUserById(int id);

    User getUserById(int id);

    void updateUser(User user);

    List<User> getAllUsers();
}