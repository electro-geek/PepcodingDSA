import java.util.Scanner;
public class pattern3{
    public static void main(String[] args){
        System.out.println("Enter the rows");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nstar = n;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= nstar-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}