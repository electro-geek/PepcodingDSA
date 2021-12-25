import java.util.Scanner;
public class reversenumber{
    public static void main(String[] args){
        System.out.println("Enter the number whose reverse is to be calculated");
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        int rmd = n/10;
        int lastDigit = n-(rmd*10);
        System.out.print((lastDigit*10)+rmd);
        // System.out.print(rmd);
    }
}