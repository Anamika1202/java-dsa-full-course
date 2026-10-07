public class Subarray {
    
    public static void main(String[] args) {
        
        int arr [] = {2,4,6,8,10};


        printsubarray(arr);

    }
    
    public static void printsubarray(int arr[]){

        int ts=0; 
        int minsum = Integer.MAX_VALUE;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            
            for(int j=i; j<arr.length;j++){
               int Sum = 0;
                for(int k=i; k<=j;k++){

                   System.out.print(arr[k]+" ");
                   Sum +=arr[k];
                } 
                ts++;

                System.out.print(": Sum is :"+Sum);
                if(Sum<minsum){
                    minsum =Sum;
                }
                if (Sum>maxsum) {
                    maxsum = Sum;
                }
                System.out.println();

            }
                     System.out.println();

        }

          System.out.println("Array  Total Subarray is " +ts);
          System.out.println("Array  minimum Subarray sum is " +minsum);
          System.out.println("Array  maximum Subarray sum is " +maxsum);

    }
}
