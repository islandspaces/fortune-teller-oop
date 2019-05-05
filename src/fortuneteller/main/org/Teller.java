package fortuneteller.main.org;

import java.util.Scanner;

public class Teller {

	UserData fool = new UserData();
	Scanner sc = new Scanner(System.in);

	public Teller() {

	}

	public void greeting() {
		System.out.println("Welcome! Would you like your fortune told?");
		System.out.println("Just tell old Grislda a bit about you.");

	}

	public void askFirstName() {

		System.out.println("What is your first name");
		String  input  = sc.next();
		fool.setFirstName(input);

	}

	public void askLastName() {

		System.out.println("I see....");
		System.out.println("Now your last...don't be shy");
		String  input  = sc.next();
		fool.setLastName(input);

		

	}
	
	public void printNames() {
		
		
		System.out.println(fool.getFirstName() + " " + fool.getLastName());
		
	}
	
	
	public void askAge() {
		
		
		System.out.println("How old are you dear?");
		
		int input = sc.nextInt();
		
		fool.setAge(input);
	}

	
	
	
	
	public int generateRetAge() {
		
		int age = fool.getAge();
		if((age % 2) == 0) 
		{
			//one age
		}
		else {
			
			// another age
		}
		
		return 0;///return age here
		
		
	}
}
