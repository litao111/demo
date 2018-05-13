package com.demo.DAO.Impl;

import com.demo.Bean.User;
import com.demo.DAO.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

/**
 * Created by hasee on 2018/5/8.
 */
@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public boolean saveUser(User user) {
        try{
            mongoTemplate.save(user);
            return true;
        }catch (Exception ex){
            return false;
        }
    }

    @Override
    public User findUser(String loginName, String passWord) {
        Query query=new Query();
        Criteria criteria=Criteria.where("loginName").is(loginName).and("passWord").is(passWord);
        query.addCriteria(criteria);
        User user =  mongoTemplate.findOne(query,User.class);
        return user;
    }
}
