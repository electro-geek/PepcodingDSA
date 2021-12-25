import java.util.Scanner;
public class fibonacii{
    public static void main(String[] args){
        int n1 = 0;
        int n2 = 1;
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        System.out.println(n1);
        System.out.println(n2);
        for(int i = n1; i <= n; i++){
            int n3 = n1+n2;
            if(n3 > n){
                break;
            }
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
           
        }
    }
}