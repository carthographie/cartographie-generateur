package fr.education.gouv.cartographie.db;

import java.sql.Connection;

public class DBCartographie {
	private Connection connection;
	private String confFileName;
	private String querryAcademie;
	private String querryDepartement;
	private String querryDiscipline;

	public DBCartographie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DBCartographie(Connection connection, String confFileName, String querryAcademie, String querryDepartement,
			String querryDiscipline) {
		super();
		this.connection = connection;
		this.confFileName = confFileName;
		this.querryAcademie = querryAcademie;
		this.querryDepartement = querryDepartement;
		this.querryDiscipline = querryDiscipline;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public String getQuerryAcademie() {
		return querryAcademie;
	}

	public void setQuerryAcademie(String querryAcademie) {
		this.querryAcademie = querryAcademie;
	}

	public String getQuerryDepartement() {
		return querryDepartement;
	}

	public void setQuerryDepartement(String querryDepartement) {
		this.querryDepartement = querryDepartement;
	}

	public String getQuerryDiscipline() {
		return querryDiscipline;
	}

	public void setQuerryDiscipline(String querryDiscipline) {
		this.querryDiscipline = querryDiscipline;
	}

	public String getConfFileName() {
		return confFileName;
	}

	public void setConfFileName(String confFileName) {
		this.confFileName = confFileName;
	}

}
