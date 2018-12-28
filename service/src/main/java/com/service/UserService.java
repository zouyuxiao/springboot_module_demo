package com.service;

import com.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ${邹} on 2018/12/28.
 * 描述：
 */
@Repository
public interface UserService {
    List<User> list();
}
