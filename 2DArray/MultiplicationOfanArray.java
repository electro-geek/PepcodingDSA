import java.util.Scanner;
public class MultiplicationOfanArray{
    public static void main(String[] args){
        System.out.println("Enter the order of 1st 2d array nxm where n is row and m is column");
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] a1 = new int[n1][m1];
        for(int i = 0; i < a1.length; i++){
            for(int j = 0; j < a1[0].length; j++){
                a1[i][j] = scn.nextInt();
            }
        }
        System.out.println("Enter the order of 1st 2d array nxm where n is row and m is column");
        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] a2 = new int[n2][m2];
        for(int i = 0; i < a2.length; i++){
            for(int j = 0; j < a2[0].length; j++){
                a2[i][j] = scn.nextInt();
            }
        }
        int[][] product = new int[n1][m2];
        for(int i = 0; i < a1.length; i++){
            for(int j = 0; j < a2[0].length; j++){
                for(int k = 0; k < a1[0].length; k++){
                    product[i][j] += a1[i][k]*a2[k][i];
                }
            }
        }
        for(int i = 0; i < a1.length; i++){
            for(int j = 0; j < a2[0].length; j++){
                System.out.print(product[i][j]+"\t");
            }
            System.out.println();
        }
    }
}