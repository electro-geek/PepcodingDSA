import java.util.Scanner;

public class primenumber{
    public static void main(String[] args){
        // Scanner scn = new Scanner(System.in);
        // int t = scn.nextInt();
        for(int i = 2; i < 51; i++){
            // int n = scn.nextInt();
            int count = 0;
            for(int div = 2; div*div < i; div++){
                if(i%div == 0){
                    count++;
                    break;
                }
                if(count == 0){
                System.out.println(i+"Prime");
                }
                else{
                System.out.println(i+"not prime");
                }
            }
        }
    }
}