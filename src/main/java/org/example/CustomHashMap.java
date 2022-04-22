package org.example;

import java.util.concurrent.ConcurrentHashMap;

public class CustomHashMap <K,V>{

    private static int initial_capacity = 16;
    private Entry[] table;
    private int index;
    private int hash;

    private static class Entry<K,V>{

        private K key;
        private V value;
       private Entry<K,V> next;

        Entry(K key, V value,Entry<K,V> next){
            this.key = key;
            this.value=value;
            this.next = next;
        }


    }

    public V put (K key, V value){

        return value;

    }

   public  CustomHashMap()
    {
        this.table = new Entry[initial_capacity];
    }

    public CustomHashMap(int capcity)
    {
        this.table = new Entry[capcity];
    }



}
