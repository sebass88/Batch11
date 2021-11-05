package classProject;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a 2D array of integers.
		//Develop a program which will calculate 
		//the sum of  even and odd numbers for that array.
		
		int[][] num = { { 11, 20, 66, 40, 45 }, { 34, 39, 23, 46, 100 } };
		int sumeven = 0;
		int sumodd = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] % 2 == 0) {
					
					System.out.println("This is even number " + num[i][j]);
					
					sumeven += num[i][j];
				} else if (num[i][j] != 0) {
					System.out.println("This is odd number " + num[i][j]);
					sumodd += num[i][j];
				}
			}
		}
		System.out.println("sum of Even numbers is " + sumeven);
		System.out.println("sum of Odd numbers is " + sumodd);


	}

}
