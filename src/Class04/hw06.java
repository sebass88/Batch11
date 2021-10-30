package Class04;

import java.util.Scanner;

public class hw06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*6. Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus,
		 *  otherwise he is not. 
		 *  Once user is eligible and salary is larger than 50000 than bonus = 5000, 
		 *  otherwise bonus=3000.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("number of worked years");
		int years=scan.nextInt();
		if(years>=5) {
			System.out.println("what is your salary");
			int salary=scan.nextInt();
			if(salary>=50000) {
				System.out.println("bonus will be $5000");
			}else {
				System.out.println("bonus will be $3000");
		   }
		}else {
			System.out.println("you are not eligible");
			

	}
	}

}
