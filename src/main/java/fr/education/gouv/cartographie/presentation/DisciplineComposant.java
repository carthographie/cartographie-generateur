package fr.education.gouv.cartographie.presentation;

import java.util.List;

import fr.education.gouv.cartographie.entity.InfoMouvement;

public   class DisciplineComposant extends HtmlPage{

	@Override
	public StringBuilder genereBody(List<InfoMouvement> infoMvts) {
		StringBuilder bodyBuilder = new StringBuilder();
		bodyBuilder.append("<body>");
		//bodyBuilder.append(genereTableau(infoMvts));
		bodyBuilder.append("</body>");
		return bodyBuilder;
	}


	
}
