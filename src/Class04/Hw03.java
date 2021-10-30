package Class04;

import java.util.Scanner;

public class Hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//You are DMV representative and you need to ask customer their age. 
//If they are 18 and older you will issue a driver license to them, 
//otherwise you will offer them to get a learners permit.
		
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		
		if(age>=18) {
			System.out.println("we will be issuing a drivers license");
		}else {
			System.out.println("you will be issued an learners permit");
		}
	}

}
