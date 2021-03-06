package com.sardine.base.user.service;

import com.sardine.base.user.entity.User;
import com.sardine.base.user.repository.UserRepositoryI;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;


/**
 * 用户服务层实现类，对用户进行逻辑处理
 * Created by weijian on 2014/10/30.
 */
@Service
public class UserServiceImpl implements UserServiceI {

     Logger logger = Logger.getLogger("service");
    @Autowired
    public UserRepositoryI userRepositoryI;

    @Override
    public User findByUsername(String username) {
        return userRepositoryI.findByUsername(username);
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }

    @Override

    public boolean updateUser(User user) {

        return true;
    }
    @Override
    @PreAuthorize("hasRole('ROLE_USER')")
    public boolean test(String test){
        logger.info("-------------------------------------------------------------------------");
        System.out.println("没办法。进入了");
        return false;
    }
}
