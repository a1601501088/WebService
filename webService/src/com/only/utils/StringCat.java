package com.only.utils;

import com.only.domain.Cat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/17.
 *
 * 用于web serivce 能识别的类
 *
 */
public class StringCat {

    /**
     *  里面的属性为  key : value  相当于是 Map的 key:value
     */
    public static class Entry{
        private String key;
        private Cat value;


        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Cat getValue() {
            return value;
        }

        public void setValue(Cat value) {
            this.value = value;
        }
    }
    private List<Entry> entrys = new ArrayList<Entry>();

    public List<Entry> getEntrys() {
        return entrys;
    }

    public void setEntrys(List<Entry> entrys) {
        this.entrys = entrys;
    }
}
