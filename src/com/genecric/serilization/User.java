package com.genecric.serilization;

import java.io.Serializable;

public class User implements Serializable {


    private Long id;

    private String name;

    private String tcKno;

    public User(Long id, String name, String tcKno) {
        this.id = id;
        this.name = name;
        this.tcKno = tcKno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTcKno() {
        return tcKno;
    }

    public void setTcKno(String tcKno) {
        this.tcKno = tcKno;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tcKno='" + tcKno + '\'' +
                '}';
    }
}
