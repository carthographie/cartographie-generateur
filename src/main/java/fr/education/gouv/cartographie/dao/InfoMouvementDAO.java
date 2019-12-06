package fr.education.gouv.cartographie.dao;

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

	public List<InfoMouvement> getAllInfoMvt() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<InfoMouvement> getAllInfoMvtByAnnee(Integer annee) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<InfoMouvement> getInfoMvtByAnneeAndDepartment(Integer annee, String deptcode) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<InfoMouvement> getInfoMvtByAnneeAndDiscipline(Integer annee, String discco) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<InfoMouvement> getInfoMvtAcademiesAndAnnee(Integer annee) {
		// TODO Auto-generated method stub
		return null;
	}
}
