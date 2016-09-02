package com.only.lee;


import com.only.*;
import com.only.auth.AddHeaderInterceptor;
import com.only.impl.HelloWordImpl;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

import java.util.List;

/**
 * Created by Administrator on 2016/4/15.
 */
public class WSClientMain {
    public static void main(String... args) {

        /*
         * 获取 HelloWordImpl 工厂
         */
        HelloWordImpl factroy = new HelloWordImpl();
        /**
         * 用工厂获取 HelloWord 接口
         */
        HelloWord helloWord = factroy.getHelloWordImplPort();

        // 拦截器 ------------ begin ----------------
        /**
         * 获取 客户端的拦截器
         */
        Client client = ClientProxy.getClient(helloWord);
        /**
         * 客户端添加 In拦截器
         */
       // client.getInInterceptors().add(new LoggingInInterceptor());
        /**
         * 客户端添加 Out拦截器
         */
       client.getOutInterceptors().add(new LoggingOutInterceptor());

        /**
         * 自定义 Out拦截器, 给SoapMessage中的header中添加 用户名与密码，用来作权限认证
         *  如果我们的用户名与密码为 "only" 、 "123"
         */
        client.getOutInterceptors().add(new AddHeaderInterceptor("only","123"));
        // 拦截器 ------------ end ----------------


        User user = new User();
        user.setAdress("aaa");
        user.setName("user1");
        user.setPass("123");
        /**
         * 调用 HelloWord 接口中 getCatsByUser(user) 方法
         */
        List<Cat> cats = helloWord.getCatsByUser(user);
        /**
         * 调用 HelloWord 接口中 saHi("陈庚") 方法
         */
        String saHi = helloWord.saHi("陈庚");
        System.out.println(saHi);
        System.out.println(cats.get(1).getName());

        /**
         * 调用 HelloWord 接口中 getAllCats() 方法
         */
        StringCat stringCat = helloWord.getAllCats();
        List<Entry> entrys = stringCat.getEntrys();
        for (Entry e : entrys) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }

    }
}
