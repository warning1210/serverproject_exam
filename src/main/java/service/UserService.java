package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.User;
import repository.UserDAO;

@Service
public class UserService {

    @Autowired
    private repository.UserDAO dao;

    public void join(User user){
    	System.out.println("Service 실행됨");
        dao.insert(user);
    }

    public User login(User user){
        return dao.login(user);
    }
}