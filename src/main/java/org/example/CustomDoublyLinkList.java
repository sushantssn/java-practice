package org.example;

public class CustomDoublyLinkList<E> {

    private Node headNode;
    private Node tailNode;
    public int count;

    private static class Node <E>{

        private E data;
        private Node preNode;
        private Node nextNode;

        Node (E data){
            this.data = data;
        }

    }

    public void add(E data){
        if(headNode == null){
            headNode = new Node(data);
            ++count;
            return;
        }else{
            if(tailNode==null){
                tailNode = new Node(data);
                tailNode.preNode = headNode;
                headNode.nextNode = tailNode;
                ++count;
                return;
            }else{
                Node tempNode = new Node(data);

                tempNode.preNode = tailNode;
                tailNode.nextNode=tempNode;
                tailNode=tempNode;
                ++count;
                return;
            }
        }

    }
    public int length(){
        return this.count;
    }


    public void print (){
        if(headNode == null){
            System.err.print("Error trying to print empty linkedList");
        }
        else {
            if (tailNode == null) {
                System.out.println(headNode.data);
            } else {
                Node tempNode = headNode;
                do {
                    System.out.println(tempNode.data);
                    tempNode = tempNode.nextNode;
                } while (tempNode.nextNode != null);
                System.out.println(tempNode.data);
            }
        }
    }

    public void remove(E data){
        if(headNode == null && tailNode == null){
            System.err.print("Error trying to print empty linkedList");
        }
        else {
            if (tailNode == null) {
                this.headNode = null;
                return;
            } else {
                Node tempNode = headNode;
                do {
                    if(tempNode.data == data){
                        Node preNode = tempNode.preNode;
                        if(tempNode == tailNode){
                            tempNode.preNode.nextNode=null;
                        }
                        preNode.nextNode = tempNode.nextNode;
                        return;
                    }
                    tempNode = tempNode.nextNode;
                } while (tempNode.nextNode != null);
            }
        }
    }

}
