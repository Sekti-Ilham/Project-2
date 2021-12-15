package CollegeSystem;

/**
 * The purpose of this interface is to declare and  initialize the MAX MARKS and MAX GPA that are shared by all Student at the college.
 * It also provides the declaration of the calculateGpa method that will be implemented by Student class
 * @author Ilham Sekti
 */
public interface Policies {
	
	public  static final int  MAX_MARKS= 100;// maximum mark 
	public static final double MAX_GPA= 4.0;//maximum GPA
	
	
	
	/**
	 * The method provides the interface for calculation of students gpa that will be implemented by  class Student 
	 * @param marks a double array of each student marks for differents courses
	 */
	public void calculateGpa (double[] marks);// calculate students marks ; will be implemented by class Student
	
	
	

}
