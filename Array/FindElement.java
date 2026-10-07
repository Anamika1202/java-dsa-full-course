public class FindElement {
    
    public static void main (String args []){

        int arr [] = {10,20,30,50,50};

        int elements [] =  smallestandlargestfind(arr);

        System.out.println("Smallest element :" + elements[0] +" and larget element are: " + elements[1]);
    }

    public static int [] smallestandlargestfind(int arr[]){

        if(arr.length == 0){
            System.err.println("Given Array is Empty");
        }
                
        int smallest = Integer.MAX_VALUE;
                
        int Largest =  Integer.MIN_VALUE;

                for (int i = 0;i<arr.length;i++){
                    if(arr[i] < smallest){
                    smallest = arr[i];
                    }
                    if (arr[i]> Largest){
                        Largest = arr[i];
                    }
                }

                return new int [] {smallest,Largest};

            
        
    }
}
