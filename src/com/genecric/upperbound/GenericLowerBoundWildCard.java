package com.genecric.upperbound;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericLowerBoundWildCard {

    public static void main(String[] args) {


        List<Object> newList=new ArrayList<>();
         addElements(newList);
        System.out.println(newList);

        List<Number> nb= new ArrayList<>();
        addElements(nb);
        System.out.println(nb);

        //
        List<Double> dl= new ArrayList<>();
       // addElements(dl);// CTE ---> Error
        printElement(new ArrayList<String>());


        List<Integer> list = new ArrayList<>();
       // printElement2(list);

        printElement(list);

        List<Object> objects= new ArrayList<>();
        objects.add("html");
        objects.add("javascript");
        printElement2(objects);






    }

    //generic Integer Parent
    public static void addElements(List< ? super  Integer> list) {

        for (int i = 1; i <=7 ; i++) {
            list.add(i);

        }

    }

    public static void printElement(List<?> listUnKon){


       // listUnKon.add("java");// CTE error give
        for (Object object :listUnKon) {
            System.out.println(object);

        }
    }


    public static void printElement2(List<Object> listUnKon){


         listUnKon.add("java");// CTE error give
        for (Object object :listUnKon) {
            System.out.println(object);

        }
    }



}
