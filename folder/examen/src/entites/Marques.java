package entites;

import java.io.Serializable;

public class Marques implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private String marques;
	private int marqueID;
	
	public String getMarques() {
		System.out.println(marques);
		return marques;
	}
	public void setMarques(String marques) {
		this.marques = marques;
	}
	public int getMarqueID() {
		return marqueID;
	}
	public void setMarqueID(int marqueID) {
		this.marqueID = marqueID;
	}
	

}
