package Recursion;

import java.util.Scanner;

public class FindSumNn {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a natural Number you want find Sum");

      int n = sc.nextInt();

      int Sum = recursionFindSumNN(n);
      
      System.out.println(" natural of :" + n +" is "+Sum);

      
    }
    

    public static int recursionFindSumNN(int n){

        if(n==1){
            return 1;
        }

     int Nm1Sum = recursionFindSumNN(n-1);

     int sum = n+Nm1Sum;
;

     return sum;


    }
}
