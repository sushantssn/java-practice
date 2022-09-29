package org.example.interview;

import java.util.*;

public class DuplicateNumberInArray {

    public static void main(String[] args) {

        List arrayList = Arrays.asList(1,2,3,4,5,6,7,8,10,10,12,13,14,16,17,1,23,25,3,27,28,30,5,32,6,35,37,38,39,40);
        Map<Integer,Integer> tempMap = new HashMap<>();
        List<Integer> duplicateIntegers = new ArrayList<>();

        arrayList.stream().forEach(e ->{
        if(!tempMap.containsKey(e)) {
        tempMap.put((int) e, 1);
        }else{
        int count = (int)tempMap.get(e);
            tempMap.put((int)e,count+1);
        }
        });

        tempMap.entrySet().forEach(integerIntegerEntry -> {if(integerIntegerEntry.getValue()>1){
            duplicateIntegers.add(integerIntegerEntry.getKey());
        }});

        System.out.println(duplicateIntegers);

    }
}
