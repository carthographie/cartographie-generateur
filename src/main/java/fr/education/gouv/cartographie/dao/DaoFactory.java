package fr.education.gouv.cartographie.dao;

import fr.education.gouv.cartographie.Idao.IAcademieDAO;
import fr.education.gouv.cartographie.Idao.IDepartementDAO;
import fr.education.gouv.cartographie.Idao.IDisciplineDAO;
import fr.education.gouv.cartographie.Idao.IInfoMouvementDAO;

public class DaoFactory {
	private static DaoFactory instance;

	public static DaoFactory getInstance() {
		if (instance == null) {
			instance = new DaoFactory();
		}
		return instance;

	}

	public DaoFactory() {
		super();

	}

	public IAcademieDAO getAcademieDAO() {
		return new AcademieDAO();
	}

	public IDepartementDAO getDepartementDAO() {
		return new DepartementDAO();
	}

	public IDisciplineDAO getDisciplineDAO() {
		return new DisciplineDAO();
	}

	public IInfoMouvementDAO getInfoMouvementDAO() {
		return new InfoMouvementDAO();
	}

}
