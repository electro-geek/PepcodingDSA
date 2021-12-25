import java.util.*;
import java.io.*;
import java.net.SocketPermission;
public class Addingstring{
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "World!";
        String s3 = s1+" "+s2;
        System.out.println(s3);
        s1 += " ";
        s1 += "w";
        s1 += "o";
        s1 += "r";
        s1 += 10;
        System.out.println(s1);
        //prints Hello1020 due to flow of program left to right
        System.out.println("Hello"+10+20);
        //print 30Hello due to flow of program left to right
        System.out.println(10+20+"Hello");
    }
}