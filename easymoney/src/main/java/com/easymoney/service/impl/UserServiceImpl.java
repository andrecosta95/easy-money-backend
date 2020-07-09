package com.easymoney.service.impl;

import com.easymoney.model.Profile;
import com.easymoney.model.User;
import com.easymoney.repository.UserRepository;
import com.easymoney.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public void deleteById(Long userId) {
        repository.deleteById(userId);
    }

    @Override
    public Optional<User> findById(Long userId) {
        return repository.findById(userId);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

}
