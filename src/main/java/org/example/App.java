package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        CustomDoublyLinkList customDoublyLinkList = new CustomDoublyLinkList();

        customDoublyLinkList.add(5);
        customDoublyLinkList.add(7);
        customDoublyLinkList.add(9);
        customDoublyLinkList.add(11);

        customDoublyLinkList.print();
        customDoublyLinkList.remove(7);
        customDoublyLinkList.print();

    }

}
