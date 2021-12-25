import java.util.*;
public class SpiralDisplay{
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
        int minr = 0;
        int minc = 0;
        int maxr = a.length-1;
        int maxc = a[0].length-1;
        int tt = n*m;
        int count  = 0;
        while(count < tt){
            //left wall
            if(count < tt)
            for(int i = minr, j = minc; i <= maxr; i++){
                System.out.println(a[i][j]);
                count++;
            }
            minc++;
            //bottom wall
            if(count < tt)
            for(int i = maxr, j = minc; j <= maxc; j++){
                System.out.println(a[i][j]);
                count++;
            }
            maxr--;

            //right wall
            if(count < tt)
            for(int i = maxr, j = maxc; i >= minr; i--){
                System.out.println(a[i][j]);
                count++;
            }
            maxc--;

            //top wall
            if(count < tt)
            for(int i = minr, j = maxc; j >= minc; j--){
                System.out.println(a[i][j]);
                count++;
            }
            minr++;
        }
    }
}