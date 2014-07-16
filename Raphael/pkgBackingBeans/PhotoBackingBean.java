package pkgBackingBeans;

import java.io.Serializable;
import java.util.ArrayList;


import pkgEntities.NiveauMembre;
import pkgEntities.Photo;
import pkgManagers.PhotoManager;

public class PhotoBackingBean implements Serializable {
	
	private MembreBackingBean mbb;
	private ArrayList<Photo> listePhotosMembre;
	private boolean showErreur;
	private String messageErreur;
	
	
	public MembreBackingBean getMbb() {
		return mbb;
	}
	public void setMbb(MembreBackingBean mbb) {
		this.mbb = mbb;
	}
	public ArrayList<Photo> getListePhotosMembre() {
		
		listePhotosMembre=mbb.getMembre().getListePhotos();
		
		//supprimer photo du profile de la liste de photos
		for(Photo p:listePhotosMembre)
		{
			if(p.getIsProfil())
				listePhotosMembre.remove(p);
		}
		
		return listePhotosMembre;
	}
	public void setListePhotosMembre(ArrayList<Photo> listePhotosMembre) {
		this.listePhotosMembre = listePhotosMembre;
	}


	public boolean isShowErreur() {
		return showErreur;
	}
	public void setShowErreur(boolean showErreur) {
		this.showErreur = showErreur;
	}
	public String getMessageErreur() {
		return messageErreur;
	}
	public void setMessageErreur(String messageErreur) {
		this.messageErreur = messageErreur;
	}
	public String supprimerPhoto(Photo photoSupprimer)
	{
		String destination=null;
		PhotoManager.deletePhoto(photoSupprimer.getId());
		listePhotosMembre=mbb.getMembre().getListePhotos();//maj de la liste de photos
		
		return destination;
	}
	
	public String ajouterPhoto(String chemin)
	{
		String destination=null;
		
		NiveauMembre niveau=new NiveauMembre();
		niveau=mbb.getMembre().getNiveauMembre();
		int nbMaxPhotos=niveau.getNbPhotosMax();
		
		if(nbMaxPhotos>listePhotosMembre.size())
		{
		
			Photo photo= new Photo();
			photo.setMemberID(mbb.getMembre().getMembreId());
			photo.setChemin(chemin);
			photo.setIsProfil(false);
		
			PhotoManager.addPhoto(photo);
			
		}
		else
		{
			showErreur=true;
			messageErreur="Vous n'avez plus le droit d'ajouter de photos";
		}
		
		
		return destination;
	}

	public String ajouterPhotoProfil(String chemin)
	{
			String destination=null;
			
			//suprrimer lancienne photo du phofil
			ArrayList<Photo> listePhotos=new ArrayList<Photo>();
			listePhotos=mbb.getMembre().getListePhotos();
			int idPhotoProfile=0;
			
			for(Photo photo : listePhotos)
			{
				if(photo.getIsProfil())
					idPhotoProfile=photo.getId();
			}
			
			int photoProfileSupprime=PhotoManager.deletePhoto(idPhotoProfile);
			
			if(photoProfileSupprime>0)
			{
				Photo photo= new Photo();
				photo.setMemberID(mbb.getMembre().getMembreId());
				photo.setChemin(chemin);
				photo.setIsProfil(true);
		
				PhotoManager.addPhoto(photo);
			}
		
		return destination;
	}
	
}
