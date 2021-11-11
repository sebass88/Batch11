package com.syntaxClass15;

public class StudentsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students st1=new Students();
		st1.studenName="Sebas";
		st1.studentID=12005;
		st1.numberofstudents++;
		System.out.println("student name is "+st1.studenName+" and his id number is "+st1.studentID+" there are this many students "+st1.numberofstudents);

		Students st2=new Students();
		st2.studenName="Jose";
		st2.studentID=13005;
		st2.numberofstudents++;
		System.out.println("student name is "+st2.studenName+" and his id number is "+st2.studentID+" there are this many students "+st2.numberofstudents);
		
		Students st3=new Students();
		st3.studenName="Jill";
		st3.studentID=13012;
		st3.numberofstudents++;
		System.out.println("student name is "+st3.studenName+" and his id number is "+st3.studentID+" there are this many students "+st3.numberofstudents);
	}

}
