public class Reverse {
    public static void main(String[] args) {
    
        int arr [] = {10,20,30,40,50};

        System.out.println("Original array:");

        for(int i = 0;i<arr.length;i++){
         System.out.print(arr[i]+ " ");
        }

        System.out.println();

        reverse_array (arr);

       System.out.println("Reversed array:");


       for(int i = 0;i<arr.length;i++){
              System.out.print(arr[i] + " " );

        }


    }

    public static void reverse_array(int []arr){

        int i = 0; int j=arr.length-1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;

               i++;
        j--;
        }

     

    }

}
