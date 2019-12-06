package fr.education.gouv.cartographie.entity;

import lombok.Data;

@Data
public class Departement {
	private Long id;
	private String depaco;
	private String libelleCourt;
	private String libelleLong;

	public Departement(Long id, String depaco, String libelleCourt, String libelleLong) {
		super();
		this.id = id;
		this.depaco = depaco;
		this.libelleCourt = libelleCourt;
		this.libelleLong = libelleLong;
	}

	public Departement() {
		super();
	}

}
