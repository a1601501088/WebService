package com.only.service.impl;

import com.only.domain.Cat;
import com.only.domain.User;
import com.only.service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/15.
 */
public class UserServiceImpl implements UserService {
    static Map<User,List<Cat>> catDB = new HashMap<User,List<Cat>>();
    static {
        List<Cat> cats1 = new ArrayList<Cat>();
        cats1.add(new Cat("1","白猫","white"));
        cats1.add(new Cat("2","红猫","red"));
        catDB.put(new User("1","user2","北京","1234"),cats1);

        List<Cat> cats2 = new ArrayList<Cat>();
        cats2.add(new Cat("3","黑猫","black"));
        cats2.add(new Cat("4","绿猫","green"));
        catDB.put(new User("1","user1","北京","123"),cats2);
    }


    @Override
    public List<Cat> getCatsByUser(User user) {
        return  catDB.get(user);
    }

    @Override
    public Map<String, Cat> getAllCats() {
        int j = 1;
        Map<String, Cat> map = new HashMap<String, Cat>();
        for (List<Cat> cats :catDB.values()){
            int size = cats.size();
            for (int i = 0;i<size;i++){
                map.put("第"+ j++ +"个",cats.get(i));
            }
        }

        return map;
    }
}
