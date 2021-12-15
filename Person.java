//package name 
package CollegeSystem;
//import statement
import java.util.Scanner;

/**
 * The purpose of this abstract class is to model a Person with the essential attributes 
 * such as first name last name email and phone number 
 * @author Ilham Sekti
 *
 */
public abstract class Person {
	
	//instance variables declaration
	private  String firstName;// student's first name 
	private String lastName;//student's last name 
	private String emailId;//student's email ID
	private long phoneNumber;// student's phone number 
		
		//no-arg constructor
	public Person() {
		this("null","null","null",0);
	}
	
		//parametrized constructor
	/**
	 * Parameterized constructor : constructs and initializes a Student by setting the first name , last name, email ID and phone number 
	 * @param firstName student's first name 
	 * @param lastName student's last name 
	 * @param emailId student's email ID
	 * @param phoneNumber student's phone number 
	 */
	public Person (String firstName, String lastName, String emailId, long phoneNumber) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailId= emailId;
		this.phoneNumber=phoneNumber;
	}
		
		
	
	//abstract method to read students info, will be implemented by Student class, ParttimeStudent and FulltimeStudent classes
	/**
	 * an abstract method that will be implemented by Student,FulltimeStudent and ParttimeStudent to read student info from user
	 * @param scan scanner object that reads input from user
	 */
	public abstract void readInfo(Scanner scan);
	//abstract method to print student info, will be implemented by Student class,ParttimeStudent and FulltimeStudent classes
	/**
	 * an abstract method that will be implemented by Student,FulltimeStudent and ParttimeStudent to print student details to the console
	 */
	public abstract void printInfo();
  	
	
	/**
	 * Setter method  for firstName
	 * @param firstName  first name of the person object
	 */
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	/**
	 * Setter method for lastName
	 * @param lastName last name of the person object
	 */
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	/**
	 * Setter method for email
	 * @param emailId email of the person object
	 */
	public void setEmailId(String emailId) {
		this.emailId=emailId;
	}
	
	/**
	 * Setter method for phoneNumber
	 * @param phoneNumber: phone number of the person object
	 */
	public void setPhoneNumber (long phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	
	/**
	 * getter method for name that return fist and last name
	 * @return first name and last name
	 */
	public String getName() {
		return firstName+" "+ lastName;
	}
	/**
	 * getter method for phoneNumber
	 * @return emailId
	 */
	public String getEmailId () {
		return emailId;
	}

	/**
	 * getter method for phoneNumber
	 * @return phone number
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}


}
