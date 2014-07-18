package pkgBackingBeans;

import java.io.Serializable;
import java.util.ArrayList;

import pkgEntities.HairColor;
import pkgEntities.Membre;
import pkgEntities.Photo;
import pkgManagers.HobbyManager;
import pkgManagers.PhotoManager;

public class ProfileFavorisBackingBean implements Serializable {

	private MembreBackingBean mbb;
	private Membre membreVisite;
	private String photoProfile;
	private String fumeur;
	private ArrayList<Photo> photosSaufProfile;
	
	
	public MembreBackingBean getMbb() {
		return mbb;
	}
	public void setMbb(MembreBackingBean mbb) {
		this.mbb = mbb;
	}
	public Membre getMembreVisite() {
		membreVisite=mbb.getProfileAmis();
		membreVisite.setListeHobbies(HobbyManager.getListeHobbiesByMembreId(membreVisite.getMembreId()));
		membreVisite.setListePhotos(PhotoManager.getPhotosByMemberId(membreVisite.getMembreId()));
		
		return membreVisite;
	}
	public void setMembreVisite(Membre membreVisite) {
		this.membreVisite = membreVisite;
	}
	public String getPhotoProfile() {
		ArrayList<Photo> listePhotos=new ArrayList<Photo>();
		listePhotos=membreVisite.getListePhotos();
		
		for(Photo p:listePhotos)
		{
			if(p.getIsProfil())
				photoProfile=p.getChemin();
		}
		//photoProfile=PhotoManager.getProfilPhotosByMemberId(membreVisite.getMembreId()).get(0).getChemin();
		return photoProfile;
	}
	public void setPhotoProfile(String photoProfile) {
		this.photoProfile = photoProfile;
	}
	
	public String getFumeur() {
		if(membreVisite.getSmoke())
			fumeur="oui";
		else 
			fumeur="non";
		return fumeur;
	}
	public void setFumeur(String fumeur) {
		this.fumeur = fumeur;
	}
	public ArrayList<Photo> getPhotosSaufProfile() {
	
		photosSaufProfile=membreVisite.getListePhotos();
		//remove photo profile de la liste de photos du user
		for(Photo p:photosSaufProfile)
		{
			if(p.getIsProfil())
				photosSaufProfile.remove(p);
		}
		
		return photosSaufProfile;
	}
	public void setPhotosSaufProfile(ArrayList<Photo> photosSaufProfile) {
		this.photosSaufProfile = photosSaufProfile;
	}
}
