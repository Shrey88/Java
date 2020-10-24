package com.oops.abstract_class.example;

public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);

        list.traverse(list.getRoot());

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String [] data = stringData.split(" ");
        for(String s : data){
            list.addITem(new Node(s));
        }

        list.traverse(list.getRoot());
    }
}
