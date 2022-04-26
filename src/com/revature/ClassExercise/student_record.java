package com.revature.ClassExercise;
import java.util.Scanner;
public class student_record {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int numOfStudents = input.nextInt();
        System.out.print("Enter a student name:");
        String student1 = input.next();
        System.out.print("Enter a student score:");
        double score1 = input.nextDouble();
        for(int i = 0; i < numOfStudents-1; i++){
            System.out.print("Enter a student name");
            String student = input.next();
            System.out.print("Enter a student score:");
            double score = input.nextDouble();
            if(score > score1){
                student1 = student;
                score = score;
            }
        }
        System.out.println((new StringBuilder("Top student")).append("'s scores is ").append(score1).toString());

    }
}
