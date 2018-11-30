package com.example.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDAO;
import com.example.model.User;
import com.example.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;
    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    @Override
    public User findById(int id) {
        return this.userDAO.findById(id);
    }
}