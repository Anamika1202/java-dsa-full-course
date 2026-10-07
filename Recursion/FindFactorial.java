package Recursion;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a Number you want t calculate factorial");

      int n = sc.nextInt();

      int factorial = calFact(n);
      
      System.out.println(" Factorial of :" + n +" is "+factorial);
      
    }

    public static int calFact (int n){

        if(n==0){
            return 1;
        }

        int fnm1 = calFact(n-1);

        int fact = n * (n-1);

        return fact;
    }
    
}
