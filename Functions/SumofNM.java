package Functions;

import java.util.Scanner;

public class SumofNM {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a natural Number you want find Sum");

      int n = sc.nextInt();

      int Sum = FindSumNN(n);
      
      System.out.println(" natural of :" + n +" is "+Sum);

      
    }

    public static int FindSumNN(int n){

        int sum = 0;

        for(int  i=0; i<n;i++){

             sum =+  i;

        }
            return sum;

    }

    
    
}
