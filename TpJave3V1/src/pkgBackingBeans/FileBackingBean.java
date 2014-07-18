package pkgBackingBeans;

import java.io.File;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.icefaces.ace.component.fileentry.FileEntry;
import org.icefaces.ace.component.fileentry.FileEntryEvent;
import org.icefaces.ace.component.fileentry.FileEntryResults;
import org.icefaces.ace.component.fileentry.FileEntryResults.FileInfo;


@ManagedBean
@RequestScoped

public class FileBackingBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String chemin;
	
	public String getChemin() {
		return chemin;
	}

	public void setChemin(String chemin) {
		this.chemin = chemin;
	}

	public void uploadFileMembre(FileEntryEvent ev){
		
		//mettre la main sur le fileEntry
		FileEntry fiE = (FileEntry)ev.getSource();
		//récupérer ses results
		FileEntryResults fr = fiE.getResults();
		
		// Create an instance of SimpleDateFormat used for formatting 
				// the string representation of date (month/day/year)
				DateFormat df = new SimpleDateFormat("ddMMyyyyHHmmss");

				// Get the date today using Calendar object.
				Date today = Calendar.getInstance().getTime();        
				// Using DateFormat format method we can create a string 
				// representation of a date with the defined format.
				String reportDate = df.format(today);
		
		
		//boucler sur les FileInfo
		for(FileEntryResults.FileInfo fi: fr.getFiles()){
			//s'assurer que le fichier est enregistrer
			if(fi.isSaved()){
				System.out.println("le nom ========= "+reportDate+fi.getFileName());
				//recu le fichier
				File f = fi.getFile();
				
				//TODO verifier que c'est le bon type de fichier
				//renommer
				try {
					String cheminApp=FacesContext.getCurrentInstance().getExternalContext().getRealPath("/");
					String newch=cheminApp;
					
					
					boolean ren=f.renameTo(new File(newch+"photos/"+reportDate+fi.getFileName()));
					
					if (ren) {
						this.chemin=newch+"photos/"+reportDate+fi.getFileName();
						System.out.println(newch);
					}
					else{
						System.out.println("pas possible. "+newch);
					}
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
				
				
				//ajouter un message 
				FacesContext.getCurrentInstance().addMessage(fiE.getClientId(),new FacesMessage("le fichier a été uploadé"));
			}}
			
		}

}
