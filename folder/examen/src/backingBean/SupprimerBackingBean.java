package backingBean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import manager.ManagerVehicules;
import entites.Vehicules;



@ManagedBean
@SessionScoped

public class SupprimerBackingBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Vehicules vehicule;


	public void ecouteurBoutonYes(ActionEvent event){
		
		
		ManagerVehicules.supprimerVehicule(vehicule);
	}
	
	public Vehicules getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicules vehicule) {
		this.vehicule = vehicule;
	}
	
}
