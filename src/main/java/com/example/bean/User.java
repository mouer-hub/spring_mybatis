package com.example.bean;

public class User {
    private Integer no;
    private String Name;
    private String passWord;

    public Integer getNo() {
        return no;
    }
    public void setNo(Integer no) {
        this.no = no;
    }
    public String getPassWord() {
        return passWord;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "User{" +
                "no=" + no +
                ", Name='" + Name + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}