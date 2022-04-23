package org.example;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample implements Runnable {

    static ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap();
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
map.put(103,"C");
        System.out.println("Child Thread trying to modify the map");
    }

    public static void main(String[] args) {

        map.put(101,"A");
        map.put(102,"B");
        Thread t = new Thread(new ConcurrentHashMapExample ());
        t.start();

        Set entrySet = map.entrySet();

        Iterator itr = entrySet.iterator();

        while (itr.hasNext()){
            Integer integer = (Integer) itr.next();
            System.out.println(" Current Itteration is for key "+integer+" and value for the same is "+map.get(integer));
        }

    }

}
