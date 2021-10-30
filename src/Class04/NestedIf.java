package Class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day="tuesday";
		int date=12;
		int time=12;
		
		if(day.equals("monday")) {
			System.out.println(" i am going to the movies today");
			
			if(date==13) {
				System.out.println("I am watching a scary movie");
			}else {
				System.out.println(" I am watching a comedy movie today");
			}
		}else {
			System.out.println("I am going to study");
			
			if (time>23) {
				System.out.println("I have to go to sleep cause i have class");
			}
		}

	}

}
