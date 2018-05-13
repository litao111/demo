package com.demo.DAO;

import com.demo.Bean.User;

/**
 * Created by hasee on 2018/5/8.
 */
public interface UserDao {
    public boolean saveUser(User user);
    public User findUser(String loginName,String passWord);
}
