package com.learn.services;

import com.learn.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User("abc","abc","abc@gmail.com"));
        list.add(new User("xyz","xyz","xyz@gmail.com"));
        list.add(new User("pqr","pqr","pqr@gmail.com"));
        list.add(new User("ghi","ghi","ghi@gmail.com"));
        list.add(new User("qwer","qwer","qwer@gmail.com"));
    }

    public List<User> getAllUsers() {
        return list;
    }

    public User getUser(String username){
        return this.list.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
    }

    public User addUser(User user){
        this.list.add(user);
        return user;
    }

}
