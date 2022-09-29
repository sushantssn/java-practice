package org.example.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MissingNumber1to100 {

    public static void main(String[] args) {

        List arrayList = Arrays.asList(1,2,3,4,5,6,7,8,10,11,12,13,14,16,17,20,23,25,26,27,28,30,31,32,34,35,37,38,39,40);
        ArrayList outputArrayList = new ArrayList();

        IntStream.range(0,100).forEach(value -> {if(!arrayList.contains(value)){
            //System.out.println(value);
            outputArrayList.add(value);
        }});

        System.out.println("Missing numbers in given array is "+outputArrayList);
    }

}
