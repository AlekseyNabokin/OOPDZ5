package service;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> users = new ArrayList<>();

    public void createUser(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }
}