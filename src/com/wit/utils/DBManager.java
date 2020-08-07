package com.wit.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	public static Connection getConn() throws ClassNotFoundException, SQLException{
		Connection cn = null;
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/swzl";
		cn = DriverManager.getConnection(url, "root", "jls19960707");
		return cn;
	}

}
