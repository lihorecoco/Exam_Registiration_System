package studentModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.print.DocFlavor.STRING;

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
			String query = "insert into STUDENT (ssn, firstName , lastName ) values (?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setString(1, newStudent.getSSN());
			ps.setString(2, newStudent.getName());
			ps.setString(3, newStudent.getLastName());
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
				/*
				 * Handle Ex
				 */
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



}
