import java.util.Scanner;
public class pattern5{
    public static void main(String[] args){
        System.out.println("Enter the odd no.of rows");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //for the star shape structure
        //About           Spaces  Stars
        //    *            2       1
        //  * * *          1       3
        //* * * * *        0       5
        //  * * *          1       3
        //    *            2       1
        int space = n/2;
        int stars = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= space; j++){
                System.out.print(" \t");
            }
            for(int k = 1; k <= stars; k++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i <= n/2){
                space--;
                stars += 2;
            }
            else{
                space++;
                stars -= 2;
            }
        }
    }
}