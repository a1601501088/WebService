package com.only.impl;

import com.only.HelloWord;
import com.only.domain.Cat;
import com.only.domain.User;
import com.only.service.UserService;
import com.only.service.impl.UserServiceImpl;

import javax.jws.WebService;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/11.
 */
@WebService(endpointInterface = "com.only.HelloWord", serviceName = "HelloWordImpl")
public class HelloWordImpl implements HelloWord {

    public String saHi(String s) {
        return s + ",你好" + new Date();
    }
    @Override
    public List<Cat> getCatsByUser(User user) {
        UserService userService = new UserServiceImpl();
        return userService.getCatsByUser(user);
    }

    @Override
    public Map<String, Cat> getAllCats() {
        UserService userService = new UserServiceImpl();
        return userService.getAllCats();
    }


}
