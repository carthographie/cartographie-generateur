package fr.education.gouv.cartographie.Idao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import fr.education.gouv.cartographie.entity.InfoMouvement;

public interface IInfoMouvementDAO {
	List<InfoMouvement> getAllInfoMvt(Connection connection)throws SQLException;
	List<InfoMouvement> getAllInfoMvtByAnnee(Connection connection , Integer annee)throws SQLException;
	List<InfoMouvement> getInfoMvtByAnneeAndDepartment(Connection connection,Integer annee,String deptcode)throws SQLException;
	List<InfoMouvement> getInfoMvtAcademiesAndAnnee(Connection connection,Integer annee)throws SQLException;
	List<InfoMouvement> getInfoMvtByAnneeAndDiscipline(Connection connection,Integer annee,String discco)throws SQLException;
}
