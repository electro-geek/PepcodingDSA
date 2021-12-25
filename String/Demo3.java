import java.util.*;
import java.io.*;
public class Demo3{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(s.split(" "));
        String[] Part  = s.split();
        for(int i = 0; i < Part.length; i++){
            System.out.println(Part[0]);
        }
    }
}