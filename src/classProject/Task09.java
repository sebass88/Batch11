package classProject;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Maximum and minimum number in the array?
		
		int[] number= {10,5,3,-5,15};
		int largestnum=Integer.MIN_VALUE;
		int smallestnum=Integer.MAX_VALUE;
		
		for(int i=0; i<number.length;i++) {
			if(number[i]>largestnum) {
				largestnum=number[i];
				
			}
			if(number[i]<smallestnum) {
				smallestnum=number[i];
			}
		}
		System.out.println(largestnum);
		System.out.println(smallestnum);

	}

}
