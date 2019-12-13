package fr.education.gouv.cartographie.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.education.gouv.cartographie.Idao.IAcademieDAO;
import fr.education.gouv.cartographie.Idao.IDepartementDAO;
import fr.education.gouv.cartographie.constants.DatabaseEnum;
import fr.education.gouv.cartographie.entity.Academie;
import fr.education.gouv.cartographie.entity.Departement;

public class DepartementDAO implements IDepartementDAO {

	public DepartementDAO() {
		super();
	}

	protected Departement translateToEntity(ResultSet rs) throws SQLException {
		final Departement instance = new Departement(null, rs.getString(1), rs.getString(2), rs.getString(3));

		return instance;
	}

	@Override
	public List<Departement> getAllDepartements(Connection connection, String query) throws SQLException {
		List<Departement> departements = new ArrayList<>();
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			departements.add(translateToEntity(rs));
		}
		return departements;
	}

}
