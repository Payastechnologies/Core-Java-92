package com.payasTech.lang;

public class langObjectToString extends Object {
    public static void main(String[] args) {
        langObjectToString l= new langObjectToString();
        System.out.println(l);//object hascode
    }

    @Override
    public String toString() {
        return "hello";
    }
}
