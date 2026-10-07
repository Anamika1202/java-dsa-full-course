package Functions;

import java.util.Scanner;

public class CalculateFactorial {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a Number you want t calculate factorial");

      int n = sc.nextInt();

      int factorial = FindFactorial(n);
      
      System.out.println(" Factorial of :" + n +" is "+factorial);

      
    }
    

    public static int FindFactorial(int n){

        int fact = 1;

        for(int i=n; i>0; i--){        

            fact *= i;
        }

        return fact; 
    }
}
