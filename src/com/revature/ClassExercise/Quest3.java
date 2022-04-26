package com.revature.ClassExercise;

//Write a Java program to iterate through all elements in a linked list starting at the specified position

import java.util.LinkedList;
import java.util.ListIterator;

class Customer{

    public static void main(String[] args) {
        LinkedList<String> glist = new LinkedList<String>();
        glist.add("Cheese");
        glist.add("Honey");

        ListIterator<String> iter = glist.listIterator();

        if (iter.hasNext()) {
            iter.next();
            iter.add("Lettuce");
        }
        for (String item: glist) {
            System.out.println(item+" ");
        }


    }
}
