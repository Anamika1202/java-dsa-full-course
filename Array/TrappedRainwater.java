public class TrappedRainwater {
    
    public static void main(String[] args) {
      
       int height [] = {4,2,0,6,3,2,5};  
       
       int Trappedwater = trappedRainwater(height);

       System.out.println(Trappedwater);
    }



    public static int trappedRainwater(int height []){


         int n = height.length;

        //calculate leftmax bounder;

         int leftmax[] = new int [n];

        leftmax[0] = height[0];
        for(int i=1; i<n ;i++){
            leftmax[i]= Math.max(height[i], leftmax[i-1]);
        }
        //calculate Rightmax bounder;
        
        int rightmax [] = new int [n];

        rightmax[n-1] = height[n-1];

        for(int i = n-2;i>=0;i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        //findwaterlevel min(leftmax bounder,right max bounder)

        int trapped_water = 0;

        for(int i=0;i<n;i++){
          int waterlevel = Math.min(leftmax[i], rightmax[i]);
           trapped_water+=waterlevel-height[i];

        }

        return trapped_water;

    }
}
