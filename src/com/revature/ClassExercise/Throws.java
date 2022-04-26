package com.revature.ClassExercise;
//Program illustrating throws keyword
public class Throws {

    int a = 12;
    int b = 5;
    void divide() {
        if (b == 5) {
            throw new ArithmeticException("can not divide by 5");
        } else {
            int res = a / b;
            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        Throws t = new Throws();
        try {
            t.divide();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
        }