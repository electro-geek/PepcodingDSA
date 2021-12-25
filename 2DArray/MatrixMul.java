import java.util.*;
public class MatrixMul{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] a = new int[n1][m1];
        int[][] b = new int[n2][m2];
        int[][] p = new int[n1][m2];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                a[i][j] = scn.nextInt();
            }
        }
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[0].length; j++){
                b[i][j] = scn.nextInt();
            }
        }
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                for(int k = 0; k < a[0].length; k++){
                    p[i][j] = a[i][k]*b[k][j];
                }
            }
        }
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b[0].length; j++){
                System.out.print(p[i][j]+"\t");
            }
            System.out.println();
        }
    }
}