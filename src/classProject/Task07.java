package classProject;

public class Task07 {

	public static void main(String[] args) {
		// ALL NEGATIVES NUMBERS ARE NOT PRIME
		// NUMBER 0 1 ARE ALSO NOT PRIME
		// IF A POSITIVE NUMBER IS NOT DIVISIBLE BY ANY OTHER NUMBER THAN IT IS PRIME
		
	//Write a java program to check whether a given number is a prime or not?
		
		int number=-15;
		boolean isprime=true;
		if(number>1) {
			
			for(int i=2; i<number; i++) {
				
				if(number%i==0) {
					isprime=false;
					System.out.println("number is not prime");
					break;
				}
			}
			
		}else {
			isprime=false;
			
		}
		
		if(isprime){
			System.out.println(number+" is prime");
		}else {
			System.out.println(number+" is not prime");
		}

	}

}
