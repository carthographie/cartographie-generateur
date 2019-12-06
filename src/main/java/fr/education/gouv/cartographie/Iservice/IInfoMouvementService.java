package fr.education.gouv.cartographie.Iservice;

import java.util.List;
import fr.education.gouv.cartographie.entity.InfoMouvement;

public interface IInfoMouvementService {
	List<InfoMouvement> getAllInfoMvt();
	List<InfoMouvement> getAllInfoMvtByAnnee(Integer annee);
	List<InfoMouvement> getInfoMvtByAnneeAndDepartment(Integer annee,String deptcode);
	List<InfoMouvement> getInfoMvtAcademiesAndAnnee(Integer annee);
	List<InfoMouvement> getInfoMvtByAnneeAndDiscipline(Integer annee,String discco);
}
