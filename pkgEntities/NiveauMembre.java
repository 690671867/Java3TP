package pkgEntities;

import java.io.Serializable;

public class NiveauMembre implements Serializable {
	private int id;
	private String description;
	private int nbPhotosMax;
	private int nbFavorisMax;
	private Boolean droitEnvoyerMag;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNbPhotosMax() {
		return nbPhotosMax;
	}
	public void setNbPhotosMax(int nbPhotosMax) {
		this.nbPhotosMax = nbPhotosMax;
	}
	public int getNbFavorisMax() {
		return nbFavorisMax;
	}
	public void setNbFavorisMax(int nbFavorisMax) {
		this.nbFavorisMax = nbFavorisMax;
	}
	public Boolean getDroitEnvoyerMag() {
		return droitEnvoyerMag;
	}
	public void setDroitEnvoyerMag(Boolean droitEnvoyerMag) {
		this.droitEnvoyerMag = droitEnvoyerMag;
	}
	
}
