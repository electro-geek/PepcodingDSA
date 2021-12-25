import java.util.*;
public class Demo1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int column = scn.nextInt();
        int[][] a = new int[row][column];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                a[i][j] = scn.nextInt();
            }
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}