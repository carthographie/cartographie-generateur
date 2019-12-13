package fr.education.gouv.cartographie.constants;

public enum LinkPagesEnum {
	ANNEES("annee.html", "/carto/annee/annee.html"),
	ENS_TYPE("enseignantDegres.html", "/carto/annee/?/enseignantDegres.html"),
	DISCIPLINES("disciplines.html", "/carto/annee/?/2D/disciplines.html"),
	CARTE_ACA("annee.html", "/carto/annee/?/2D/?/academies.html"),
	CARTE_DEP("annee.html", "/carto/annee/?/1D/departements.html"),
	TABLEAU_MVT_1D("mouvements1D_depCode.html", "/carto/annee/?/1D/mouvements1D_depCode.html"),
	TABLEAU_MVT_2D("mouvements2D_acaCode.html", "/carto/annee/?/2D/?/mouvements2D_acaCode.html");
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
