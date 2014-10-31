package com.fishing.sardine.dao;

import com.fishing.sardine.entity.User;

/**
 * Created by weijian on 2014/10/29.
 */
public interface UserDaoI {

    public User findByUsername(String username);
    public boolean updateUser(User user);
    public boolean deleteUser(User user);
}
