package com.example.dao.impl;


import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dao.UserDAO;
import com.example.model.User;

@Repository
public class UserDaoImpl implements UserDAO{
    private SessionFactory sessionFactory;
    
    @Autowired 
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public User findById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
		//Query query = session.createQuery("from User where userId = 1");
        //query.setParameter("id", id);
		
		String sql = "SELECT * FROM users";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(User.class);
		User user = (User) query.list().get(0);
        return user;
    }
}