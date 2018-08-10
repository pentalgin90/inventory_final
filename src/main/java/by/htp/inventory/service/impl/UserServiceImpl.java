package by.htp.inventory.service.impl;

import by.htp.inventory.service.UserService;
import by.htp.inventory.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void addNewUser(User newUser) {

    }

    @Override
    public User findUser(long idUser) {
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(long idUser) {

    }

    @Override
    public void updateUser(User User, long idUser) {

    }
}
