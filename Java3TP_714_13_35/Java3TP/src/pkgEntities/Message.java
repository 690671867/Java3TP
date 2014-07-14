package pkgEntities;

import java.io.Serializable;

import jxl.write.DateTime;

public class Message implements Serializable {
	private int id;
	private int msgFrom;
	private int msgTo;
	private DateTime sendDate;
	private String contenu;
	private Boolean estDejaVu;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMsgFrom() {
		return msgFrom;
	}
	public void setMsgFrom(int msgFrom) {
		this.msgFrom = msgFrom;
	}
	public int getMsgTo() {
		return msgTo;
	}
	public void setMsgTo(int msgTo) {
		this.msgTo = msgTo;
	}
	public DateTime getSendDate() {
		return sendDate;
	}
	public void setSendDate(DateTime sendDate) {
		this.sendDate = sendDate;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Boolean getEstDejaVu() {
		return estDejaVu;
	}
	public void setEstDejaVu(Boolean estDejaVu) {
		this.estDejaVu = estDejaVu;
	}
	
	
}
