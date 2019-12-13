package fr.education.gouv.cartographie.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import fr.education.gouv.cartographie.Idao.IInfoMouvementDAO;
import fr.education.gouv.cartographie.entity.InfoMouvement;

public class InfoMouvementDAO implements  IInfoMouvementDAO{

	public final String REQUEST = "select * from ACAD ";

	public InfoMouvementDAO() {
		super();
	}

	protected InfoMouvement translateToEntity(ResultSet rs) throws SQLException {
		final InfoMouvement instance = new InfoMouvement();

		return instance;
	}

	@Override
	public List<InfoMouvement> getAllInfoMvt(Connection connection)throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InfoMouvement> getAllInfoMvtByAnnee(Connection connection, Integer annee)throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InfoMouvement> getInfoMvtByAnneeAndDepartment(Connection connection, Integer annee, String deptcode)throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InfoMouvement> getInfoMvtAcademiesAndAnnee(Connection connection, Integer annee)throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InfoMouvement> getInfoMvtByAnneeAndDiscipline(Connection connection, Integer annee, String discco) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
