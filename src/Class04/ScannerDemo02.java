package Class04;

import java.util.Scanner;

public class ScannerDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input=new Scanner(System.in);
		System.out.println("please enter an item you want to buy");
		
		String item=input.next();
		
		System.out.println("please enter the price of the "+item);
		double price=input.nextDouble();
		
		System.out.println("You selected "+item+" with price="+price);
		
		
	}

}
