package entites;

import java.io.Serializable;

public class Vehicules implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int no;
	private int noSerie;
	private String modele;
	private int annee;
	private double prix;
	private int marqueID;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getNoSerie() {
		return noSerie;
	}
	public void setNoSerie(int noSerie) {
		this.noSerie = noSerie;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getMarqueID() {
		return marqueID;
	}
	public void setMarqueID(int marqueID) {
		this.marqueID = marqueID;
	}
	

}
