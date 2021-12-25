import java.util.*;
import java.io.*;
public class Demo1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        char ch = s.charAt(2);
        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
}