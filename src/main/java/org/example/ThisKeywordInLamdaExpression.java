package org.example;
@FunctionalInterface
interface Interf {
    public void m1();
        }

public class ThisKeywordInLamdaExpression {
    int x = 100;
    public void m2(){

        Interf f = () ->{
            System.out.println("Inside Lambda excpression");
            int x = 200;
            System.out.println(this.x);//This keyword in lambda expression always will point to the class level variable
        };
        f.m1();
    }
    public static void main(String[] args) {
        ThisKeywordInLamdaExpression thisKeywordInLamdaExpression = new ThisKeywordInLamdaExpression();
        thisKeywordInLamdaExpression.m2();
    }

}
