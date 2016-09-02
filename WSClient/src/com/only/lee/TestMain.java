package com.only.lee;

import org.junit.Test;

/**
 * Created by Administrator on 2016/4/18.
 */
public class TestMain {

    @Test
    public void test2() {
        String pass = "Aaaas2@";
        /**
         * 特殊字符
         */
        String regEx1 = "^[`~!@#$%^&*()+=|{}':;',.<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]{1,}$";

        String regEx2 = "^[0-9]{1,}$";
        String regEx3 = "^[a-z]{1,}$";
        String regEx4 = "^[A-Z]{1,}$";
        int i = 0;
        if( pass.matches(regEx1)) i++;
        if( pass.matches(regEx2)) i++;
        if( pass.matches(regEx3)) i++;
        if( pass.matches(regEx4)) i++;

        System.out.println(i);
    }
}
