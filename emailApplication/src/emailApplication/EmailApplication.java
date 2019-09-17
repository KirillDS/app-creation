package emailApplication;

public class EmailApplication {
	
//By Kirill David Sorokin
	
/* Self-Task: As an IT Support Administrator Specialist, 
 * I was given a task that involves creating email accounts 
 * for new hires within the company called 'ArtIntelligence'.
 * Departments =  Sales, Development, Accounting, None(no department)
 * Email       =  firstname.lastname@department.companyname.com
 * Password    =  Randomly generated String - changeable later */

	public static void main(String[] args) {
		Email eml1 = new Email("Levi", "Ackermann");
		System.out.println(eml1.showInfo());
	}

}
