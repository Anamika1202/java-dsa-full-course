public class LinearSearch {

    public static void main(String[] args) {

        int arr [] = {10,20,30,40};

        int key = 40;

        int idx =  linearSearchkey(arr, key);

        System.err.println("Array Of on IdX " +idx +" their values is "+ arr[idx]);
        
    }



   
  public static int linearSearchkey(int arr[], int key){

    for(int i = 0; i< arr.length; i++) {

     if (arr[i]==key){
        return  i;
      }

    }

    return -1;

 }
}



