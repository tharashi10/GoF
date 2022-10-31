package com.ocs.sample.dao;

import java.util.List;

import com.ocs.sample.entity.User;

public interface UserDao {
    public List<User> getAll();
    //public List<User> getByUserId(String id);
}
