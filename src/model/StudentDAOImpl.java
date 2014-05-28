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
			String query = "insert into STUDENT (ssn, first_Name , last_Name,email,phone_number,Address ) values (?,?,?,?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setString(1, newStudent.getSSN());
			ps.setString(2, newStudent.getName());
			ps.setString(3, newStudent.getLastName());
			ps.setString(4, newStudent.getEmail());
			ps.setString(5, newStudent.getTelNo());
			ps.setString(6, newStudent.getAddres());

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
			//String query = "insert into enrollment(student_id, Class_id,desk_number) values (?,?,?)";
			
			String query = "insert into enrollment(student_id,Class_id,desk_number,session_id) values ('" + organizedStudent.getSSN() +"',(select id from classroom where name = '" + organizedStudent.getClassNameToAttend() +"'), '"  + organizedStudent.getDeskNumber() +"'," +"(select session_id from session where dateandtime = '"+organizedStudent.getSessionDate()+"' and sessionName ='"+organizedStudent.getSessionName()+"'))";
			System.out.println("Student query : " +query);
			Statement st = (Statement) connection.createStatement();
			st.executeUpdate(query);
			
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
			//String query = "insert into instructorassign(teacher_id, class_id) values (?,?)";
			String query = "insert into instructorassign(teacher_id,class_id,sessionID) values (" + "'" + organizedInstructor.getSSN() + "'," + "(select id from classroom where Name = '" + organizedInstructor.getClassName() +"'),"+"(select session_id from session where dateandtime = '"+organizedInstructor.getDate()+"' and sessionName ='"+organizedInstructor.getSession()+"'))";  
			System.out.println(query);
			/*
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
			*/
			Statement st = (Statement) connection.createStatement();
			st.executeUpdate(query);
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
	
	public int insertSession(Session session,String className) {
		// TODO Auto-generated method stub
		int queryResult =0;
		try {
			connection = getConnection();
			
			String query1= "insert into session(class_info,dateandtime,sessionName , exam_id ) values ("+"'" + session.getClassFor() +"'" +"," +"'"+ session.getSessionDate() +"'"+","+"'"+ session.getSessionName()+"'"+"," + "(select exam_id from exam where examName= '" +className+"'))"; 
			System.out.println(query1);
		
			Statement st = (Statement) connection.createStatement();
			st.executeUpdate(query1);
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
		return 1;
	}
	
	public int insertExam(Exam exam) {
		// TODO Auto-generated method stub
		int queryResult =0;
		try {
			connection = getConnection();
			String query = "insert into exam(start_date , end_date , examName) values (?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setString(1,exam.getStartDate());
			ps.setString(2,""+exam.getEndDate());
			ps.setString(3,""+exam.getExamName());
			
	
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
		// TODO Auto-generated method stub
		return null;
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
				
				Student student = new Student(rs.getString("first_name"), rs.getString("last_name"), rs.getString("SSN"));
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

	public ArrayList<Student> showAddedStudentupToClass(String classNumber){

		
		ArrayList<Student> students = new ArrayList<>();
		try {
			connection = getConnection();
			String query = "SELECT * FROM STUDENT WHERE StdClass = '" + classNumber +"'";
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
				
				Student student = new Student(rs.getString("first_name"), rs.getString("last_name"), rs.getString("SSN"));
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

public ArrayList<Session> showSessions(){
	
	ArrayList<Session> session = new ArrayList<>();
	try {
		connection = getConnection();
		String query = "select * from session";
		Statement st = (Statement) connection.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			
			Session newSession = new Session(rs.getString("dateandtime"), rs.getString("sessionName"), rs.getString("class_info"));
			session.add(newSession);
		
		}
		//just for control				
		for(Session e : session)
		{
			System.out.println("Session name : " + e.getSessionName()  + " Session class  :" + e.getClassFor() + "  Session Date  : " + e.getSessionDate());
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
	return session;
	
}

public ArrayList<Exam> showExams(){
	
	ArrayList<Exam> exams = new ArrayList<>();
	try {
		connection = getConnection();
		String query = "select * from exam";
		Statement st = (Statement) connection.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			
			Exam newExam = new Exam(rs.getString("ExamName"), rs.getString("start_date"), rs.getString("end_date")); 
					
			exams.add(newExam);
		
		}
		//just for control				
		
		
	} catch (SQLException e) {
		System.out.println("Can not get Connection");
		e.printStackTrace();
	} finally {
		try {
			connection.close();
		} catch (Exception e2) {
			
		}
	}
	return exams;
	
}



	public ArrayList<Session> bringSectionsUptoExamName(String s){
		
		ArrayList<Session> session = new ArrayList<>();
		try {
			connection = getConnection();
			String query = "select * from session where exam_id = (select exam_id from exam where examName = "+"'" + s + "')";
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
				
				Session newSession = new Session(rs.getString("dateandtime"), rs.getString("sessionName"), rs.getString("class_info"));
				session.add(newSession);
			
			}
			//just for control				
			for(Session e : session)
			{
				System.out.println("Session name : " + e.getSessionName()  + " Session class  :" + e.getClassFor() + "  Session Date  : " + e.getSessionDate());
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
		return session;	
	}

	public ArrayList<OrganizedStudentData> bringOrganizedStudentToExamCard(){
		ArrayList<OrganizedStudentData> organizedStudent = new ArrayList<>();
		try {
			connection = getConnection();
			String query = "select st.first_name , st.last_name , c.Name , e.desk_number , s.sessionName , s.dateandtime from session s , classroom c , enrollment e ,student st where e.student_id = st.SSN AND e.Class_id = c.id and e.session_id=s.session_id  ";
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
				OrganizedStudentData newOrganizedStudentData = new OrganizedStudentData(rs.getString("first_name"), rs.getString("last_name"), rs.getString("Name"), Integer.parseInt(rs.getString("desk_number")), rs.getString("sessionName"), rs.getString("dateandtime"));
				
				organizedStudent.add(newOrganizedStudentData);
			
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
		return organizedStudent;	
		
		
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
