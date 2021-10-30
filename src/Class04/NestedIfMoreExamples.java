package Class04;

public class NestedIfMoreExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean replComplete= true;
		int assignments=3;
		
		if(replComplete) {
			
			
			if(assignments>16) {
				System.out.println("you did amazing work");
			}else if(assignments>10) {
				System.out.println("you did good but you should do more");
			}else if(assignments>6) {
				System.out.println("you need to try to do more homework");
			}else {
				System.out.println("why?");
			}
		}else {
			System.out.println("please make sure you do your homework");
		}
		
		
		

	}

}
