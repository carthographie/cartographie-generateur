package fr.education.gouv.cartographie.Idao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import fr.education.gouv.cartographie.entity.Discipline;

public interface IDisciplineDAO {
	List<Discipline> getAllDisciplines(Connection connection , String query)throws SQLException;
}
