package fr.education.gouv.cartographie.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBManagerCartorgraphie {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/javaTest";

	// Database credentials
	static final String USER = "admin";
	static final String PASS = "admin";
	static final String USER_MYSQL = "root";
	static final String PASS_MYSQL = "";

	public static Connection initConnection() {

		Connection cnx = null;
		Properties properties = new Properties();
		InputStream input;

		ClassLoader classLoader = DBManagerCartorgraphie.class.getClassLoader();
		input = classLoader.getResourceAsStream("pool.properties");
		try {
			properties.load(input);

			String driver = properties.getProperty("db.pool.schema-cartographie.pool.manager.driver");
			String url = properties.getProperty("db.pool.schema-cartographie.pool.manager.url");
			String username = properties.getProperty("db.pool.schema-cartographie.pool.manager.login");
			String password = properties.getProperty("db.pool.schema-cartographie.pool.manager.password");
			loadDriver(driver);

			cnx = DriverManager.getConnection(url, username, password);

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnx;

	}

	public static void loadDriver(String driverName) {

		Driver driver;
		try {
			driver = (Driver) Class.forName(driverName).newInstance();
			DriverManager.registerDriver(driver);
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
