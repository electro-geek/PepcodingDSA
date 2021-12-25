import java.util.Scanner;
public class pattern6{
    public static void main(String[] args){
        System.out.println("Enter the value of n");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("\t");
            }
            for(int k = n-i; k > 0; k--){
                System.out.print(k+"\t");
            }
           System.out.println();
        }
    }
}