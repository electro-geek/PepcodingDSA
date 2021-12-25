import java.util.*;
public class pattern7{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int row = scn.nextInt();
        int nspc = row/2;
        int nstr = 1;
        for(int i = 1; i <= row; i++){
            for(int sp = 1; sp <= nspc; sp++){
                System.out.print(" \t");
            }
            for(int str = 1; str <= nstr; str++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i <= row/2){
                nspc--;
                nstr += 2;
            }
            else{
                nspc++;
                nstr -= 2;
            }
            
        }
        
    }
}