package fr.education.gouv.cartographie.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import fr.education.gouv.cartographie.main.MainApplication;
import fr.education.gouv.cartographie.presentation.HtmlPage;

public class HtmlPageGenrator {
	public static File genereHtml(String path   , HtmlPage htmlpage ) throws IOException {
		File file = null;
		FileWriter fw = null;
		try {
			Properties properties = new Properties();
			ClassLoader classLoader = MainApplication.class.getClassLoader();
			InputStream input = classLoader.getResourceAsStream("carto.properties");
			properties.load(input);
			String destionation = properties.getProperty("appli.conf.cartographie.html.dir.out");
			
			
				String absolutePath = destionation + path;
				System.out.println("absolute path = "+absolutePath);
				file = new File(absolutePath );
				file.getParentFile().mkdirs(); 
			

			fw = new FileWriter(file);
			fw.write(htmlpage.generePageHtml().toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			fw.close();
			
		}
		return file;

	}
	
}
