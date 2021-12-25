import java.util.Scanner;
public class digitalfq{
    public static int DigitFrequency(int x, int y){
        int count = 0;
        int i = 0;
        while(x > 0){
            int rem = x%10;
            x = x/10;
            if(rem == y){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = DigitFrequency(n,d);
        System.out.println(f);
    }
}