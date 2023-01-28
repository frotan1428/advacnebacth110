package com.genecric.interfac;

public class GenericTypeStringImplement implements GenericTypeInterface<String>{
    @Override
    public void setVoid(String s) {
        s="al";
        System.out.println(s);
    }

    @Override
    public String getValue() {
       return null;
    }
}
