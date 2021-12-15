package CollegeSystem;

import java.util.Scanner;

/**
 * The purpose of this class is to model part time students, it extends student class and sets in addition to the super class fields
 * two specific part time student fields which are course fees and credits. The class override the super class methods readInfo() and printInfo()
 * in order to read from the user and print to the console fields that are specific to part time students
 * @author Ilham Sekti    
 *
 */
public class ParttimeStudent extends Student {
	
	
	private double courseFeesTotal;//total fees for course
	private double credits;//credits accumulated
	
	
	//nor args constructor
	public ParttimeStudent() {}
	
	/**
	 *  parameterized constructor that constructs and initializes a part time student 
	 * @param firstName first name of full time student
	 * @param lastName last name of full time student
	 * @param emailId email ID of full time student
	 * @param phoneNumber phone number of full time student
	 * @param studentNumber student number 
	 * @param programName  name of the program
	 * @param gpa     gpa obtained by full time student
	 * @param courseFeesTotal total fee for the course
	 * @param credits credits accumulated
	 */
	public ParttimeStudent(String firstName, String lastName,String emailId, long phoneNumber, int studentNumber, 
			String programName, double gpa,double courseFeesTotal, double credits) {
		super(firstName, lastName, emailId, phoneNumber, studentNumber, programName, gpa);
		this.courseFeesTotal=courseFeesTotal;
		this.credits=credits;
	}
	/**
	 * method that overrides the super class method readInfo (), it reads from user the total fee for the course and the credit hours accumulated
	 *for a part time student
	 *@param scan : scanner object to read input from user
	 *
	 */
	@Override
	public void readInfo(Scanner scan) {
		super.readInfo(scan);// super class method call
		
		System.out.print("Enter total course fees: ");
		while (!scan.hasNextDouble()) {//check for valid input 
			System.out.println("Invalid entry, please re-enter course fees");//prompt user for valid input 
			scan.nextLine();//clear input stream
		  }
		this.courseFeesTotal=scan.nextDouble();
		scan.nextLine();//clear input stream
		
		
		System.out.print("Enter credit hours: ");
		while (!scan.hasNextDouble()) {//check that input is valid 
			System.out.println("Invalid entry,Please re-enter credit hours");//prompt user in a loop for valid input 
			scan.nextLine();//clear input stream
		  }
		this.credits=scan.nextDouble();
		scan.nextLine();//clear input stream
	}
	
	
	/**
	 *method that overrides printInfo () method of super class Student, it prints to the console total course fees and credit hours
	 *for full time students
	 */
	@Override
	public void printInfo() {
		super.printInfo();//super class method call
		System.out.printf("|%9.2f|%9.2f|%n",courseFeesTotal, credits);
	}

}
