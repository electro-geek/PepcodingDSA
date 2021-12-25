import java.util.Scanner;
public class anybasetoanybase{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scn.nextInt();
        System.out.println("Enter the base of the number");
        int b = scn.nextInt();
        System.out.println("Enter the base to convert the number into");
        int c = scn.nextInt();
        int d = basetobase(n,b,c);
        System.out.println(d);
    }
    public static int basetobase(int n, int b, int c){
        int ans = 0, multiplier = 0;
        while(n>0){
            int rem = n%c;
            n = n/c;
            ans += rem*Math.pow(b, multiplier);
            multiplier++;
        }
        return ans;
    }
}