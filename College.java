//package name
package CollegeSystem;
// import statement
import java.util.Scanner;

/**
 * The purpose of this class is to model a college.it sets the name of the college and number of students
 * provides methods to read students details and print them to the console
 * @author Ilham Sekti
 * @version 1.0
 * 
 */
public class College {
	private String name;// college name
	private Student []students;//array of students
	private int numStudents;//number of students to add
	
	
	//no-args constructor
	public College () {
	}
	//parametrized constructor
	
	/**Constructor
	 * @param name name of the College
	 * @param size number of students in the college
	 */
	public College (String name,int size ) {
		this.name=name;//set name 
		students=new Student [size];//set size for array of students
	}
	
	
	/**
	 * a method that checks existence of student details in students array then prints to the console a formatted 
	 * title for students information 
	 */
	public void printTitle() {
		
		boolean isEmpty=false;//boolean variable to check for empty array
		for(int i=0;i<students.length;i++) {
			if (students[i]==null) {
				isEmpty=true;// set variable to true if array empty
			}else isEmpty=false;
		}
		
		//if array is not empty, method prints title for student details 
		if(isEmpty==false) {
			System.out.println("Algonquin College - List of Students");
			for (int i =0; i<36;i++) {
			System.out.print("*");//print stars and then a formatted output
			}
			System.out.printf("%n%12s|%s|%15s|%15s|%15s|%5s|%9s|%9s|%n","Program","Student#","Name","Email","Phone", "GPA", "Fees","Credits");
		}
	}
	
	
	/** a method that prompts user input for students details, prints a student type menu for user to enter student type
	 * (full-time or part-time) each student type result in the creation of a student object of the corresponding type
	 * according to the student type, it asks user to input student details,
	 * @param scan Scanner object to read student details entered by the user
	 */
	public void readStudentsDetails(Scanner scan) {
		int studentType;// take 1 for full time student and 2 for part time student
		
		//when number of students to add is less than array size then read students details from user
		if (numStudents<students.length) {
			System.out.println("Enter details of student "+(numStudents+1));//read info for each student
			for (int i=0;i<27;i++){
			System.out.print("=");//formatted title
			}
			System.out.print("\n1 - Fulltime Student\n2 - Parttime Student\nEnter Student type: ");//print menu for student type
			studentType=scan.nextInt();//read user's option
			scan.nextLine();//clear stream
			//// keep prompting user for a valid student type if option typed is different than 1 and 2
			while (studentType!=1 && studentType!=2) { 
			 	System.out.println("*** Wrong student type... Please re-enter *** ");//inform user about wrong input
			 	System.out.print("1 - Fulltime Student\n2 - Parttime Student\nEnter Student type: ");
				studentType=scan.nextInt();
				scan.nextLine();
		       }
			if (studentType ==1) {
				Student fst=new FulltimeStudent();//create full time student object if option1
				for (int i =numStudents;i<students.length;i++) {
				students[i]=fst;
				}
		     }else if (studentType==2) { 
					Student pst=new ParttimeStudent();//create par time student object if option 2
					for (int j =numStudents; j<students.length;j++) {
					students[j]=pst;
					}
	         }students[numStudents].readInfo(scan);//read details of student object created
	         numStudents++;//increment number of student added to the array 
			
		}else {System.out.println("****Array full... cannot add more students ***");// if array full print it to the console	
		}
	}
	
	
	
	/**
	 * method that prints to the console all student details, if no students found, informs user that no students to print
	 */
	public void printStudentDetails() {
		boolean isEmpty=false;//checks for empty array before printing student details 
		for(int i=0;i<students.length;i++) {
			if (students[i]==null) {
				isEmpty=true;
			}else isEmpty=false;
		}
		
		if (isEmpty==true) { //inform user if array empty
			System.out.println("*** No students to print ***");
		}else for(int i =0;i<numStudents;i++) {
			students[i].printInfo();//prints students information to the console if array of students is not empty
		}
	}
	
	

}