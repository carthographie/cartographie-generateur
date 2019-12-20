package fr.education.gouv.cartographie.constants;

public enum LinkPagesEnum {
	ANNEES("annee.html", "/carto/annee/"),
	ENS_TYPE("enseignantDegres.html", "/carto/annee/?/"),
	DISCIPLINES("disciplines.html", "/carto/annee/?/2D/"),
	CARTE_ACA("cartoAcademies.html", "/carto/annee/?/2D/?/"),
	CARTE_DEP("cartoDepartements.html", "/carto/annee/?/1D/");

	String htmlPageName;
	String htmlPageLink;
	

	private LinkPagesEnum(String htmlPageName, String htmlPageLink) {
		this.htmlPageName = htmlPageName;
		this.htmlPageLink = htmlPageLink;
	}

	public String getHtmlPageName() {
		return this.htmlPageName;
	}

	public String getHtmlPageLink() {
		return this.htmlPageLink;
	}
}
