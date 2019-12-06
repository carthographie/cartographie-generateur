package fr.education.gouv.cartographie.service;

import java.util.List;

import fr.education.gouv.cartographie.Idao.IDisciplineDAO;
import fr.education.gouv.cartographie.Iservice.IDisciplineService;
import fr.education.gouv.cartographie.dao.DaoFactory;
import fr.education.gouv.cartographie.entity.Discipline;

public class DisciplineService implements IDisciplineService {
	private final IDisciplineDAO disciplinedao = DaoFactory.getInstance().getDisciplineDAO();

	public DisciplineService() {
		super();
	}

	public List<Discipline> getAllDisciplines() {
		// TODO Auto-generated method stub
		return disciplinedao.getAllDisciplines();
	}
}
