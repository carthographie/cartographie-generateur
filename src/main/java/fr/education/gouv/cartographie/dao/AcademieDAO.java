package fr.education.gouv.cartographie.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import fr.education.gouv.cartographie.Idao.IAcademieDAO;
import fr.education.gouv.cartographie.entity.Academie;

public class AcademieDAO implements IAcademieDAO{
	
	public final String REQUEST = "select * from ACAD ";
	public AcademieDAO() {
		super();
	}
	
	
	protected Academie translateToEntity(ResultSet rs) throws SQLException {
        final Academie instance = new Academie(null, rs.getString(1),rs.getString(2),rs.getString(3));
            
		return instance;
	}


	public List<Academie> getAllAcademies() {
		// TODO Auto-generated method stub
		return null;
	}

}
