package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIFilterCollectExample {


    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();

        inputList.add(10);
        inputList.add(20);
        inputList.add(30);
        inputList.add(40);
        inputList.add(5);
        inputList.add(15);
        inputList.add(25);
        inputList.add(35);
        inputList.add(45);

        List<Integer> outputList = inputList.stream().filter(I->I%5==0).collect(Collectors.toList());
        System.out.println(outputList);
    }
}
