package fr.education.gouv.cartographie.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.education.gouv.cartographie.Iservice.IAcademieService;
import fr.education.gouv.cartographie.Iservice.IDepartementService;
import fr.education.gouv.cartographie.Iservice.IDisciplineService;
import fr.education.gouv.cartographie.constants.Const;
import fr.education.gouv.cartographie.constants.LinkPagesEnum;
import fr.education.gouv.cartographie.db.DBCacheDataCartographie;
import fr.education.gouv.cartographie.entity.Academie;
import fr.education.gouv.cartographie.entity.Departement;
import fr.education.gouv.cartographie.entity.Discipline;
import fr.education.gouv.cartographie.service.ServiceFactory;
import fr.education.gouv.cartographie.utils.HtmlPageGenrator;

public class CartoEntryPoint {
	private IDisciplineService disciplineService = ServiceFactory.getInstance().getDisciplineService();
	private IDepartementService departmentService = ServiceFactory.getInstance().getDepartementService();
	private IAcademieService academieService = ServiceFactory.getInstance().getAcademieService();

	public void lancer(String[] args) {
		String fileName = "";
		if (args != null) {
			for (String arg : args) {
				fileName += "-" + arg;
			}
		}
		DBCacheDataCartographie.loadCache(fileName);
		List<String> paths = new ArrayList<>();
		paths.add(LinkPagesEnum.ANNEES.getHtmlPageLink() + LinkPagesEnum.ANNEES.getHtmlPageName());
		HtmlPage htmlpage = null;
		try {
		for (LinkPagesEnum link : LinkPagesEnum.values()) {

			String path = link.getHtmlPageLink();
			if (path.contains("?")) {
				path = path.replaceFirst("\\?", Const.DEFAULT_YEAR);
			}
			path +=  link.getHtmlPageName();
			switch(link)
			{
			case ANNEES: 
			{
				htmlpage = new YearComposant();
				HtmlPageGenrator.genereHtml(path, htmlpage);
				break;
			}
			case ENS_TYPE: 
			{
				htmlpage = new YearComposant();
				HtmlPageGenrator.genereHtml(path, htmlpage);
				break;
			}
			case DISCIPLINES: 
			{
				htmlpage = new YearComposant();
				HtmlPageGenrator.genereHtml(path, htmlpage);
				break;
			}
			case CARTE_ACA: 
			{
				
				List<Discipline> dispilines = disciplineService.getAllDisciplines();
				for (Discipline disicipline : dispilines) {
					path = path.replaceFirst("\\?", disicipline.getDiscco());
					htmlpage = new CartoAcademieComposant();
					paths.add(path);
					HtmlPageGenrator.genereHtml(path, htmlpage);
					List<Academie> academies = academieService.getAllAcademies();
					for (Academie academie : academies) {
						String acadPath = path.replaceFirst(Const.HTML_EXTENTION,
								"-details-" + academie.getAcaco() + Const.HTML_EXTENTION);
						htmlpage = new TableAcademyComposant();
						HtmlPageGenrator.genereHtml(acadPath, htmlpage);
						paths.add(acadPath);
					}
				}
				break;
			}
			case CARTE_DEP: 
			{
				htmlpage = new CartoDepartmentComposant();
				HtmlPageGenrator.genereHtml(path, htmlpage);
				paths.add(path);
				List<Departement> departements = departmentService.getAllDepartements();
				for (Departement dept : departements) {
					htmlpage = new TableDepartmentComposant();
					String depPath = path.replaceFirst(Const.HTML_EXTENTION,
							"-details-" + dept.getDepaco() + Const.HTML_EXTENTION);
					HtmlPageGenrator.genereHtml(depPath, htmlpage);
				}
				break;
			}
			}
			
		}
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
