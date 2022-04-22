package org.example;

import java.util.*;

public class LongestSubstringWithoutRepetition {

    public static void main(String[] args) {
        String input = "aab";
        char [] charArr = input.toCharArray();
        TreeMap treeMap = new TreeMap<>(Collections.reverseOrder());
        int strpoint =0;
        List subStr = new ArrayList();
        int counter =0;
        for(int i=0;i<charArr.length;i++){

                    if(subStr.contains(charArr[i])){
                        treeMap.put(subStr.size(),subStr.toString());
                        subStr.clear();
                        counter++;
                        i=counter-1;
                        continue;
                    }else{
                        subStr.add(charArr[i]);
                    }
        }
        treeMap.put(subStr.size(),subStr.toString());
        System.out.println(treeMap);
        Set set = treeMap.entrySet();
        Iterator i = set.iterator();

        // Traverse map and print elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
            break;
        }
    }
}
