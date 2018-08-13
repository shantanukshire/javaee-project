package com.webapp.database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Database {
	
	private static final String PROPERTIES_PATH = ".\\src\\main\\resources\\database.properties";
	private static Database database = null;
	private static Connection connection = null;
	private static String DB_DRIVER_CLASS = null;
	private static String DB_URL = null;
	private static String DB_USERNAME = null;
	private static String DB_PASSWORD = null;
	
	private Database() {
	}
	
	public synchronized static Database getDatabase() {
		if(database == null) {
			database = new Database();
		}
		return database;
	}
	
	public static void connect() throws IOException, ClassNotFoundException, SQLException {
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream(PROPERTIES_PATH);
		props.load(fis);
		
		System.out.println("Working Directory = " +
	              System.getProperty("user.dir"));
		
		DB_DRIVER_CLASS = props.getProperty("DB_DRIVER_CLASS");
		DB_URL = props.getProperty("DB_URL");
		DB_USERNAME = props.getProperty("DB_USERNAME");
		DB_PASSWORD = props.getProperty("DB_PASSWORD");
		
		Class.forName(DB_DRIVER_CLASS);
		connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		
		System.out.println("Connected to DB");
	}

	public static void disconnect() throws IOException, ClassNotFoundException, SQLException {
		if(connection != null) {
			connection.close();
			System.out.println("Succesfully disconnected from DB");
		}
	}
	
	
}
