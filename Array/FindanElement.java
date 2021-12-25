import java.util.Scanner;
public class FindanElement{
    public static void main(String[] args){
        System.out.println("Enter the length of an array");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the value you want to find");
        int v = scn.nextInt();
        for(int j = 0; j < arr.length; j++){
            if(arr[j] == v){
                System.out.println("value "+v+" at position "+j);
                break;
            }
            else{
                System.out.println("Your element is not here");
                break;
            }
        }
    }
}