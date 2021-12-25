import java.util.Scanner;
public class reversenumber{
    public static void main(String[] args){
        System.out.println("Enter the no.");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        reverseit(n);
    }
    public static void reverseit(int n){
        while(n > 0){
            int rem = n%10;
            n = n/10;
            System.out.print(rem);
        }
    }
}