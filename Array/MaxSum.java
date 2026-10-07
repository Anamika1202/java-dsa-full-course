public class MaxSum {
    public static void main(String[] args) {

    int arr [] ={-2, -3, -1, -5};

    //maxsubarraysum_usingprefix(arr);


    kadanes(arr);
        
    }


    public static void maxsubarraysum_usingprefix(int arr[]){

        int cursum = 0;

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        int prefix [] = new int[arr.length];

        prefix[0] = arr[0];

        for(int i =1; i<arr.length;i++){

            prefix[i]= prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){

                cursum = i==0?prefix[j]: prefix[j]- prefix[i -1];
                 if(cursum<minSum){
                    minSum =cursum;
                }
                if (cursum>maxSum) {
                    maxSum = cursum;
                }

            }
        }

           System.out.println("Array  minimum Subarray sum is " +minSum);
          System.out.println("Array  maximum Subarray sum is " +maxSum);

    
}


    public static void kadanes(int arr[]){
   int curSum = arr[0];   // = 1
   int maxSum = arr[0];   // = 1


    for(int i=1;i<arr.length;i++){

        curSum = Math.max(arr[i],curSum + arr[i] )  ;
        maxSum = Math.max(maxSum, curSum);       
    }

     System.out.println("Array kadanes maximum Subarray sum is " +maxSum);

    }

}


