package com.java.proj.spring.dao;

import com.java.proj.spring.model.User;

public interface UserDetailsDAO {
    User findUserByUsername(String username);
}
