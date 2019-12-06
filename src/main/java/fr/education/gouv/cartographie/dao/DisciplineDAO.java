package fr.education.gouv.cartographie.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import fr.education.gouv.cartographie.Idao.IDisciplineDAO;
import fr.education.gouv.cartographie.entity.Academie;
import fr.education.gouv.cartographie.entity.Discipline;
import lombok.Data;

@Data
public class DisciplineDAO implements  IDisciplineDAO{

	public final String REQUEST = "select * from ACAD ";

	public DisciplineDAO() {
		super();
	}

	protected Discipline translateToEntity(ResultSet rs) throws SQLException {
		final Discipline instance = new Discipline(null, rs.getString(1), rs.getString(2), rs.getString(3));

		return instance;
	}

	public List<Discipline> getAllDisciplines() {
		// TODO Auto-generated method stub
		return null;
	}
}
