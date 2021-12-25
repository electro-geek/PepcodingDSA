import java.util.*;
public class pp1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = scn.nextInt();
        }
        System.out.println("Where should we rotate the array ?");
        int k = scn.nextInt();
        rotatearray(a, k);
    }
    public static void rotatearray(int[] a, int g){
        int k = g%a.length;
        if(k < 0){
            k = k+a.length;
        }
        int[] b = new int[a.length-k];
        int[] c = new int[k];
        for(int i = 0; i < a.length-k; i++){
            b[i] = a[i];
        }
        for(int i = 0; i < k; i++){
            c[i] = a[a.length-k-i];
        }
        int l1 = 0;
        int h1 = a.length-k-1;
        int l2 = 0;
        int h2 = k-1;
        while(l1 <= h1){
            int temp = b[l1];
            b[l1] = b[h1];
            b[h1] = temp;
            l1++;
            h1--;

        }
        while(l2 <= h2){
            int temp = c[l2];
            c[l2] = c[h2];
            c[h2] = temp;
            l2++;
            h2--;

        }
        int[] d = new int[a.length];
        for(int i = 0; i < a.length-k; i++){
            d[i] = b[i];
        }
        int hul = a.length-k;
        int low = 0;
        while(hul < k){
            d[hul] = c[low];
            hul++;
            low++;
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(d[i]+"\t");
        }
    }
}