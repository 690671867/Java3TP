package backingBean;

import java.io.Serializable;

import manager.ManagerVehicules;
import entites.Vehicules;

public class ModifierVehiculeBackingBean implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private Vehicules vehicule;

	public Vehicules getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicules vehicule) {
		this.vehicule = vehicule;
	}
	
	
	public String modifier(){
		
		String maj=null;
		Integer ligneAffectee=ManagerVehicules.modifierVehicule(vehicule);
		
		if (ligneAffectee>0) {
			
			maj="vehiculeModifierAvecSucces";
		}
		
		return maj;
	}

}
