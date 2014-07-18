package backingBean;

import java.io.Serializable;
import java.util.ArrayList;

import manager.ManagerMarques;
import entites.Marques;



public class MarquesBackingBean implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private ArrayList<Marques> listeMarques;
	private Marques  marque;

	public Marques getMarque() {
		System.out.println(marque.getMarqueID());
		return marque;
	}

	public void setMarque(Marques marque) {
		this.marque = marque;
	}

	public ArrayList<Marques> getListeMarques() {
		
		listeMarques=ManagerMarques.getListeMarques();
		return listeMarques;
	}

	public void setListeMarques(ArrayList<Marques> listeMarques) {
		this.listeMarques = listeMarques;
	}
	
	
	

}
