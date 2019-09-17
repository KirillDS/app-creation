package emailApplication;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	private int defaultPassLength = 10;
	private String altervativeEmail;
	private String companyName = "artintelligence";
	
	//Constructor that will receive the first and last name
	/* 'this' refers to the class-level variable, 
	 *  otherwise it would refer to the local variable.*/
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("New Employee: "+this.firstName+" "+this.lastName);
		
		//Call method; ask for department - return the department
		this.department = setDepartment();
		//System.out.println("Department: "+this.department);
		
		//Call a method that returns a randomly generated password
		this.password = randomPass(defaultPassLength);
		System.out.println("Your Password is: "+ this.password);
		
		//Combining the elements to generate the email
		email = firstName.toLowerCase() +"."+lastName.toLowerCase()+"@"+department+companyName+".com";
		//System.out.println("Your email is: "+ email);
	}
	
	//Department - Asking the user
	private String setDepartment() {
		System.out.print("Department Codes:\n1 for SALES\n2 for DEVELOPMENT\n3 FOR ACCOUNTING\n0 for NONE\nEnter Department Code: ");
		Scanner inDepartment = new Scanner(System.in);
		int departmentChoice = inDepartment.nextInt();
		if (departmentChoice == 1) {return "sales.";}
		else if (departmentChoice == 2) {return "dev.";}
		else if (departmentChoice == 3) {return "account.";}
		else {return "";}
	}
	
	//Generate a random password
	/*Takes the String 'passwordSet' and 
	 * converts the string values into an array; 
	 * the array char is Array Character, 
	 * meaning the the array will contain all of 
	 * the values in the string as individuals,
	 * and then the values will be multiplied 
	 * by the length of the original string, 
	 * then it will store the randomly selected 
	 * value in the variable password and return 
	 * that variable as a string instead of character(s).*/
	private String randomPass(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@£$%^&*";
		char[] password = new char[length];
		for (int i=0;i<length;++i) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set the mail capacity 
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	//Set the alternate email
	public void setAltEmail(String altEmail) {
		this.altervativeEmail = altEmail;
	}
	
	//Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	//Gets the mail capacity
	public int getMailCapacity() {return mailBoxCapacity;}
	//Gets the alternative email
	public String getAlternativeEmail() {return altervativeEmail;}
	//Gets the password
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME:       " + firstName + " " + lastName +
				"\nCOMPANY EMAIL:      " + email +
				"\nMAIL BOX CAPACITY:  " + mailBoxCapacity + "mb";
	}
}
