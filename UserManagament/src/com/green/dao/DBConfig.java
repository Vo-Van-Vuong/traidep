package com.green.dao;



import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {
	public static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName= usermanagement";
	
	// Database credentials
	public static final String USER = "root"; // MySQL: root
	public static final String PASS = "root";
}