package model;


public class StudentDAOFactory {
	public static StudentDAO getStudentDAO() {
		return 	new StudentDAOImpl();
	}
}
