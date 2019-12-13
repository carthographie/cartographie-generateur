package fr.education.gouv.cartographie.Idao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import fr.education.gouv.cartographie.entity.Academie;

public interface IAcademieDAO {
	List<Academie> getAllAcademies(Connection connection , String query)throws SQLException;
}
