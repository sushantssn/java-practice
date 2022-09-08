package org.example;


class Parent{

    Parent(){
        System.out.println("Parent class constructor");
    }
    public void walk(){
        System.out.println("Parent class walk method");
    }
    public void run(){
        System.out.println("Parent class run method");
    }
}

class Child extends Parent{

    Child(){
        System.out.println("Child class constructor");
    }
    public void walk(){
        super.walk();
        System.out.println("Child class walk method");
    }
    public void run(){
        System.out.println("Child class run method");
        super.run();

    }

}

public class ParentChildFlow {

    public static void main(String[] args) {
        Parent p = new Child();
        p.run();

    }
}
