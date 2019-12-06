package fr.education.gouv.cartographie.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import fr.education.gouv.cartographie.presentation.HtmlComposant;

public class MainApplication {

	public static void main(String[] args) {
		try {
			HtmlComposant htmlpage = new HtmlComposant();
			Properties properties = new Properties();
			ClassLoader classLoader = MainApplication.class.getClassLoader();
			InputStream input = classLoader.getResourceAsStream("pool.properties");
			properties.load(input);
			String destionation = properties.getProperty("appli.conf.cartographie.html.dir");
			File f = new File(destionation + "tableau1D.html");
			FileWriter fw = new FileWriter(f);
			fw.write(htmlpage.generePageHtml().toString());
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
