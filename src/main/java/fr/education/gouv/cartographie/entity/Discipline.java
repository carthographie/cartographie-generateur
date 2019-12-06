package fr.education.gouv.cartographie.entity;

import lombok.Data;

@Data
public class Discipline {

	private Long id;
	private String discco;
	private String libelleCourt;
	private String libelleLong;

	public Discipline(Long id, String discco, String libelleCourt, String libelleLong) {
		super();
		this.id = id;
		this.discco = discco;
		this.libelleCourt = libelleCourt;
		this.libelleLong = libelleLong;
	}

	public Discipline() {
		super();
	}
}
