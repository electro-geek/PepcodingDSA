import java.util.Scanner;
public class InverseOfArray{
    public static void reverse(int[] arr){
        int[] inv = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int v = i;
            inv[arr[i]] = v;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(inv[i]);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = scn.nextInt();
        }
        reverse(a);
    }
}