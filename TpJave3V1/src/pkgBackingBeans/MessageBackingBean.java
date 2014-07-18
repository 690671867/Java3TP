package pkgBackingBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import pkgEntities.Membre;
import pkgEntities.Message;
import pkgManagers.MembreManager;
import pkgManagers.MessageManager;
import services.SendEmail;

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
		reponse.setReplyToMsgId(reponse.getMessageid());
		reponse.setSendDate(new Date());
		
		int ajoute=0;
		ajoute=MessageManager.addMessage(reponse);
		//savoir si qui a envoye le message veut recevoir une reponse en courriel
		int idUser=messageARepondre.getMsgFrom();
		Membre membreARepondre=MembreManager.getMembreById(idUser);
		boolean recevoirCourriel=false;
		recevoirCourriel=membreARepondre.getInformed_message_received();
		
		if(ajoute>0){
			destination="oui";
			if(recevoirCourriel)
				SendEmail.envoyerMail(mbb.getMembre(), membreARepondre, "message");
			
		}
		return destination;
	}
	
	public String supprimerMessage(Message messageASupprimer)
	{
		String destination=null;
		
		int deleted=MessageManager.deleteMessage(messageASupprimer);
		
		if(deleted>0){
			destination="oui";
			//metre a jour liste de messages
			mbb.getMembre().setListeMessagesRecus(MessageManager.getListeMessagesRecusByMemberId(mbb.getMembre().getMembreId()));
		}
		return destination;
	}
}