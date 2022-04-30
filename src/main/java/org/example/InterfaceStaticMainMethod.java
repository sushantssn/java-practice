package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface InterfaceStaticMainMethod {

    public static void main(String[] args) {
        System.out.println("MyhelloInterface");
        Map displayMap = new HashMap();
        List doneElements = new ArrayList<>();
        int [] Arry = {1,2,3,3,4,4,5,3};
        int count =0;
        int position =0;
        for (int i=0;i<Arry.length;i++){
            int currNumb = Arry[i];
            if(!doneElements.contains(currNumb)) {
                doneElements.add(currNumb);
                for(int j=i+1;j<Arry.length;j++){

                    if(Arry[j] == currNumb){
                        count++;
                        position = j;
                    }
                }
                if(count==1){
                    displayMap.put(currNumb,position);
                }
                count=0;
                position=0;
            }
        }
        System.out.println(displayMap);
    }
}
