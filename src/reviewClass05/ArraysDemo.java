package reviewClass05;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Marvin";
		String name1="Ahmet";
		// if we have to store multiple values of same type we should use ARRAYS!
		String[] names;
		names=new String[5];
		names[0]="Farhad";
		System.out.println(names[0]);
		names[1]="yogita";
		names[2]="sebas";
		names[3]="michael";
		names[4]="stacie";
		System.out.println(names[3]);
		//System.out.println(names[5]); Array index out of bounds
		System.out.println(names.length);
		System.out.println();
		
		for(int i=0; i<names.length; i++) {//USING FOR LOOP
			System.out.println(names[i]);// Getting all the names
		}
		System.out.println("--------------------------");
		for(String n:names) {// USING ENHANCED FOR LOOP
			System.out.println(n);
		}
		
		System.out.println("-------------------------------");
		int i=0;
		while(i<names.length) {//USING WHILE LOOPS
			System.out.println(names[i]);
			i++;
		}
		
		
		

	}

}
