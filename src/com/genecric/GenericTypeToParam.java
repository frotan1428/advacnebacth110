package com.genecric;

public class GenericTypeToParam<S,U> {


    private S s;

    private U u;

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }
    // parameter Cons.


    public GenericTypeToParam(S s, U u) {
        this.s = s;
        this.u = u;
    }

    public static void main(String[] args) {


        GenericTypeToParam<String , Integer> obj1= new GenericTypeToParam<>("Ali",12);
        System.out.println(obj1.getU());

        GenericTypeToParam<Integer , String> obj2= new GenericTypeToParam<>(90,"MathGrade");
        System.out.println(obj2.getS());
    }
}
