package fortuneteller.main.org;

import java.util.Scanner;

public class Teller {

	UserData fool = new UserData();
	Scanner sc = new Scanner(System.in);
	private int age = 0;
	private int retirementAge = 0;
	private String userColor = null;
	private int siblingNumber = 0;

	public void teller() {
		greeting();
		askFirstName();
		askLastName();
		printNames();
		//askAge();
		generateRetAge();

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
	
	
	public int askAge() {
		
		
		System.out.println("How old are you dear?");
		
		int input = sc.nextInt();
		fool.setUserAge(input);
		
		this.age = input;
		//System.out.println(this.age);
		return this.age;
	}

	
	
	
	
	public int generateRetAge() {
		
		int age = askAge();
		if((age % 2) == 0) 
		{
			this.retirementAge = 20;
			
		}
		else {
			
			this.retirementAge = 15;
		}
		
		return this.retirementAge;///return age here
		
		
	}
	
	
	public int siblingNumber() {
		System.out.println("How many siblings do you have my dear?");
		int siblingCount = sc.nextInt();
		this.siblingNumber = siblingCount;
		fool.setSiblingNumber(siblingCount);
		return this.siblingNumber;
	}
	
	
	public String rainbowColor() {
		System.out.println("What is your favorite ROYGBIV color?");
		String colorChoice = sc.next();
		this.userColor = colorChoice;
		fool.setUserColor(colorChoice);
		return colorChoice;
	}
}
