package fortuneteller.main.org;

public class UserData {

	private String firstName;
	private String lastName;
	private int userAge;
	private int siblingNumber;
	private String userColor;
	
	
	
	@Override
	public String toString() {
		return "UserData [firstName=" + firstName + ", lastName=" + lastName + "]";
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
		System.out.println(this.firstName + " from userdata class");
	}


	public String getLastName() {
		return lastName;
	
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
		System.out.println(this.userAge + " from userdata class");
	}
	
	
	public int getUserAge() {
		return userAge;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
		System.out.println(this.lastName + " from userdata class");
	}
	


	public int getSiblingNumber() {
		return siblingNumber;
	}


	public void setSiblingNumber(int siblingNumber) {
		this.siblingNumber = siblingNumber;
	}
	
	


	public String getUserColor() {
		return userColor;
	}


	public void setUserColor(String userColor) {
		this.userColor = userColor;
	}


	public UserData() {
		// TODO Auto-generated constructor stub
	}

}
