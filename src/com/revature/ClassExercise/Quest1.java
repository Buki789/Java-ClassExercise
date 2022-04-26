package com.revature.ClassExercise;
//Write a Java program to append the specified element to the end of a linked list.
import java.util.*;

public class Quest1 {

        public static void main(String[] args) {
                ArrayList<String> colors = new ArrayList<>();
                colors.add("brown");
                colors.add("black");
                colors.add("red");
                colors.add("orange");

                // before sorting
                System.out.println("before you sort...");
                for (String color : colors) {
                        System.out.println(color);
                }


                // after sorting
                System.out.println();
                System.out.println("after you sort...");
                Collections.sort(colors);
                Collections.reverse(colors);
                for (String color : colors) {
                        System.out.println(color);
                }

                // list of numbers
                ArrayList<Integer> numbers = new ArrayList<>();
                numbers.add(10);
                numbers.add(5);
                numbers.add(4);
                numbers.add(8);
                numbers.add(9);
                numbers.add(7);
                numbers.add(6);

                // before sort
                System.out.println("before you sort...");
                for (int number : numbers) {
                        System.out.println(number);
                }

                // after sort
                System.out.println("after you sort...");
                Collections.sort(numbers);
                for (int number : numbers) {
                        System.out.println(number);
                }

        }

        public class Quest2 {

                public static void main(String[] args) {
                        ArrayList<String> dolls = new ArrayList<>();
                        dolls.add("barbie");
                        dolls.add("pink");
                        dolls.add("bronze");

                        // iterator
                        Iterator iterator = dolls.iterator();
                        while (iterator.hasNext()) {
                                System.out.println(iterator.next());
                        }

                        // for-each
                        System.out.println("-------------------");
                        for (String name : dolls) {
                                System.out.println(name);
                        }

                        // for
                        System.out.println("-------------------");
                        for (int i = 0; i < dolls.size(); i++) {
                                System.out.println(dolls.get(i));
                        }

                        // for_each
                        System.out.println("-------------------");
                        dolls.forEach(name -> System.out.println(name));
                }
        }

}