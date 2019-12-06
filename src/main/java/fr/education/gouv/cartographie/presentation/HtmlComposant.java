package fr.education.gouv.cartographie.presentation;

import java.util.List;

import fr.education.gouv.cartographie.entity.InfoMouvement;

public class HtmlComposant {

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
	public StringBuilder genereHeader() {
		StringBuilder headerBuilder = new StringBuilder();
		headerBuilder.append("<head>");
		headerBuilder.append("<title> hello carto </title>");
		headerBuilder.append("</head>");
		return headerBuilder;
	}

	public StringBuilder genereFooter() {
		StringBuilder footerBuilder = new StringBuilder();
		return footerBuilder;
	}
	public StringBuilder generePageHtml() {
		StringBuilder pageHtmlBuilder = new StringBuilder();
		pageHtmlBuilder.append("<html>");
		pageHtmlBuilder.append(genereHeader());
		pageHtmlBuilder.append(genereFooter());
		pageHtmlBuilder.append("</html>");
		return pageHtmlBuilder;
	}
}
