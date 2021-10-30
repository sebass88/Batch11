package Class04;

import java.util.Scanner;

public class Hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Java program that will ask user to input city and temperature.
		//Your program should convert Fahrenheit into celsius and 
		//print “The temperature is the city __ is __”
		Scanner scan=new Scanner(System.in);
		
		System.out.println("name of your city");
		String city=scan.next();
		System.out.println(" what is the temperature");
		int f=scan.nextInt();
		int c=((f-32)*5/9);
		System.out.println(f);
		System.out.println("the temperature in the city "+city+" is "+c);
		
		

	}

}
