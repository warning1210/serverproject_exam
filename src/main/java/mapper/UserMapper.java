package mapper;

import model.User;

public interface UserMapper {
	void insertUser(User user);
    User login(User user);
}