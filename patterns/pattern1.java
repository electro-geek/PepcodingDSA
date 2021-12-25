import java.util.Scanner;
public class pattern1{
    public static void main(String[] args){
        //we are going to print the star according to the no .of row it take
        System.out.println("Enter the no. of Rows");
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        for(int i = 1; i <= n; i++){
            //here for the stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //it chages the line
            System.out.println();
        }
    }
}