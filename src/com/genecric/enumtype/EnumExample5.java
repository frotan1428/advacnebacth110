package com.genecric.enumtype;

public class EnumExample5 {

    public static void main(String[] args) {

            day day= com.genecric.enumtype.day.TUESDAY;

            switch (day){
                case SUNDAY :
                    System.out.println("sunday");

                break;
                case MONDAY:
                    System.out.println("Monday");
                    break;
                case SATURDAY:
                    System.out.println("saturday");
                    break;
                case FRIDAY:
                    System.out.println("friday");
                    break;
                case WEDNESDAY:
                    System.out.println("Wednesday");
                    break;
                case TUESDAY:
                    System.out.println("Tuesday");
                    break;
                case THURSDAY:
                    System.out.println("Thursday");
                    break;


            }


    }
}
