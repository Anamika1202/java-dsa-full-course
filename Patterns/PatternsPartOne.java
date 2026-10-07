package Patterns;

public  class PatternsPartOne{

    public static void main(String[] args) {

        System.out.println("Star Pattern");
        
        star_patterns();

        System.out.println("Inverted Star Pattern");

        InvertedStarPattern();

        System.out.println("half Pyramid Pattern");

        halfpyramidpatterns();

        System.out.println("Character Pattern");

        characterPattern();





    }
    
    
    public static void star_patterns(){

    int n= 4;

    for(int i = 1; i<=n;i++){

        for (int j=1;j<=i;j++){


            System.out.print("*");

        }

        System.out.println();

    }


    }


    public static void  InvertedStarPattern(){

        for(int i=4; i>0;i--){

            for(int j=1; j<=i;j++){

                System.out.print("*");

            }

            System.out.println();
        }

    }


    public static void characterPattern(){

        char ch = 'A';

        for(int i = 1;i<=4;i++){
            for (int j=1; j<=i;j++){

                    System.out.print(ch);
                    ch++;
            }

            System.out.println();
        }
    }

    public  static void halfpyramidpatterns(){

    for(int i = 1;i<=4;i++){

        for(int j=1;j<=i;j++){

            System.out.print(j);
        }

        System.out.println();
    }


    }
}


