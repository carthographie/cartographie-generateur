package fr.education.gouv.cartographie.entity;

import lombok.Data;

@Data
public class Academie {
	private Long id;
	private String acaco;
	private String libelleCourt;
	private String libelleLong;

	public Academie(Long id, String acaco, String libelleCourt, String libelleLong) {
		super();
		this.id = id;
		this.acaco = acaco;
		this.libelleCourt = libelleCourt;
		this.libelleLong = libelleLong;
	}

	public Academie() {
		super();
	}

}
