package DatabaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class ConnectMySQL {

	/*
	 * These are the simple steps which we will follow in our program
	 * 
	 * Step 1- First Load the driver
	 * 
	 * Step 2-Then Create a connection
	 * 
	 * Step 3- Then Create a statement
	 * 
	 * Step 4- Then Execute your SQL query
	 * 
	 * Step 5- And Store the data in Result set
	 * 
	 * Step 6- Finally verify whether data (table) is updated or not
	 */

	@Test
	public void testDB() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver"); // it will load mySQL db

		System.out.println("Driver loaded");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium", "root", "Qwerty@123");

		// dbc :mysql://hostname:port/dbname","username","password"

		System.out.println("connected to mysql db");

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("select * from seleniumusers");

		while (rs.next()) {

			String firstname = rs.getString("first name");
			System.out.println(firstname);

			String emailAddres = rs.getString("email");
			System.out.println(emailAddres);
		}

	}
}
