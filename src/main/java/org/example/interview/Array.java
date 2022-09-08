package org.example.interview;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

                // Write your code here
                Scanner s = new Scanner(System.in);
                int arrlength = Integer.parseInt(s.nextLine());

                int [] array = new int [arrlength];
                String [] inputArray = s.nextLine().split(" ");
                for(int i=0;i<inputArray.length;i++){
                    array[i]=Integer.parseInt(inputArray[i]);
                }
        Arrays.stream(array).forEach(value -> System.out.println(value));
                int numbOfQueries = Integer.parseInt(s.nextLine());

                while (numbOfQueries>0)
                {
                    int lower = Integer.parseInt(s.nextLine());
                    int higher = Integer.parseInt(s.nextLine());
                    System.out.println("lower = "+lower+" higher = "+higher);

                    if(!(lower==higher)){
                        int newArrayLength = higher-lower+1;
                        int [] subArray = new int [newArrayLength];
                        int i =0;
                        for (int j=lower-1;j<higher;j++)
                        {
                            subArray[i]= array[j];
                            i++;
                        }
                        Arrays.sort(subArray);
                        Arrays.stream(subArray).forEach(value -> System.out.println(value));
                        if(subArray.length%2==0) {
                        int median = (int) Math.round((subArray.length / 2));
                        System.out.println("Celli value" + subArray.length / 2);
                        System.out.println("Median value = " + median);

                        System.out.println(subArray[median -1]);
                        numbOfQueries=numbOfQueries-1;
                        }else {
                        int median = (int) Math.round((subArray.length / 2));
                        System.out.println("Celli value" + subArray.length / 2);
                        System.out.println("Median value = " + median + 1);

                        System.out.println(subArray[median]);
                            numbOfQueries=numbOfQueries-1;
}
                    }else{
                        System.out.println(array[lower-1]);
                        numbOfQueries=numbOfQueries-1;
                    }



                }

            }
        }
