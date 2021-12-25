import java.util.Scanner;
public class anybaseaddition{
    public static void main(String[] args){
        System.out.println("Enter the number n1");
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        System.out.println("Enter the number n2");
        int n2 = scn.nextInt();
        System.out.println("Enter the base");
        int b = scn.nextInt();
        int btn1 = any_base_to_decimal(n1, b);
        int btn2 = any_base_to_decimal(n2, b);
        int sum = btn1+btn2;
        int cbsum = decimalToAnyBase(sum,b);
        System.out.println(cbsum);
    }
    public static int any_base_to_decimal(int n, int b){
        int ans = 0, multiplier = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            ans += rem*Math.pow(b, multiplier);
            multiplier++;
        }
        return ans;
    }
    public static int decimalToAnyBase(int n, int b){
        int ans = 0, multiplier = 0;
        while(n>0){
            int rem = n%b;
            n = n/b;
            ans += rem*Math.pow(10, multiplier);
            multiplier++;
        }
        return ans;
    }
}