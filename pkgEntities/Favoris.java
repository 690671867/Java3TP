package pkgEntities;

import java.io.Serializable;

import jxl.write.DateTime;

public class Favoris implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private DateTime dateAjout;
	private int membreFromId;
	private int membreToId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public DateTime getDateAjout() {
		return dateAjout;
	}
	public void setDateAjout(DateTime dateAjout) {
		this.dateAjout = dateAjout;
	}
	public int getMembreFromId() {
		return membreFromId;
	}
	public void setMembreFromId(int membreFromId) {
		this.membreFromId = membreFromId;
	}
	public int getMembreToId() {
		return membreToId;
	}
	public void setMembreToId(int membreToId) {
		this.membreToId = membreToId;
	}
	
}
