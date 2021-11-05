package classProject;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a 2D array or integer type where you will
	// store odd and even numbers. 
	//Develop a program which will identify/print the even numbers only.
		
		int[][] even= {
				{20,35,230},
				{300,220,1000},
				{27,55,452}
		};
		
		for(int i=0;i<even.length;i++) {
			for(int j=0; j<even[i].length;j++) {
				int number=even[i][j];{
					if(number%2==0) {
						System.out.println(number);
					}
				}
			}
		}


	}

}
