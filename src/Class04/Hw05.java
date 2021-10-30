package Class04;

import java.util.Scanner;

public class Hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 5. Create a Java program that will ask if user has a credit card or not. If you user does not have a credit card then offer them. 
		//If they do have one ask what is balance on the card? 
		//If balance of the card is larger than 1000, tell them to pay off immediately, 
		//otherwise you can tell them that they can spend more.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Do you have a credit card? yes or no");
		String answer=scan.next();
		if(answer.equals("yes")) {
			System.out.println("what is your balance");
			int balance=scan.nextInt();
			if(balance>1000) {
				System.out.println("pay off your balance immediately");
			}else {
				System.out.println("you can spend more");
			}
		}else {
			System.out.println("i will like to offer you a credit card");
		}
		
		

	}

}
