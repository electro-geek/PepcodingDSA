import java.util.Scanner;
public class Subarray{
    public static void main(String[] args){
        System.out.println("Enter the length of an array");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = scn.nextInt();
        }
        for(int i = 0; i < a.length; i++){
            for(int j = i; j < a.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(a[k]+"\t");
                }
            }
            System.out.println();
        }
    }
}