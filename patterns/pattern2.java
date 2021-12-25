import java.util.Scanner;
// this one is just the reverse of pattern 1
public class pattern2{
    public static void main(String[] args){
        System.out.println("Enter the number of Rows");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}