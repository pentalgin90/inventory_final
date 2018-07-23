package by.htp.inventory.dao;

import by.htp.inventory.entity.User;

import java.util.List;

public interface UserDAO {

    //User
    void addNewUser(User newUser);
    User findUser(long idUser);
    List<User> findAllUsers();
    void deleteUser(long idUser);
    void updateUser(User User, long idUser);
}
