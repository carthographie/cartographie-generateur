package fr.education.gouv.cartographie.presentation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import fr.education.gouv.cartographie.constants.LinkPagesEnum;
import fr.education.gouv.cartographie.db.DBCacheDataCartographie;
import fr.education.gouv.cartographie.main.MainApplication;

public class HtmlPageGenrator {
	private final static String PARAM_ANNEE = "ANNEE";
	private final static String PARAM_DISCIPLINE = "DISCIPLINE";
	private final static String PARAM_ACA = "ACA";
	private final static String PARAM_DEP = "DEP";
	public static void genereHtml(String path , Map<String,String> pathParams ) {
		try {
			HtmlComposant htmlpage = new HtmlComposant();
			Properties properties = new Properties();
			ClassLoader classLoader = MainApplication.class.getClassLoader();
			InputStream input = classLoader.getResourceAsStream("carto.properties");
			properties.load(input);
			String destionation = properties.getProperty("appli.conf.cartographie.html.dir");
			File f = new File(destionation +path );
			FileWriter fw = new FileWriter(f);
			fw.write(htmlpage.generePageHtml().toString());
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
