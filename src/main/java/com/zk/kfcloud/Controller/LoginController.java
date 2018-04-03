package com.zk.kfcloud.Controller;

import com.zk.kfcloud.Entity.web.User;
import com.zk.kfcloud.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String Brother(){
        log.info("欢迎来到登陆页面");

        return  null;
    }
}
