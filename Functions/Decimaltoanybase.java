import java.util.Scanner;
public class Decimaltoanybase{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(getValueinBase(n,b));
        
    }
    public static int getValueinBase(int n, int b){
        int ans_num = 0, multiplier = 1;
        while(n>0){
            int remainder = n%b;
            n = n/b;
            ans_num = ans_num + remainder*multiplier;
            multiplier *= 10;
        }
        return ans_num;
    }
}