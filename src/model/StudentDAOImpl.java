package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

import com.mysql.jdbc.Statement;

import databaseConnection.ConnectionManager;

public class StudentDAOImpl implements StudentDAO{
	
	Connection connection ;
	PreparedStatement ps ;
	
	@Override
	public int insertStudent(Student newStudent) {
		// TODO Auto-generated method stub
		int queryResult =0;
		try {
			connection = getConnection();
			String query = "insert into STUDENT (ssn, first_Name , last_Name,email,phone_number,Address,stdClass ) values (?,?,?,?,?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setString(1, newStudent.getSSN());
			ps.setString(2, newStudent.getName());
			ps.setString(3, newStudent.getLastName());
			ps.setString(4, newStudent.getEmail());
			ps.setString(5, newStudent.getTelNo());
			ps.setString(6, newStudent.getAddres());
			ps.setString(7, newStudent.getStdClass());
			queryResult = ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			System.out.println("Can not get Connection");
			e.printStackTrace();
		} finally {
			try {
				ps.clearParameters();
				ps.close();
				connection.close();
			} catch (Exception e2) {
				
			}
		}
		return queryResult;
	}

	public int insertInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		int queryResult =0;
		try {
			connection = getConnection();
			String query = "insert into teacher(ssn, first_name,last_name,phone_number) values (?,?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setString(1, instructor.getSSN());
			ps.setString(2, instructor.getName());
			ps.setString(3, instructor.getSurname());
			ps.setString(4, instructor.getPhone());
			

			queryResult = ps.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Can not get Connection");
			e.printStackTrace();
		} finally {
			try {
				ps.clearParameters();
				ps.close();
				connection.close();
			} catch (Exception e2) {
				
			}
		}
		return queryResult;
	}
	
	
	public int insertEnrollment(OrganizedStudentData organizedStudent) {
		// TODO Auto-generated method stub
		int queryResult =0;
		try {
			connection = getConnection();
			String query = "insert into enrollment(student_id, Class_id,desk_number) values (?,?,?)";
			
			String q="SELECT id from classroom where name = " + "'" + organizedStudent.getClassNameToAttend() + "'"   ; 
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = st.executeQuery(q);
			int id=0;
			if(rs.next())
			{
				id=rs.getInt("id");
			}
			
			ps = connection.prepareStatement(query);
			ps.setString(1, organizedStudent.getSSN());
			ps.setString(2, ""+id);
			ps.setString(3, ""+organizedStudent.getDeskNumber());
			
			queryResult = ps.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Can not get Connection");
			e.printStackTrace();
		} finally {
			try {
				ps.clearParameters();
				ps.close();
				connection.close();
			} catch (Exception e2) {
				
			}
		}
		return queryResult;
	}
	

	public int insertInstructorAssign(OrganizedInstructorData organizedInstructor) {
		// TODO Auto-generated method stub
		int queryResult =0;
		try {
			connection = getConnection();
			String query = "insert into instructorassign(teacher_id, class_id) values (?,?)";
			
			String q="SELECT id from classroom where name = " + "'" + organizedInstructor.getClassName() + "'"   ; 
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = st.executeQuery(q);
			int id=0;
			if(rs.next())
			{
				id=rs.getInt("id");
			}
			
			ps = connection.prepareStatement(query);
			ps.setString(1, organizedInstructor.getSSN());
			ps.setString(2, ""+id);
			
			
			queryResult = ps.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Can not get Connection");
			e.printStackTrace();
		} finally {
			try {
				ps.clearParameters();
				ps.close();
				connection.close();
			} catch (Exception e2) {
				
			}
		}
		return queryResult;
	}
	
	public int insertClassroom(Classroom classroom) {
		// TODO Auto-generated method stub
		int queryResult =0;
		try {
			connection = getConnection();
			String query = "insert into classroom(Name, Capacity,Floor) values (?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setString(1,classroom.getName());
			ps.setString(2,""+classroom.getCapacity());
			ps.setString(3,""+classroom.getFloor());
			
	
			queryResult = ps.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Can not get Connection");
			e.printStackTrace();
		} finally {
			try {
				ps.clearParameters();
				ps.close();
				connection.close();
			} catch (Exception e2) {
				
			}
		}
		return queryResult;
	}
	
	@Override
	public Student getStudent(String ssn) {
		Student student=null;
		try {
			connection = getConnection();
			String query = "SELECT * FROM STUDENT where SSN='"+ssn+"'";
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{	
			 student = new Student(rs.getString("first_name"), rs.getString("last_name"), rs.getString("SSN"),rs.getString("email"),rs.getString("address"),rs.getString("phone_number"),rs.getString("stdClass"));	
			}

		} catch (SQLException e) {
			System.out.println("Can not get Connection");
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (Exception e2) {
				
			}
		}
		return student;

	}

	private Connection getConnection() throws SQLException{
        Connection conn;
        conn = ConnectionManager.getInstance().getConnection();
        return conn;
	}

	public ArrayList<Instructor> showInstructors(){
		
		ArrayList<Instructor> instructors = new ArrayList<>();
		int queryResult =0;
		try {
			connection = getConnection();
			String query = "SELECT * FROM TEACHER";
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
				
				Instructor newInstructor=new Instructor(rs.getString("ssn"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("phone_number"));
				instructors.add(newInstructor);
				
			}
			
			
		} catch (SQLException e) {
			System.out.println("Can not get Connection");
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (Exception e2) {
				
			}
		}
		return instructors;
		
	}
	
	
	public ArrayList<Student> showAddedStudent(){

		
		ArrayList<Student> students = new ArrayList<>();
		try {
			connection = getConnection();
			String query = "SELECT * FROM STUDENT";
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
				
				Student student = new Student(rs.getString("first_name"), rs.getString("last_name"), rs.getString("SSN"),rs.getString("email"),rs.getString("address"),rs.getString("phone_number"),rs.getString("stdClass"));
				students.add(student);
				
			}
	//just for control		
			for(Student e : students)
			{
				System.out.println("Student name : " + e.getName() + "Student surname :" + e.getLastName() + "Student SSN : " + e.getSSN());
			}

		} catch (SQLException e) {
			System.out.println("Can not get Connection");
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (Exception e2) {
				
			}
		}
		return students;
		
	}

	public ArrayList<Admin> getAdmins(){
		
		ArrayList<Admin> admins = new ArrayList<>();
		try {
			connection = getConnection();
			String query = "SELECT * FROM Admin";
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
				
				Admin admin = new Admin(rs.getString("name_surname"), rs.getString("username"), rs.getString("password"));
				admins.add(admin);
				
				
			}
	//just for control		
			for(Admin e : admins)
			{
				System.out.println("Admin name : " + e.getName_surname() + "username :" + e.getUsername() + " Password : " + e.getPassword());
			}
	
		} catch (SQLException e) {
			System.out.println("Can not get Connection");
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (Exception e2) {
				
			}
		}
		return admins;
		
	}
	public ArrayList<Classroom> showClassrooms(){
		
		ArrayList<Classroom> classrooms = new ArrayList<>();
		try {
			connection = getConnection();
			String query = "SELECT * FROM CLASSROOM";
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
				
				Classroom newClassroom = new Classroom(rs.getString("Name"), rs.getInt("Capacity"), rs.getInt("Floor"));
				classrooms.add(newClassroom);
				
			}
			//just for control				
			for(Classroom e : classrooms)
			{
				System.out.println("Class name : " + e.getName() + " Class capacity  :" + e.getCapacity() + "  Class floor : " + e.getFloor());
			}
			
		} catch (SQLException e) {
			System.out.println("Can not get Connection");
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (Exception e2) {
				
			}
		}
		return classrooms;
		
	}
	
	public void updateStudentInfos(Student newStudent,String ssn){
		int queryResult;
		try {
			connection = getConnection();
			String query = "update STUDENT set" 
						
						+" first_Name=?"
						+" , last_Name=?"
						+",email=?"
						+",phone_number=?"
						+",Address=?"
						+",stdClass=?"
						+"where SSN='"+ssn+"'";
			
			ps = connection.prepareStatement(query);
		//	ps.setString(1, newStudent.getSSN());
			ps.setString(1, newStudent.getName());
			ps.setString(2, newStudent.getLastName());
			ps.setString(3, newStudent.getEmail());
			ps.setString(4, newStudent.getTelNo());
			ps.setString(5, newStudent.getAddres());
			ps.setString(6, newStudent.getStdClass());
			queryResult = ps.executeUpdate();
		
		} catch (SQLException e) {
			System.out.println("Can not get Connection");
			e.printStackTrace();
		} finally {
			try {
				ps.clearParameters();
				ps.close();
				connection.close();
			} catch (Exception e2) {
				
			}
		}
		
	}
	

}
