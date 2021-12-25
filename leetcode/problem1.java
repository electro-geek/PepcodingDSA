import java.util.Scanner;
public class problem1{
    public static void main(String[] args){
        System.out.println("Enter the length of array");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = scn.nextInt();
        }
        for(int i = 0; i < a.length; i++){
            int end = a.length-i;
            if(a.length%2 == 0){
                System.out.println(a[i]+""+a[end]);
            }
            else{
                if(i == (a.length/2)+1){
                    System.out.println(a[i]*10);
                }
                else{
                    System.out.println(a[i]+""+a[end]);
                }
            }
        }
    }
}