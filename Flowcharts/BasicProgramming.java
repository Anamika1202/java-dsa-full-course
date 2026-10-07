package Flowcharts;

import java.util.Scanner;

public class BasicProgramming {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);

        /* Calculate Simple Interest */

        int p = 10000;
        int rate = 10;
        int time = 5;

        int Si = (p * rate * time);

        System.out.println("Simple Interest" + Si);

        /* Max of 3 Numbers */

        int a1 = 10;

        int b1 = 20;

        int c1 = 30;

        if (a1 > b1 && a1 > c1) {
            System.out.println("Greater Number is a1: " + a1);
        } else if (b1 > a1 && b1 > c1) {
            System.out.println("Largest Number is b1: " + b1);
        } else {
            System.out.println("Largest Number is c1: " + c1);
        }

        /* Sum of first N natural number */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");

        int num = sc.nextInt();

        int count = 0;

        int Number = 0;

        for (int i = 0; i <= num; i++) {
            Number = Number + i;
        }

        System.out.println(Number);

        /* Print the even number between 9 to 100 */

        int num1 = 9;

        while (num1 < 100) {

            if (num1 % 2 == 0) {
                System.out.println(num1);
            }

            num1++;

        }

        /* Calculating average from 25 exam score */

        int Count = 0;

        double total_marks = 0;

        while (Count<26){

                    System.out.println("Enter The Exam Scores");
                    int marks = sc.nextInt();
                    total_marks = total_marks + marks;
                    count++;
          
        }

        double average = total_marks/25;

        System.out.println("Total 25 Exam Scores average" + average);


        /* CalCulating Area of Circle */

        System.out.println("Enter he Redius of area");

        int r = sc.nextInt();

        float area = 3.14f * r * r;


        System.out.println(area);
        

        /* find if a Numbers is prime or not */

        System.out.println("Enter the Number");

        int n1 = sc.nextInt();

        int div = 2;

        while (div < n1) {

            if (n1 % div == 0) {
                System.out.println("the Number is not a prime Number");
            } else {
                div++;
            }
        }

        System.out.println("The Number is Prime Number");
        

    }

}
