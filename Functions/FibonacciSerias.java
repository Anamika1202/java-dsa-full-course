package Functions;

import java.util.Scanner;

public class FibonacciSerias {
    

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a natural Number you want find Sum");

      int n = sc.nextInt();

      Printfibonacciserias(n);
      

        
    }
    

    public static void Printfibonacciserias(int n) {

        int first = 0; int second =1; int next;


        for(int i=0; i<n; i++){
   
            System.out.println(first+ " ");
            next = first+second;
            first = second;
            second = next;
        
        }


        
    }

      
      
      

}




    
    
