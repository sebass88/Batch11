package classProject;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program  to find the second largest number in the array?
		
		int[] numbers= {15,10,17,13,30};
		int largest=Integer.MIN_VALUE;
		int secondlar=Integer.MIN_VALUE;
		
		for(int number:numbers) {
			
			if(number>largest) {
				secondlar=largest;
				largest=number;
			}else if(number>secondlar && largest!=number) {
				secondlar=number;
			}
		}
		System.out.println("the second largest number is "+secondlar);
		
		
		

	}

}
