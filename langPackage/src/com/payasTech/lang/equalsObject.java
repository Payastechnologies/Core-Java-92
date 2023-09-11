package com.payasTech.lang;

public class equalsObject extends Object {

    public static void main(String[] args) {
        equalsObject eq= new equalsObject();
        equalsObject eq1= new equalsObject();
        System.out.println(eq.equals(eq1));
        equalsObject eq2=eq1;
        System.out.println(eq2.equals(eq1));
    }

}
