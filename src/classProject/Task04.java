package classProject;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array on double values using scanner 
		//and calculate the sum of all stored elements in that array.
		

		System.out.println("Please enter the number of elements you want to store");
		Scanner input=new Scanner(System.in);
		double[] number=null;
		double sum=0.0;
		int size =input.nextInt();
		number=new double[size];
		
		System.out.println("Please enter the numbers");
		 
		for(int i=0;i<number.length;i++) {
			 number[i]=input.nextDouble();
			
			sum+=number[i];}
				System.out.println(sum);
				
				System.out.println("-----------------------------");
				
				double []n=new double[5];
				Scanner scan=new Scanner(System.in);
				for(int i=0; i<n.length; i++) {
					System.out.println("Please enter the number");
					n[i]=scan.nextDouble();
					
				}
				double sums=0;
				for(double nu:n) {
					sums+=nu;
							
				}
				
				System.out.println(sums);


	}

}
