package classProject;

public class Task05 {

	public static void main(String[] args) {
		// Create an array of countries. 
		//While retrieving all values from an array 
		//print capital for each country. (use 2 different loops).
		
		String[] countries= {"Peru","Usa","Mexico","Spain"};
		
		for(String country:countries) {
			if(country.equals("Peru")) {
				System.out.println("Lima");
			}else if(country.equals("Usa")) {
				System.out.println("Washington Dc");
			}else if(country.equals("Mexico")) {
				System.out.println("Mexico City");
			}else if(country.equals("Spain")) {
				System.out.println("Madrid");
			}else {
				System.out.println("Invalid");
			}
		}
		
		for(int i=0; i<countries.length; i++) {
			
			
		}
		

		

	}

}
