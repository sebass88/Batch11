package classProject;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a 2D array of integer values. Print the sum of all numbers.
		
		int[][] num= {
				{500,200,300},
				{10,20,30},
		};
		int sum=0;
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				sum+=num[i][j];
			}
		}
		
		
		System.out.println("the sum of all numbers are "+sum);

	}

}
