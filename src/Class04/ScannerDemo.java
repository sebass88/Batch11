package Class04;

import java.util.Scanner;

// shorcut to import existing class to the current class
// windows: ctrl+shift+o
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String str="abc";
            str="zyx";
            
            Scanner scan=new Scanner(System.in);
            
            System.out.println("Please enter your name");
            String name=scan.next(); // it will capture String value from console
            
            System.out.println("hello "+name);
            
            System.out.println("please enter your age");
            int age=scan.nextInt();
            
            System.out.println(name+" you are "+age+" years old");
            
            
            
            
            
            
		
	}

}
