package fr.education.gouv.cartographie.entity;

import lombok.Data;

@Data
public class InfoMouvement {
	private Long id;
	private String codeDepartment;
	private String codeAcademie;
	private String codeDisicpline;
	private String typeEnseignant;
	private Integer nbrEntrant;
	private Integer nbrSortant;
	private Integer barEntree;
	private Integer barSortis;
	private String infoSup;
	private Integer annee;

	public InfoMouvement() {
		super();
	}

	public InfoMouvement(Long id, String codeDepartment, String codeAcademie, String codeDisicpline,
			String typeEnseignant, Integer nbrEntrant, Integer nbrSortant, Integer barEntree, Integer barSortis,
			String infoSup, Integer annee) {
		super();
		this.id = id;
		this.codeDepartment = codeDepartment;
		this.codeAcademie = codeAcademie;
		this.codeDisicpline = codeDisicpline;
		this.typeEnseignant = typeEnseignant;
		this.nbrEntrant = nbrEntrant;
		this.nbrSortant = nbrSortant;
		this.barEntree = barEntree;
		this.barSortis = barSortis;
		this.infoSup = infoSup;
		this.annee = annee;
	}
}
