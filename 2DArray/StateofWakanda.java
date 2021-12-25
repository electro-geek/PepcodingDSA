import java.util.*;
public class StateofWakanda{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] a = new int[n][m];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                a[i][j] = scn.nextInt();
            }
        }
        for(int j = 0; j < a[0].length; j++){
            if(j%2 == 0){
                for(int i = 0;i < a.length; i++){
                    System.out.println(a[i][j]);
                }
            }
            if(j%2 != 0){
                for(int i = a.length-1; i >= 0; i--){
                    System.out.println(a[i][j]);
                }
            }
        }
    }
}