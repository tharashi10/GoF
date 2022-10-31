package com.ocs.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ocs.sample.dao.UserDao;
import com.ocs.sample.entity.User;

// Serviceは基本的にTransaction管理のイメージ
// ServiceClassに付与するアノテーション
@Service
// 例外発生時に自動でRollbackしてくれる
@Transactional
public class UserService {
    private final UserDao dao;

    @Autowired
    public UserService(UserDao dao){
        this.dao = dao;
    }

    public List<User> getAll(){
        return dao.getAll();
    }
}
