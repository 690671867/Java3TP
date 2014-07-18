package backingBean;

import java.io.Serializable;

import manager.ManagerVehicules;
import entites.Vehicules;



public class NouveauVehiculeBackingBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int no;
	private int noSerie;
	private String modele;
	private int annee;
	private double prix;
	private int marqueID;
	
	public int getMarqueID() {
		return marqueID;
	}

	public void setMarqueID(int marqueID) {
		this.marqueID = marqueID;
	}

	private Vehicules vehicule;
	
	
	
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

	public Vehicules getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicules vehicule) {
		this.vehicule = vehicule;
	}

	public String sauvegarder(){
		
		String sauvegarder=null;
		this.vehicule=new Vehicules();
		this.vehicule.setNo(no);
		this.vehicule.setNoSerie(noSerie);
		this.vehicule.setModele(modele);
		this.vehicule.setAnnee(annee);
		this.vehicule.setPrix(prix);
		this.vehicule.setMarqueID(marqueID);
		
		Integer ligneAffectees=ManagerVehicules.insertVehicule(vehicule);
		
		if (ligneAffectees>0) {
			
			sauvegarder="NouveauVehiculeSauvegarde";
		}
		
		return sauvegarder;
		
	}

}
