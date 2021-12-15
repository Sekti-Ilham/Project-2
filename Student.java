//Package name 
package CollegeSystem;
//important statement
import java.util.Scanner;

/**
 * The purpose of this class is to model a student object, the class extends Person class and implements the abstract class  policies
 * in addition to the fields inherited from the Person class it provides student objects with a student number a program name and a gpa
 * @author Ilham Sekti
 *
 */
public class Student extends Person implements Policies {
	
	private int studentNumber;// student number 
	private String programName;// program name 
	private double gpa;// gpa obtained
	
	//no-arguments constructor
	public Student() {}
	
	/**
	 * a parameterized       constructor that constructs and initializes a student
	 * @param firstName      first name of the student
	 * @param lastName       last name of the student
	 * @param emailId        email ID of the student
	 * @param phoneNumber    phone number 
	 * @param studentNumber  student number 
	 * @param programName    name of the program
	 * @param gpa   		 the gpa obtained 
	 */
	public Student(String firstName, String lastName,String emailId, long phoneNumber, int studentNumber, String programName, double gpa){
		super(firstName, lastName, emailId, phoneNumber);
		this.studentNumber=studentNumber;
		this.programName=programName;
		this.gpa=gpa;
	}
	
	
	
	/**
	 *method that implements the abstract method readInfo of the abstract class Person, it reads students details from user
	 *the method also calls read marks method which reads the students marks for each course 
	 *@param scan scanner object used to read input from user
	 */
	@Override
	public void readInfo(Scanner scan) {
		
	   // reading student details 
		System.out.print("Enter program name: ");
		programName=scan.nextLine();
	
		System.out.print("Enter student number: ");
		
		while (!scan.hasNextInt()) {//check for valid input 
			
				System.out.print("Invalid entry, please re-enter a valid student number: ");//prompt user in a loop for a valid student number 
				scan.nextLine();//clear input stream
		}
		studentNumber=scan.nextInt();
		scan.nextLine();//clear input stream
	
		System.out.print("Enter first name: ");//reading first name 
		super.setFirstName(scan.nextLine());
		
		System.out.print("Enter last name: ");//reading last name 
		super.setLastName(scan.nextLine());
		
		System.out.print("Enter email Id: ");//reading email ID
		super.setEmailId(scan.nextLine());
		
		System.out.print("Enter phone number: ");//reading phone number
		while (!scan.hasNextLong()) {
			System.out.print("Invalid entry, Please re-enter a valid phone number: ");//prompting user in a loop for valid phone number
			scan.nextLine();//clear input stream
		  }
		super.setPhoneNumber(scan.nextLong());
		
		readMarks(scan);//call read marks method ()
		
		
	}
	
	/**
	 * a Method that reads  for each student the number of courses and the mark obtained for each course
	 * @param scan scanner object to read user input
	 */
	public void readMarks(Scanner scan) {
		
		int numberOfCourses;//number of courses
		double []marks;// marks obtained are stored in an array of marks for each student
		
		System.out.print("Enter number of courses: ");//prompting user for number of coursess
		
		numberOfCourses=scan.nextInt();
		marks=new double [numberOfCourses];//declaration of  marks array size with number of courses
		
		for(int i=0;i<numberOfCourses;i++) {
			System.out.print("Enter mark "+ (i+1)+":");
			
			 marks[i]=scan.nextDouble();//populating the marks array with students marks
		}
		
		   calculateGpa(marks);//call method calculate gpa and passing the array of marks as argument
		
	}
	
	
	/**
	 * a method that calculates the gpa for each student based on the marks obtained
	 * @param marks an array of marks obtained by each student for each course
	 *
	 */
	@Override
	public void calculateGpa(double[] marks) {
		double sum=0;
		for (int i=0;i<marks.length;i++) {
			 sum=sum+marks[i];	 //calculating the total of marks obtained
		}
		this.gpa=((sum/marks.length)/MAX_MARKS)*MAX_GPA;//calculating the gpa
	}

	
	

	/**
	 *a method that prints students information to the console: programe name, student number, first and last name, email ID,
	 * phone number and pga.
	 */
	@Override//printing student info to the console
	public void printInfo() {
		System.out.printf("%12s|%8d| %14s| %14s|%15d| %3.2f",programName, studentNumber,super.getName(),super.getEmailId(), super.getPhoneNumber(),gpa);
	}

}
