import java.util.*;
public class Demo{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the no.of rows and column");
        int row = scn.nextInt();
        int column = scn.nextInt();
        int[][] a = new int[row][column];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                a[i][j] = scn.nextInt();
            }
        }
        //to get the length of row = a.length
        //to get the length of column = a[0].length
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}