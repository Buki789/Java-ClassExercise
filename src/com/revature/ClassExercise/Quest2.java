package com.revature.ClassExercise;
//Write a Java program to iterate through all elements in a linked list.
import java.util.ArrayList;
import java.util.Iterator;

public class Quest2 {

    public static void main(String[] args) {
            ArrayList<String> dolls=  new ArrayList<>();
            dolls.add("barbie");
            dolls.add("pink");
            dolls.add("bronze");

            // iterator
            Iterator iterator = dolls.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }

            // for-each
            System.out.println("-------------------");
            for(String name: dolls){
                System.out.println(name);
            }

            // for
            System.out.println("-------------------");
            for(int i=0;i< dolls.size(); i++){
                System.out.println(dolls.get(i));
            }

            // for_each
            System.out.println("-------------------");
            dolls.forEach(name -> System.out.println(name));
        }
    }


