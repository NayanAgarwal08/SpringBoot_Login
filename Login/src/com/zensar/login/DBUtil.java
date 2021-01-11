package com.zensar.login;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	public static Connection getDbConnection() {

		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/login";
		String dbUserName = "root";
		String dbPassword = "66224466";
		Connection con = null;
		try {
			Class.forName(driverClassName);
			 con = DriverManager.getConnection(url, dbUserName, dbPassword);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
