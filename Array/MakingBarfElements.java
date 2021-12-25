import java.util.Scanner;
public class MakingBarfElements{
    public static void main(String[] args){
        System.out.println("Enter the length of an array");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int max = arr[0];
        for(int j = 0; j < arr.length; j++){
            if(arr[j] > max){
                max = arr[j];
            }
        }
        for(int floor = max; floor >= 1; floor--){
            for(int k = 0; k < arr.length; k++){
                if(arr[k] >= floor){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}