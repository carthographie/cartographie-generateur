package fr.education.gouv.cartographie.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.education.gouv.cartographie.constants.LinkPagesEnum;
import fr.education.gouv.cartographie.db.DBCacheDataCartographie;
import fr.education.gouv.cartographie.presentation.CartoEntryPoint;
import fr.education.gouv.cartographie.presentation.HtmlPage;
import fr.education.gouv.cartographie.service.DisciplineService;
import fr.education.gouv.cartographie.service.ServiceFactory;
import fr.education.gouv.cartographie.utils.HtmlPageGenrator;

public class MainApplication {
	public static void main(String[] args) {
		String fileName = "";
		if (args != null) {
			for (String arg : args) {
				fileName += "-" + arg;
			}
		}
		
		DBCacheDataCartographie.loadCache(fileName);
		CartoEntryPoint carto = new CartoEntryPoint();
		carto.lancer(args);
	}

}
