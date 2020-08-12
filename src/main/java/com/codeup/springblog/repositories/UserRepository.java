package com.codeup.springblog.repositories;

import com.codeup.springblog.models.User;

public interface UserRepository {
    User findByUsername(String username);
}
