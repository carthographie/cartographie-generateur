package fr.education.gouv.cartographie.Idao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import fr.education.gouv.cartographie.entity.Departement;

public interface IDepartementDAO {
	List<Departement> getAllDepartements(Connection connection , String query)throws SQLException;
}
