package org.example;

import java.util.function.Function;

public class FuntionExample {


    public static void main(String[] args) {


        Function <String,Integer> f = s -> s.length();

        System.out.println(f.apply("Sushant"));
    }
}
