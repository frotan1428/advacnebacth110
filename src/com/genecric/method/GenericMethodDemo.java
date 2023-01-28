package com.genecric.method;

import java.util.Arrays;

public class GenericMethodDemo {

    public static void main(String[] args) {

        GenericMethodDemo obj1= new GenericMethodDemo();
        Integer[] arr2={1,3,4,5,6,7,8};

        Character [] characters={'a','b','c','d','f','g'};
        obj1.print(arr2);
        obj1.print(characters);
        obj1.Display(arr2);
        obj1.Display(characters);


    }
// non generic method
//    public static void print(Integer [] arr){
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void print(Character [] arr){
//        System.out.println(Arrays.toString(arr));
//    }



    public static <T> void print(T [] element){
        System.out.println(Arrays.toString(element));
    }

    public static <T> void Display(T [] element){
        for (T t : element){
            System.out.print(t + " ");
        }
    }
}
