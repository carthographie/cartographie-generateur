package fr.education.gouv.cartographie.service;

import java.util.ArrayList;
import java.util.List;

import fr.education.gouv.cartographie.Idao.IDepartementDAO;
import fr.education.gouv.cartographie.Iservice.IDepartementService;
import fr.education.gouv.cartographie.dao.DaoFactory;
import fr.education.gouv.cartographie.db.DBCacheDataCartographie;
import fr.education.gouv.cartographie.entity.Academie;
import fr.education.gouv.cartographie.entity.Departement;
import fr.education.gouv.cartographie.entity.Discipline;

public class DepartementService implements IDepartementService {
	private final IDepartementDAO departementdao = DaoFactory.getInstance().getDepartementDAO();

	public DepartementService() {
		super();
	}

	public List<Departement> getAllDepartements() {
		List<Departement> listDepartement = new ArrayList<Departement>(DBCacheDataCartographie.getDepartements().values());
		return listDepartement;
	}
	public List<Academie> getDepartementByCode(String acaCode) {
		return (List<Academie>) DBCacheDataCartographie.getDepartements().get(acaCode);
	}
}
