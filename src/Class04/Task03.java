package Class04;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a Java program and call it a Donor.
3. In order to be eligible to donate your blood you have to be 18 years old. Also once you identify age eligibility then we have to see if person matches weight requirements. If person weight it more than 110 lbs → then he/she is eligible, otherwise we cannot accept such a patient.
		 */
		
		
		
		int age=19;
		double weight=110;
		
		if (age>=18) {
			System.out.println("you are eliglbe to donate blood");
		
		if(weight>=110) {
			System.out.println("we can accept the patient");
		}else
			System.out.println(" we cannot accept the patient");
		}else
			System.out.println("you are not eligble to donate blodd");
		
	}

}
