import java.util.*;
import java.io.*;
public class Demo2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String s1 = s.substring(0,2);
        System.out.println(s1);
        //printing all the substring of an string
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}