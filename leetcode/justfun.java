import java.util.Scanner;
public class justfun {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        for(int i = 0; i < a.length; i++){
            for(int j = i; j < a.length; j++){
                int sum = a[i]+a[j];
                if(sum == target){
                    //ansi = i;
                    //ansj = j;
                    System.out.println(i+" "+j);
                    return;
                }
            }
        }
    }
}