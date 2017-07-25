package com.test.mapper;

import com.test.core.utils.TkMapper;
import com.test.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends TkMapper<User> {
}