package fr.education.gouv.cartographie.service;

import java.util.List;

import fr.education.gouv.cartographie.Idao.IDepartementDAO;
import fr.education.gouv.cartographie.Iservice.IDepartementService;
import fr.education.gouv.cartographie.dao.DaoFactory;
import fr.education.gouv.cartographie.entity.Departement;

public class DepartementService implements IDepartementService {
	private final IDepartementDAO departementdao = DaoFactory.getInstance().getDepartementDAO();

	public DepartementService() {
		super();
	}

	public List<Departement> getAllDepartements() {
		// TODO Auto-generated method stub
		return departementdao.getAllDepartements();
	}

}
