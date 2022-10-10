package com.ocs.sample.dao;

import java.util.List;

public interface UserDao<User> {
    public List<User> getAll();
    public List<User> getByUserId(String id);
}
