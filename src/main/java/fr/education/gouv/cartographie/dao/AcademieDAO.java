package fr.education.gouv.cartographie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.education.gouv.cartographie.Idao.IAcademieDAO;
import fr.education.gouv.cartographie.entity.Academie;

public class AcademieDAO implements IAcademieDAO{
	

	public AcademieDAO() {
		super();
	}
	
	
	protected Academie translateToEntity(ResultSet rs) throws SQLException {
        final Academie instance = new Academie(null, rs.getString(1),rs.getString(2),rs.getString(3));
            
		return instance;
	}


	@Override
	public List<Academie> getAllAcademies(Connection connection, String query)throws SQLException  {
		List<Academie> academies =  new ArrayList<>(); 
		Statement st = connection.createStatement();
         ResultSet rs = st.executeQuery(query);
         while (rs.next()) {
        	 academies.add(translateToEntity(rs));
         }
         
		return academies;
	}




}
