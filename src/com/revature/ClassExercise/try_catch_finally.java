package com.revature.ClassExercise;
//Program with try and catch & finally block
public class try_catch_finally {
    public static void main(String[] args) {
        try {

            int i = 7;
            int j = 0; //try it also with 3

            //try{
            int k = i / j;

            System.out.println("output is " + k);
        } catch (ArithmeticException e) {
            System.out.println("Error ");

        } finally
        {
            System.out.println("Bye");

        }

    }
}
