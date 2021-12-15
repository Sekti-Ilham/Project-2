//package name
package CollegeSystem;
//import statement
import java.util.Scanner;

/**
 * The purpose of this class is to run the college system program, user menu for options and student types will appear in this class
 * User will be prompted to enter a college name and the number of students then the program processes the input accordingly
 * @author Ilham Sekti
 * @version 1.0
 */
public class CollegeSystemTest {

	public static void main(String[] args) {         
		//variable declaration
		Scanner scan =new Scanner (System.in);
		String name;
		int size;//size of the students array
		int option;//user's option for menu
		boolean shouldContinue=true;//control loop variable
		boolean isGoodInput=false;// variable to test if user's input is valid 
		
		System.out.print("Enter name of College: ");//prompt user for college name
		//name =scan.nextLine();
		
	do {	
	 try {
		
		
		name =scan.nextLine();//store college name
		
		System.out.print("Enter number of Students: ");//prompt user for number of students
		size=scan.nextInt();//store number of students
		//scan.nextLine();
		
		College college =new College (name, size);//create college object with name and size entered by user
		
		while (shouldContinue){
			
			  System.out.print("1. Read Student  \n2. Print Details of all Students \n3. Exit  \n Enter your option: ");//menu options
			  option=scan.nextInt();
			  //process user input according to menu option chosen
			  switch(option) {
			  	 case 1:
			  		 college.readStudentsDetails(scan);//read student details for option 1
			  		 break;
			  	 case 2:
			  		 college.printTitle();//print student details for option2
			  		 college.printStudentDetails();
			  		 break;
			  	 case 3:
			  		 System.out.println("Goodbye... have a nice day!");//break menu loop and quit program for option3
			  		 shouldContinue=false;
			  		 break;
			  		
			  	 default :
			  		 System.out.println("*** Wrong choice... please try again ***");//if wrong choice inform user
		       }
			  
		}
		isGoodInput=true;// user's input is valid 
	
	 }catch(Exception e) {
		 System.out.println("Invalid option.. Please try again.");// if user's input is invalid keep prompting for  valid input
	 }
	 
   }while(isGoodInput==false);

		
	
		
		scan.close();//closing scanner 
  }

	
	
	
	
	
	
}
