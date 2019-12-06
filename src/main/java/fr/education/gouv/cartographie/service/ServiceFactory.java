package fr.education.gouv.cartographie.service;

import fr.education.gouv.cartographie.Iservice.IAcademieService;
import fr.education.gouv.cartographie.Iservice.IDepartementService;
import fr.education.gouv.cartographie.Iservice.IDisciplineService;
import fr.education.gouv.cartographie.Iservice.IInfoMouvementService;

public class ServiceFactory {
	private static ServiceFactory instance;

	public static ServiceFactory getInstance() {
		if (instance == null) {
			instance = new ServiceFactory();
		}
		return instance;

	}

	public ServiceFactory() {
		super();

	}

	public IAcademieService getAcademieService() {
		return new AcademieService();
	}

	public IDepartementService getDepartementService() {
		return new DepartementService();
	}

	public IDisciplineService getDisciplineService() {
		return new DisciplineService();
	}

	public IInfoMouvementService getInfoMouvementService() {
		return new InfoMouvementService();
	}

}
