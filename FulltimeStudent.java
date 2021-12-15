//package name
package CollegeSystem;
//import statement
import java.util.Scanner;

/**
 * The purpose of this class is to model full time students, it extends student class and sets in addition to the super class fields
 * a specific full time student field which is tuitionFees. The class override the super class methods readInfo() and printInfo()
 * in order to read from the user and print to the console fields that are specific to FulltimeStudents
 * @author Ilham Sekti
 *
 */
public class FulltimeStudent extends Student {
	
	private double tuitionFees;// specific field for full time student
	
	
	public FulltimeStudent() {}
	
	/**
	 * parameterized constructor that constructs and initializes a fulltime student 
	 * @param firstName first name of full time student
	 * @param lastName last name of full time student
	 * @param emailId email ID of full time student
	 * @param phoneNumber phone number of full time student
	 * @param studentNumber student number 
	 * @param programName  name of the program
	 * @param gpa     gpa obtained by full time student
	 * @param tuitionFees  tuitions fees of full time student
	 */
	public FulltimeStudent(String firstName, String lastName,String emailId, long phoneNumber, int studentNumber, 
			String programName, double gpa, double tuitionFees) {
		super(firstName, lastName, emailId, phoneNumber, studentNumber, programName, gpa);
		this.tuitionFees=tuitionFees;
		}
	

	
	/**
	 * method that overrides the super class method readInfo (), it reads from user the tuition fees for a full time student
	 *@param scan : scanner object to read input from user
	 */
	@Override
	public void readInfo(Scanner scan) {
		super.readInfo(scan);//super class method call
		
		System.out.print("Enter tuition fees: ");
		while (!scan.hasNextDouble()) { //check if input is double 
			System.out.print("Invalid entry, please re-enter tuition fees: ");//prompt user for valid input 
			scan.nextLine();//clear input  stream
		  }
		this.tuitionFees=scan.nextDouble();
		scan.nextLine();//clear input stream
	}
	
	/**
	 * method that overrides printInfo () method of class Student, it prints to the console tuitions fees for full time students
	 *
	 */
	@Override
	public void printInfo() {
		super.printInfo();//super class method call
		System.out.printf("|%9.2f|%n",tuitionFees);
	}
}
