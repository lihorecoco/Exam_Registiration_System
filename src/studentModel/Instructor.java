package studentModel;

public class Instructor {

	private String name;
	private String surname;
	private String phone;
	private Classroom staffClassrom;
	private int hasJob;
	
	public Instructor(String name, String surname, String phone) {
		super();
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.hasJob=0;
	}


	
	public int getHasJob() {
		return hasJob;
	}

	public void setHasJob(int hasJob) {
		this.hasJob = hasJob;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Classroom getStaffClassrom() {
		return staffClassrom;
	}

	public void setStaffClassrom(Classroom staffClassrom) {
		this.staffClassrom = staffClassrom;
	}
	
	
	
	

}
