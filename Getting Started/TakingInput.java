 import java.util.Scanner;

 public class TakingInput{
     public static void main(String[] args) {
         /*how to take input*/
         Scanner scn = new Scanner(System.in);
         //this is for integer type
         // int n = scn.nextInt();
         // for(int i = 0; i <= n; i++){
         //     System.out.println(i);
         // }
         //for string type
         // String name = scn.nextLine();
         // System.out.println("Hello! "+ name);
         /*now lets consider the case if the input is mix of 
         string and integer*/
         int n = Integer.parseInt(scn.nextLine());
         String name = scn.nextLine();
         System.out.println("Dear "+name+" here is your counting");
         for(int i = 1; i <= n; i++){
             System.out.println(i);
         }
     }
        
    
 }