package fr.education.gouv.cartographie.service;

import java.util.List;

import fr.education.gouv.cartographie.Idao.IInfoMouvementDAO;
import fr.education.gouv.cartographie.Iservice.IInfoMouvementService;
import fr.education.gouv.cartographie.dao.DaoFactory;
import fr.education.gouv.cartographie.entity.InfoMouvement;

public class InfoMouvementService implements IInfoMouvementService {

	private final IInfoMouvementDAO infoMVTdao = DaoFactory.getInstance().getInfoMouvementDAO();

	public InfoMouvementService() {
		super();
	}

	public List<InfoMouvement> getAllInfoMvt() {
		return infoMVTdao.getAllInfoMvt();
	}

	public List<InfoMouvement> getAllInfoMvtByAnnee(Integer annee) {
		// TODO Auto-generated method stub
		return infoMVTdao.getAllInfoMvtByAnnee(annee);
	}

	public List<InfoMouvement> getInfoMvtByAnneeAndDepartment(Integer annee, String deptcode) {
		// TODO Auto-generated method stub
		return infoMVTdao.getInfoMvtByAnneeAndDepartment(annee, deptcode);
	}

	public List<InfoMouvement> getInfoMvtAcademiesAndAnnee(Integer annee) {
		// TODO Auto-generated method stub
		return infoMVTdao.getInfoMvtAcademiesAndAnnee(annee);
	}

	public List<InfoMouvement> getInfoMvtByAnneeAndDiscipline(Integer annee, String discco) {
		// TODO Auto-generated method stub
		return infoMVTdao.getInfoMvtByAnneeAndDiscipline(annee, discco);
	}

}
