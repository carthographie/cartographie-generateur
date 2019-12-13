package fr.education.gouv.cartographie.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.education.gouv.cartographie.Idao.IDisciplineDAO;
import fr.education.gouv.cartographie.entity.Academie;
import fr.education.gouv.cartographie.entity.Departement;
import fr.education.gouv.cartographie.entity.Discipline;
import lombok.Data;

@Data
public class DisciplineDAO implements  IDisciplineDAO{

	public DisciplineDAO() {
		super();
	}

	protected Discipline translateToEntity(ResultSet rs) throws SQLException {
		final Discipline instance = new Discipline(null, rs.getString(1), rs.getString(2), rs.getString(3));

		return instance;
	}

	@Override
	public List<Discipline> getAllDisciplines(Connection connection, String query)throws SQLException {
		List<Discipline> disciplines = new ArrayList<>();
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			disciplines.add(translateToEntity(rs));
		}
		return disciplines;
	}


}
