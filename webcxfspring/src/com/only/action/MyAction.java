package com.only.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/4/21.
 */
@Controller
public class MyAction {

   // @Resource
   // private MyService myService;

    @RequestMapping("/excute1")
    public String excute1(){
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
        /*int a = 1;
        try {
            myService.excute();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        return "index.jsp";
    }
}
