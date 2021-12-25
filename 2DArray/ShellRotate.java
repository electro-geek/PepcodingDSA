import java.util.*;
public class ShellRotate{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] a = new int[n][m];
        for(int i = 0; i < a.length; i++){
            for(int j= 0; j < a.length; j++){
                a[i][j] = scn.nextInt();
            }
        }
        System.out.println("Enter the shell no.");
        int s = scn.nextInt();
        System.out.println("Enter the value of r");
        int r = scn.nextInt();
        shrot(a, s, r);
        display(a);
        // for(int i = 0; i < a.length; i++){
        //     for(int j = 0; j < a[0].length; j++){
        //         System.out.print(a[i][j]);
        //     }
        //     System.out.println();
        // }
    }
    public static int[][] display(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    public static void shrot(int[][] a, int s, int r){
        int[] oned = fillonefromshell(a, s);
        rotate(oned, s, r);
        fillshellfromomed(a, s, oned);
    }
    public static void rotate(int[] a, int s, int r){
        r = r%a.length;
        if(r < 0){
            r = r+a.length;
        }
        reverse(a, 0 , a.length-1);
        reverse(a, a.length-r, a.length-1);
        reverse(a, 0, a.length-1);
    }
    public static void reverse(int[] a, int i, int j){
        int li = i;
        int ri = j;
        while(li < ri){
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
        }
    }
    public static int[] fillonefromshell(int[][] a, int s){
        int minr = s-1;
        int minc = s-1;
        int maxr = a.length-s;
        int maxc = a[0].length-s;
        int sz  = 2*(maxr + maxc-minr-minc);
        int[] oned = new int[sz];
        //left wall
        int l = 0;
        for(int i = minr, j = minc; i <= maxr; i++){
            oned[l] = a[i][j];
            l++;
        }
        minc++;
        for(int i = maxr, j = minc; j <= maxc; j++){
            oned[l] = a[i][j];
            l++;
        }
        maxr--;
        for(int i = maxr, j = maxc; i >= minr; i--){
            oned[l] = a[i][j];
            l++;
        }
        maxc--;
        for(int i = minr, j = maxc; j >= minc; j--){
            oned[l] = a[i][j];
            l++;
        }
        return oned;

    }
    public static void fillshellfromomed(int[][]a, int s, int[]oned){
        int minr = s-1;
        int minc = s-1;
        int maxr = a.length-s;
        int maxc = a[0].length-s;
        // int sz  = 2(maxr+maxc);
        // int[] oned = new int[sz];
        //left wall
        int idx = 0;
        for(int i = minr, j = minc; i <= maxr; i++){
            a[i][j] = oned[idx];
            idx++;
        }
        minc++;
        for(int i = maxr, j = minc; j <= maxc; j++){
            a[i][j] = oned[idx];
            idx++;
        }
        maxr--;
        for(int i = maxr, j = maxc; i >= minr; i--){
            a[i][j] = oned[idx];
            idx++;
        }
        maxc--;
        for(int i = minr, j = maxc; j >= minc; j--){
            a[i][j] = oned[idx];
            idx++;
        }
    }
}