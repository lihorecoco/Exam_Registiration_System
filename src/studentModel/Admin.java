package studentModel;

public class Admin {
	
	public Admin(String name_surname,String username, String password){
		
		this.name_surname=name_surname;
		this.username=username;
		this.password=password;
	}

	private String name_surname;
	public String getName_surname() {
		return name_surname;
	}

	public void setName_surname(String name_surname) {
		this.name_surname = name_surname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String username;
	private String password;
	

	
	
	

}
