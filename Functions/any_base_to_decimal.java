import java.util.Scanner;
public class any_base_to_decimal{
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("Enter the base of the number");
        int b = scn.nextInt();
        int d = baseToDecimal(n, b);
        System.out.println(d);
    }
    public static int baseToDecimal(int n, int b){
        int ans = 0;
        int multiplier = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            ans += rem*Math.pow(b, multiplier);
            multiplier++;

        }
        return ans;
    }
}