package fr.education.gouv.cartographie.service;

import java.util.List;

import fr.education.gouv.cartographie.Idao.IInfoMouvementDAO;
import fr.education.gouv.cartographie.Iservice.IInfoMouvementService;
import fr.education.gouv.cartographie.dao.DaoFactory;
import fr.education.gouv.cartographie.db.DBCacheDataCartographie;
import fr.education.gouv.cartographie.entity.Discipline;
import fr.education.gouv.cartographie.entity.InfoMouvement;

public class InfoMouvementService implements IInfoMouvementService {

	private final IInfoMouvementDAO infoMVTdao = DaoFactory.getInstance().getInfoMouvementDAO();

	public InfoMouvementService() {
		super();
	}

	public List<InfoMouvement> getAllInfoMvt() {
		return (List<InfoMouvement>) DBCacheDataCartographie.getInfoMouvements().values();
	}

	public List<InfoMouvement> getAllInfoMvtByAnnee(Integer annee) {
		return (List<InfoMouvement>) DBCacheDataCartographie.getInfoMouvements().get(annee);
	}

	public List<InfoMouvement> getInfoMvtByAnneeAndDepartment(Integer annee, String deptcode) {
		return (List<InfoMouvement>) DBCacheDataCartographie.getInfoMouvements().get(deptcode) ;
	}

	public List<InfoMouvement> getInfoMvtAcademiesAndAnnee(Integer annee) {
		return (List<InfoMouvement>) DBCacheDataCartographie.getInfoMouvements().get(annee) ;
	}

	public List<InfoMouvement> getInfoMvtByAnneeAndDiscipline(Integer annee, String discco) {
		return (List<InfoMouvement>) DBCacheDataCartographie.getInfoMouvements().get(discco) ;
	}

}
