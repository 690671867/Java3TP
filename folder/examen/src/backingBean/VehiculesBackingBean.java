package backingBean;

import java.io.Serializable;
import java.util.ArrayList;
import manager.ManagerVehicules;
import entites.Vehicules;



public class VehiculesBackingBean implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private ArrayList<Vehicules> listeVehicules;
	private MarquesBackingBean marquesBackingBean;
	int marqueID;

	public ArrayList<Vehicules> getListeVehicules() {
		
		
		
		
		
		listeVehicules=ManagerVehicules.getListeVehicules(marqueID);
		return listeVehicules;
	}

	public void setListeVehicules(ArrayList<Vehicules> listeVehicules) {
		this.listeVehicules = listeVehicules;
	}
	
	
	
	
	
	public MarquesBackingBean getMarquesBackingBean() {
		return marquesBackingBean;
	}

	public void setMarquesBackingBean(MarquesBackingBean marquesBackingBean) {
		this.marquesBackingBean = marquesBackingBean;
	}
	
	public int getMarqueID() {
		return marqueID;
	}

	public void setMarqueID(int marqueID) {
		this.marqueID = marqueID;
	}

	public String listVehicule()
	{
		System.out.println("lolo");
		String listVehicule="Alle";
		
		listeVehicules=ManagerVehicules.getListeVehicules(marqueID);
		
		return listVehicule;
	}
	

}
