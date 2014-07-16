package pkgBackingBeans;

import java.io.Serializable;
import java.util.Date;

import pkgEntities.Message;
import pkgManagers.MessageManager;

public class MessageBackingBean implements Serializable {

	private MembreBackingBean mbb;
	private String contenu;
	
	//getters et setters
	public MembreBackingBean getMbb() {
		return mbb;
	}

	public void setMbb(MembreBackingBean mbb) {
		this.mbb = mbb;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	//methodes
	public String repondreMessage(Message messageARepondre)
	{
		String destination=null;
		
		Message reponse=new Message();
		reponse.setContenu(contenu);
		reponse.setDejalu(false);
		reponse.setMsgFrom(mbb.getMembre().getMembreId());
		reponse.setMsgTo(messageARepondre.getMsgFrom());
		reponse.setReplyToMsgId(reponse.getId());
		reponse.setSendDate(new Date());
		
		int ajoute=0;
		ajoute=MessageManager.addMessage(reponse);
		
		if(ajoute>0)
		destination="oui";
		return destination;
	}
	
	public String supprimerMessage(Message messageASupprimer)
	{
		String destination=null;
		
		int deleted=MessageManager.deleteMessage(messageASupprimer);
		
		if(deleted>0){
			destination="oui";
			//metre a jour liste de messages
			mbb.getMembre().setListeMessages(MessageManager.getListeMessagesRecusByMemberId(mbb.getMembre().getMembreId()));
		}
		return destination;
	}
}