package com.payasTech.lang;

public class StringClassConstructor {

    public static void main(String[] args) {
        // first constructor
        String s= new String("Shwetant");

        //Second constructor
        char[] a= {'s','a'};
        String s2= new String(a);

        // third constructor
        String s3= new String();

        //fourth Constructor
        String s4= new String(new StringBuffer("hello"));
       System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }

}
