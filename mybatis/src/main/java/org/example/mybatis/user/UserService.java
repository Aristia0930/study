package org.example.mybatis.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    public List<UserDto> selectUsers() {
        return userMapper.selectUsers();
    }
    public UserDto selectUsers(String id) {
        return userMapper.selectOneUsers(id);
    }

    public void insertUser(UserDto users) {
        userMapper.insertUser(users);
    }

    public void updateUser(UserDto user) {
        userMapper.updateUser(user);
    }

    public void delete(String id) {
        userMapper.delete(id);
    }
}


