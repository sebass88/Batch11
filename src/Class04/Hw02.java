package Class04;

import java.util.Scanner;

public class Hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		//If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		
		Scanner scan=new Scanner(System.in);
		int loan=scan.nextInt();
		
		if(loan<200000) {
			System.out.println("we would lend you the money");
		}else {
			System.out.println("we are going to have to reject you at this moment");
		}
		

	}

}
