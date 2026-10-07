package Patterns;

public class PatternsPartTwo {

    public static void main(String[] args) {

        System.out.println("Hollow Rectangle Pattern");

        hollowRectanglePattern(5,4);

        System.out.println("Inverted and Rotated Half Pyramid");

        inverted_rotated_half_pyramid(4);

        System.out.println("Inverted Half Pyramid with Number");

        invertedPyramidNumber(5);

        invertedPyramidNumberwaystwo(5);

        System.out.println("Floyd's Triangle Patterns");

        floydsTrianglePattern();


        System.out.println("1 and 0 Triangle");

        zero_one_triangle(5);


        System.out.println("Butterfly Pattern");

        butterflyPatterns(4);

        System.out.println("Solid rhombus pattern");

        solid_rhombus(5);

        System.out.println("hollow rhombus");

        hollow_rhombus(5);

        System.out.println("Daimond Patterns");
        Daimond(5);
        
        
    }

    public static void hollowRectanglePattern(int column,int rows){



        for(int i= 1; i<=rows;i++){

            for(int j=1;j<=column;j++){

                if(i==1||i==rows||j==1||j==column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }
                

            }

            System.out.println();
        }

        }


   public static void inverted_rotated_half_pyramid(int n){


    for(int i=1; i<=n;i++) {

        for(int j=1;j<=n-i;j++)   {
            System.out.print(" ");
        }
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }

        System.out.println();
    }
   

    


   }   


   public static void invertedPyramidNumber(int n){

    /*  logic think by me  */

    for(int i=n; i>=1;i--){

        for(int j=1;j<=i;j++){

            System.out.print(j);
        }

        System.out.println();
    }

   
   }
   
      public static void invertedPyramidNumberwaystwo(int n){
 /* logic provied in lecture */

    for(int i=1; i<=n;i++){

        for(int j=1; j<=n-i+1;j++){

        System.out.print(j);


        }

        System.out.println();

    }



 }

 public static void floydsTrianglePattern(){

  int n=1;

  for(int i = 1;i<=5;i++){
    for(int j=1;j<=i;j++){
        System.out.print(n + " ");
        n++;
    }

    System.out.println();
  }


 }

    public static void zero_one_triangle(int n){

        for(int i= 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if ((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }

            System.out.println();
        }
    }

    public static void butterflyPatterns(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

         for(int i=n;i>=1;i--){
              
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }


    public static void hollow_rhombus(int n){

        for(int i = 1; i<=n;i++){

              for(int j=1;j<=(n-i);j++){
              
                System.out.print(" ");
            
              }

              for(int j=1;j<=n;j++){

                if(i==1||i==n||j==1||j==n){
                  System.out.print("*");
                }else{System.out.print(" ");}
              }

              System.out.println();

        }

    }

   public static void solid_rhombus(int n){
        for(int i = 1; i<=n;i++){

              for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
              }

              for(int j=1;j<=n;j++){  
                System.out.print("*");
              }

              System.out.println();

        }
    }

    public static void Daimond(int n){

    for(int i=1;i<=n;i++){

        for(int j=1;j<=(n-i);j++){
              System.out.print(" ");
        }
        
        for(int j=1; j<=((2*i)-1);j++){
            System.out.print("*");
        }

        System.out.println();
    }

    
    for(int i=n;i>=1;i--){

        for(int j=1;j<=(n-i);j++){
              System.out.print(" ");
        }
        
        for(int j=1; j<=((2*i)-1);j++){
            System.out.print("*");
        }

        System.out.println();
    }


    }
}

    

