package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import model.User;
import repository.UserDAO;

@Service
public class UserService {

    @Autowired
    private UserDAO dao;

    public void join(User user){
        System.out.println("Service 실행됨");

        String enc = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        user.setPassword(enc);

        dao.insert(user);
    }

    public User login(User user){

        String enc = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        user.setPassword(enc);

        return dao.login(user);
    }
}