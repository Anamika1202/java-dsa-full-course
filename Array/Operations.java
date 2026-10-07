import java.util.Scanner;

public class Operations {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Please Enter Size of array");

    int n = sc.nextInt();

    int [] arr = new int[n];

    System.out.print("Enter " +n+" Elements.");

    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }

    System.out.println("Arrays Elements are:");
    
    for(int i=0; i<n; i++){
        System.out.println(arr[i] + " ");
    }
    
    //Update Element in Arrays 


    System.out.print("Enter the Index to update (0 to " +(n-1)+ ";");

    int idx = sc.nextInt();

    System.out.println("Enter The New Value");

    int newval = sc.nextInt();

    arr[idx]= newval;

    System.out.println("Updated Arrays Elements are:");


    for(int i =0; i<n; i++){
        System.out.println(arr[i]+ " ");
    }



    
    
}
    
}
