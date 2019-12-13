package fr.education.gouv.cartographie.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import fr.education.gouv.cartographie.db.DBCacheDataCartographie;
import fr.education.gouv.cartographie.db.DBCartographie;
import fr.education.gouv.cartographie.db.DBManagerCartorgraphie;
import fr.education.gouv.cartographie.presentation.HtmlComposant;

public class MainApplication {
	public static void main(String[] args) {
		String fileName = "";
		if (args != null) {
			for (String arg : args) {
				fileName += "-" + arg;
			}
		}
		DBCacheDataCartographie.loadCache(fileName);
		

	}

}
