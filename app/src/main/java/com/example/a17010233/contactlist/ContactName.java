package com.example.a17010233.contactlist;

/**
 * Created by 17010233 on 24/7/2018.
 */

public class ContactName {
    private String name;
    private int code;
    private int num;

    public ContactName(String name, int code, int num) {
        this.name = name;
        this.code = code;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ContactName{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", num=" + num +
                '}';
    }
}
