//package com.revature.studyExercises;
//import java.util.Scanner;
//
//public class validate_student_record {
//
//    public static void main(String[] args) {
//        studentGrade student =new studentGrade("Computer Science ");
//        student.tittle();
//        student.avescore();
//
//    }
////public class validate_student_record {
//    private String course;
//    public validate_student_record(String name) {
//        course = name;
//    }
//    public void setCourse(String name) {
//        course = name;
//    }
//    public String getCourse() {
//        return course;
//    }
//    public void tittle() {
//        System.out.printf("Grade of a Student in ten courses\n %s!\n\n", getCourse());
//    }
//    public void avescore() {
//        Scanner accept = new Scanner((System.in));
//        int tot, k, score, ave;
//        tot = 0;
//        k = 1;
//        while (k <= 10) {
//            System.out.print("Enter the Score");
//            score = accept.nextInt();
//            k = k + 1;
//        }
//        ave = tot / 10;
//        System.out.printf("\ntotal score in ten subjects is %d\n", tot);
//        System.out.printf("Average score is %d\n", avg);
//    }
//        }
//
//
//
