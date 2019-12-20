package fr.education.gouv.cartographie.utils;

import java.util.List;

import fr.education.gouv.cartographie.entity.InfoMouvement;

public abstract  class HtmlComposant {


	public  StringBuilder genereLinkA(String href , String title , String value) {
		StringBuilder componentBuilder = new StringBuilder();
		componentBuilder.append("<a href =\"");
		componentBuilder.append(href);
		componentBuilder.append(" class=\"\"  >");
		componentBuilder.append(value);
		componentBuilder.append("</a>");
		return componentBuilder;
	}


}
