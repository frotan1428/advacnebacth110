package com.genecric;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericType<T> {

    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }



    public static void main(String[] args) {

        // create 2 object from different data type

        GenericType<String> obj1= new GenericType<>();

        //inside <> you can put Non-Primitive Data types:

        obj1.setType("ALi Can");

        System.out.println(obj1.getType());
       String str= obj1.getType();
        System.out.println(str);

        GenericType<Integer> obj2= new GenericType<>();// what is your Generic Type you should put that data type

       // obj2.setType("123");// it is give CTE error.

        // how to avoid cast type problem

        GenericType<Integer> obj3= new GenericType<>();

        obj3.setType(15);

        int a= obj3.getType();// it is avoided to from Cast Type because of Generic
        System.out.println(a);

        //how to avoid from CastTypeException

        List<String> list =new ArrayList<>();
        list.add("Ali");// generic  show compile time Error. but non-generic type not show
        list.add("KArim");
        //list.add(12);// avoid classCastException
        System.out.println(list);

        ///
        Map<String,Integer> map=  new HashMap<>();
        map.put("ALi",12);
        //map.put(11,90); it is give error because  generic



    }
}
