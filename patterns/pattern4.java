import java.util.Scanner;
public class pattern4{
    public static void main(String[] args){
        System.out.println("Enter the no. of rows");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nstar = n;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" \t");
            }
            for(int k = 0; k < nstar-i; k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}