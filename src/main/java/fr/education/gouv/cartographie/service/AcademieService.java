package fr.education.gouv.cartographie.service;

import java.util.List;

import fr.education.gouv.cartographie.Idao.IAcademieDAO;
import fr.education.gouv.cartographie.Iservice.IAcademieService;
import fr.education.gouv.cartographie.dao.DaoFactory;
import fr.education.gouv.cartographie.entity.Academie;

public class AcademieService implements IAcademieService {
	private final IAcademieDAO academiedao = DaoFactory.getInstance().getAcademieDAO();

	public AcademieService() {
		super();
	}

	public List<Academie> getAllAcademies() {
		// TODO Auto-generated method stub
		return academiedao.getAllAcademies();
	}

}
