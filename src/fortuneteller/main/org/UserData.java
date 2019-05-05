package fortuneteller.main.org;

public class UserData {

	private String firstName;
	private String lastName;
	
	
	@Override
	public String toString() {
		return "UserData [firstName=" + firstName + ", lastName=" + lastName + "]";
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public UserData() {
		// TODO Auto-generated constructor stub
	}

}
