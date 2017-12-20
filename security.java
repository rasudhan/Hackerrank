import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class security {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        String input,output="";
        int no,key;
        Scanner in = new Scanner(System.in);
        input=in.nextLine();
        key=in.nextInt();
        System.out.println("input="+input);
        for(int i=0;i<input.length();i++) {
        	no=Integer.parseInt(String.valueOf(input.charAt(i)));
        	no+=key;
        	if(no<=9)
        		output+=no;
        	else
        		output+=no-10;
        }
        
        
        System.out.println(output);
        
        
    }
}