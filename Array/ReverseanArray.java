import java.util.Scanner;
public class ReverseanArray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int temp = 0;
        for(int j = arr.length-1; j >= 0; j--){
            // temp = arr[j];
            // arr[j] = arr[arr.length-j-1];
            // arr[arr.length-j-1] = temp;
            arr1[arr.length-j-1] = arr[j];
        }
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        for(int i = 0; i < arr1.length; i++){
            arr[i] = arr1[i];
            System.out.println(arr[i]);
        }
    }
}