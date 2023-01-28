package com.genecric.upperbound;

public class GenericUpperBound <T extends Number>{

    private T[] numArray;

    public GenericUpperBound(T[] numArray) {
        this.numArray = numArray;
    }


    public  double getAverage(){
        double sum=0;

        for (T t :numArray){
            sum=sum+t.doubleValue();
        }

        double avg= sum/numArray.length;
        return avg;
    }


    public static void main(String[] args) {


        Integer [] array= {2,4,5,6,7,8,9,8};

        GenericUpperBound<Integer> obj1= new GenericUpperBound<>(array);
        System.out.println(obj1.getAverage());

        Double [] array2= {2.5,4.6,5.6,6.7,7.7,8.8,9.9,8.1};

        GenericUpperBound<Double> obj2= new GenericUpperBound<>(array2);
        System.out.println(obj2.getAverage());


        /// ClassCastException.
//        String [] str= {"Java","html","spring booot","hibernate"};
//        GenericUpperBound<String> obj3= new GenericUpperBound<>(str);
//        System.out.println(obj3.getAverage());

    }

}
