import java.util.Scanner;
public class BinarySearch{
    public static void main(String[] args){
        System.out.println("Enter the length of array.");
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int low = 0;
        int high = a.length-1;
        int mid = (low+high)/2;
        while(low <= high){
            if(d > a[mid]){
                low = mid+1;
            }
            else if(d < a[mid]){
                high = mid-1;
            }
            else{
                System.out.println(mid);
                return;
            }
        }
        System.out.println("element is not found");
    }
}