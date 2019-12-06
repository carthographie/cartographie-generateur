package fr.education.gouv.cartographie.Iservice;

import java.util.List;

import fr.education.gouv.cartographie.entity.Academie;
import fr.education.gouv.cartographie.entity.Discipline;

public interface IDisciplineService {
	List<Discipline> getAllDisciplines();
}
