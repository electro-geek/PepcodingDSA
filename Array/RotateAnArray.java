import java.util.Scanner;
public class RotateAnArray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = scn.nextInt();
        }
        Displayrotate(a);
    }
    public static void Displayrotate(int[] a){
        for(int i =0; i < a.length; i++){
            int li = 0;
            int ri = a.length-1;
            while(li <= ri){
                int temp = a[li];
                a[li] = a[ri];
                a[ri] = temp;
                li++;
                ri--;
            }
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}