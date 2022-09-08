package org.example.StringClass;

public class StringPractice {

    public static void main(String[] args) {

        String s = "Sushant";

        String s2 = "Sushant";
        String s1 = new String("Sushant");
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        System.out.println(s.hashCode() == s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        Object o = new Object();
        System.out.println(o.hashCode());

    }

}
