package fr.education.gouv.cartographie.presentation;

import java.util.List;

import fr.education.gouv.cartographie.entity.InfoMouvement;

public   class TableAcademyComposant extends HtmlPage{

	public StringBuilder genereTableau(List<InfoMouvement> infoMvts) {
		StringBuilder tableauBuilder = new StringBuilder();
		return tableauBuilder;
	}
	public StringBuilder genereBody(List<InfoMouvement> infoMvts) {
		StringBuilder bodyBuilder = new StringBuilder();
		bodyBuilder.append("<body>");
		bodyBuilder.append(genereTableau(infoMvts));
		bodyBuilder.append("</body>");
		return bodyBuilder;
	}
	
}
