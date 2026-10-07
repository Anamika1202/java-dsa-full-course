public class Arguments {
    
    public static void main(String[] args) {

        int marks [] =  {10,20,30};

        int nonchangeable =    5;

        update(marks ,nonchangeable);

        for(int i = 0; i< marks.length;i++){
            System.err.print(marks[i]+ " ");
        }

        System.out.println("nonchangeable :" + nonchangeable); // output is 5 
        
    }

    public static void update(int [] marks,int nonchangeable){

        nonchangeable = 10;

        for(int i=0; i<marks.length; i++){
            marks[i]= marks[i]+1;

        }
    }
}
