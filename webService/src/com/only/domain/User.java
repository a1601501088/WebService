package com.only.domain;

/**
 * Created by Administrator on 2016/4/15.
 */
public class User {

    private String id;
    private String name;
    private String adress;
    private String pass;

    public User() {
    }

    public User(String id, String name, String adress, String pass) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!name.equals(user.name)) return false;
        return pass.equals(user.pass);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + pass.hashCode();
        return result;
    }
}
