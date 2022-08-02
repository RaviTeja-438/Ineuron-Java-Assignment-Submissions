public class Forth_Question {
    public static void main(String[] args)  {
        int y=14,x=8;
        for (int i=0;i<x;i++) {
            for (int j = 0; j < y; j++) {
                if ( i==x-2 || i==x-1 || j==0 || j==y-1 || i>=j || i+j >=y-1 )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
