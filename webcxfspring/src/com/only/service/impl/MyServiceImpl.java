package com.only.service.impl;

import com.only.HelloWord;
import com.only.impl.HelloWordImpl;
import com.only.service.MyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/4/21.
 */
@Service("myService")
public class MyServiceImpl implements MyService{
    HelloWordImpl helloWord ;

    @Resource
    public void setHelloWord(HelloWordImpl helloWord) {
        this.helloWord = helloWord;
    }

    @Override
    public String excute() throws Exception {
        HelloWord helloWordImplPort = helloWord.getHelloWordImplPort();

        return helloWordImplPort.saHi("ccc");
    }
}
