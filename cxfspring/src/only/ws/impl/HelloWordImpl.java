package only.ws.impl;


import only.domain.Cat;
import only.domain.User;
import only.service.UserService;
import only.service.impl.UserServiceImpl;
import only.ws.HelloWord;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.jws.WebService;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/11.
 */

@Controller("helloWord")
@WebService(endpointInterface = "only.ws.HelloWord", serviceName = "HelloWordImpl")
public class HelloWordImpl implements HelloWord {

    private UserService userService;
    private UserServiceImpl us;

    @Resource
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String saHi(String s) {
        return s + ",你好" + new Date();
    }
    @Override
    public List<Cat> getCatsByUser(User user) {
        return userService.getCatsByUser(user);
    }

    @Override
    public Map<String, Cat> getAllCats() {
        return userService.getAllCats();
    }


    public void setUs(UserServiceImpl us) {
        this.us = us;
    }

    public UserServiceImpl getUs() {
        return us;
    }
}
