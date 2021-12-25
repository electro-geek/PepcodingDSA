import java.util.Scanner;
public class SpanofAnArray{
    public static void main(String[] args){
        System.out.println("Enter the the length of an array.");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int temp = 0;

        for(int i = 0; i < a.length; i++){
            a[i] = scn.nextInt();
        } 
        int max = a[0];
        int min = a[0];
        for(int j = 0; j < a.length; j++){
            if(a[j] > max){
                max = a[j];
            }
            if(a[j] < min){
                min = a[j];
            }
           
        }
        int span = max-min;
        System.out.println(span);

        
    }
}