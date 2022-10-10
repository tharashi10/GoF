package com.ocs.sample.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ocs.sample.dao.UserDao;
import com.ocs.sample.entity.User;


public class UserDaoImpl implements UserDao<User>{
    private EntityManager entityManager;
    public UserDaoImpl(){
        super();
    }
    public UserDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
    
    @Override
    @SuppressWarnings("unchecked")
	public List<User> getAll() {
		Query query = entityManager.createQuery("from USERS");
		List<User> list = query.getResultList();
		entityManager.close();
		return list;
	}

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getByUserId(String id) {
        List<User> list = entityManager
        .createQuery("from USERS where id = :id")
        .setParameter("id", id)
		.getResultList();
		return list;
    }
}
