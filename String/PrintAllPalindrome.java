import java.util.*;
public class PrintAllPalindrome{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        Solution(s1);
    }
    public static void Solution(String s){
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                String str = s.substring(i,j);
                if(isPalindrome(str) == true){
                    System.out.println(str);
                }
            }
        }
    }
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i <= j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(c1 != c2){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}