package com.genecric;

public class NoGenericType {


    private Object o;

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    @Override
    public String toString() {
        return "NoGenericType{" +
                "o=" + o +
                '}';
    }

    public static void main(String[] args) {


        NoGenericType obj= new NoGenericType();
        //obj.setO("ALi");
        obj.setO("123");


        System.out.println(obj.getO());
        System.out.println(obj.getO());

        String str= (String) obj.getO();
      //  System.out.println(str);// Run time exception

        int num= Integer.parseInt(String.valueOf(obj.getO()));// parse --> change String number inti Number

        System.out.println(num);
    }
}
