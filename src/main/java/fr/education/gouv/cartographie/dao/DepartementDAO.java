package fr.education.gouv.cartographie.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import fr.education.gouv.cartographie.Idao.IAcademieDAO;
import fr.education.gouv.cartographie.Idao.IDepartementDAO;
import fr.education.gouv.cartographie.entity.Academie;
import fr.education.gouv.cartographie.entity.Departement;


public class DepartementDAO implements  IDepartementDAO{
	public final String REQUEST = "select * from ACAD ";
	public DepartementDAO() {
		super();
	}
	protected Departement translateToEntity(ResultSet rs) throws SQLException {
        final Departement instance = new Departement(null, rs.getString(1),rs.getString(2),rs.getString(3));
            
		return instance;
	}
	public List<Departement> getAllDepartements() {
		// TODO Auto-generated method stub
		return null;
	}

}
