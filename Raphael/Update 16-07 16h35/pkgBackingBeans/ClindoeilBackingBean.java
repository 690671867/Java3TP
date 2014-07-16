package pkgBackingBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import pkgEntities.Clinsdoeil;
import pkgManagers.ClinsdoeilManager;
import pkgManagers.MessageManager;

public class ClindoeilBackingBean implements Serializable {

	private MembreBackingBean mbb;
	private ArrayList<Clinsdoeil> listeClin;
	
	public MembreBackingBean getMbb() {
		return mbb;
	}

	public void setMbb(MembreBackingBean mbb) {
		this.mbb = mbb;
	}

	public ArrayList<Clinsdoeil> getListeClin() {
		listeClin=ClinsdoeilManager.getClinsdoeilRecus(mbb.getMembre().getMembreId());
			
		return listeClin;
	}

	public void setListeClin(ArrayList<Clinsdoeil> listeClin) {
		this.listeClin = listeClin;
	}

	public String repondreClin(Clinsdoeil clinARepondre)
	{
		String destination=null;
		//creation du clin reponse
		Clinsdoeil clinReponse=new Clinsdoeil();
		clinReponse.setDateEnvoi(new Date());
		clinReponse.setFromId(mbb.getMembre().getMembreId());
		clinReponse.setToId(clinARepondre.getFromId());
		int repondu=0;
		repondu=ClinsdoeilManager.addClindoeil(clinReponse);
		
		if(repondu>0)
			destination="oui";
		
		return destination;
	}
	
	public String deleteClin(Clinsdoeil clinSupprimer)
	{
		String destination=null;
		int deleted=0;
		deleted=ClinsdoeilManager.deleteClindoeil(clinSupprimer);
		
		if(deleted>0){
			destination="oui";
			//metre a jour liste de clins
			listeClin=ClinsdoeilManager.getClinsdoeilRecus(mbb.getMembre().getMembreId());
		}
		return destination;
	}
}
