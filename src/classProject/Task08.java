package classProject;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// write a java Program to print the first 10 number of Fibonacci series.
		
		// 0 1 1 2 3 5 8 13 21 34.....
		
		int previousnumber=0;
		int currentnumber=1;
		int sum=0;
		int numberstoprint=10;
		System.out.println(previousnumber+" ");
		System.out.println(currentnumber+" ");
		for(int i=0;i<numberstoprint-2; i++) {
			sum=currentnumber+previousnumber;
			System.out.println(sum+" ");
			previousnumber=currentnumber;
			currentnumber=sum;
			
		}
		
		

	}

}
