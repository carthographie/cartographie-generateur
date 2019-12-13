package fr.education.gouv.cartographie.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBManagerCartorgraphie {
	public static String CONF_FILE = "Carto-pool-default.properties";

	public static DBCartographie initConnection(String fileName) throws SQLException {
		DBCartographie dbCartographie;
		if (fileName != null && !fileName.equals("")) {
			CONF_FILE = "Carto-pool" + fileName.toUpperCase();
		}
		Connection cnx = null;
		Properties properties = new Properties();

		InputStream input;

		ClassLoader classLoader = DBManagerCartorgraphie.class.getClassLoader();
		input = classLoader.getResourceAsStream(CONF_FILE);
		try {
			properties.load(input);
			String driverName = properties.getProperty("db.pool.schema-cartographie.manager.driver");
			String url = properties.getProperty("db.pool.schema-cartographie.manager.url");
			String username = properties.getProperty("db.pool.schema-cartographie.manager.login");
			String password = properties.getProperty("db.pool.schema-cartographie.manager.password");
			String queryAcademie = properties.getProperty("db.pool.schema-cartographie.query.departement");
			String queryDepartement = properties.getProperty("db.pool.schema-cartographie.query.academie");
			String queryDiscipline = properties.getProperty("db.pool.schema-cartographie.query.discipline");

			Driver driver = (Driver) Class.forName(driverName).newInstance();
			DriverManager.registerDriver(driver);
			cnx = DriverManager.getConnection(url, username, password);

			dbCartographie = new DBCartographie(cnx, CONF_FILE, queryAcademie, queryDepartement, queryDiscipline);
			return dbCartographie;
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		return null;

	}

}
