package com.zk.kfcloud.Controller;


import com.zk.kfcloud.Dao.UserMapper;
import com.zk.kfcloud.Entity.web.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class testMyBatis {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/findAll")
    List<User> findall(){
        List<User> allUsers = userMapper.findAllUsers();
        log.info("info");
        log.debug("debug");
        log.warn("warn");
        log.error("error");
        return allUsers;
    }
}
