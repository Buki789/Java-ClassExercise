package com.revature.ClassExercise;

public class chainedException {
    public static void main(String[] args)
    {
        try
        {
            int a = 20;
            int b = 0;

            if (b == 0)
            {
                ArithmeticException e = new ArithmeticException("Top Layer of Exception");
                e.initCause(new NumberFormatException("is Cause"));
                throw e;
            }
            System.out.println("Division is : " + (a / b));
        } catch (NumberFormatException e) {
            System.out.println("Division not possible " + e.getCause());
        } catch (ArithmeticException n) {
            System.out.println("Caught at Top Level: " + n);
            System.out.println("Original Cause: " + n.getCause());
        }

    }
}
