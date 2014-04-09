package studentModel;

import java.util.ArrayList;

public class Classroom {

	private int name;
	private Student[] desks;
	private Instructor instructor;
	
	public Classroom(int name) {
		super();
		this.name = name;
		desks=new Student[16];
		
	}

	
	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public Student[] getDesks() {
		return desks;
	}

	public void setDesks(Student[] desks) {
		this.desks = desks;
	}
	
	
	
}

	