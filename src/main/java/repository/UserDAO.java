package repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import mapper.UserMapper;
import model.User;

@Repository
public class UserDAO {

    @Autowired
    private UserMapper mapper;

    public void insert(User user){
        System.out.println("DAO 실행됨");
        mapper.insertUser(user);
    }

    public User login(User user){
        return mapper.login(user);
    }
}