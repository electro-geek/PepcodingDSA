import java.util.Scanner;
public class problem2{
    public static void main(String[] args){
        System.out.println("Enter the length of array");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int v = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = scn.nextInt();
        }
        for(int i = 0; i < a.length; i++){
            for(int j = i; j < a.length; j++){
                int sum = a[i]+a[j];
                if(sum == v){
                    System.out.println("["+i+","+j+"]");
                    return;
                }
            }
        }
    }
}