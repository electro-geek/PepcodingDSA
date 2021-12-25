import java.util.*;
public class RotateArray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();//array should be square matrix
        int[][] a = new int[n][n];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                a[i][j] = scn.nextInt();
            }
        }
        //transpose of array
        for(int i = 0; i < a.length; i++){
            for(int j = i; j < a[0].length; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for(int i = 0; i < a.length; i++){
            int low = 0;
            int high = a[0].length-1;
            while(low <= high){
                int temp = a[i][low];
                a[i][low] = a[i][high];
                a[i][high] = temp;
                low++;
                high--;
            }
        }
        display(a);

    }
    //the display function
    public static void display(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}