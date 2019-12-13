package fr.education.gouv.cartographie.service;

import java.util.List;

import fr.education.gouv.cartographie.Idao.IDisciplineDAO;
import fr.education.gouv.cartographie.Iservice.IDisciplineService;
import fr.education.gouv.cartographie.dao.DaoFactory;
import fr.education.gouv.cartographie.db.DBCacheDataCartographie;
import fr.education.gouv.cartographie.entity.Academie;
import fr.education.gouv.cartographie.entity.Departement;
import fr.education.gouv.cartographie.entity.Discipline;

public class DisciplineService implements IDisciplineService {
	private final IDisciplineDAO disciplinedao = DaoFactory.getInstance().getDisciplineDAO();

	public DisciplineService() {
		super();
	}

	public List<Discipline> getAllDisciplines() {
		return (List<Discipline>) DBCacheDataCartographie.getDisciplines().values();
	}

	public List<Discipline> getDisciplineByCode(String acaCode) {
		return (List<Discipline>) DBCacheDataCartographie.getDisciplines().get(acaCode);
	}
}
