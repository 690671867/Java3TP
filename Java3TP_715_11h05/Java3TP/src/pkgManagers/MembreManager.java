package pkgManagers;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import pkgEntities.Clinsdoeil;
import pkgEntities.Membre;
import pkgEntities.Message;
import pkgEntities.Photo;
import pkgServices.ConnecteurMyBatis;
import pkgSupportClasses.SearchCriteria;

public class MembreManager {
	@SuppressWarnings("unchecked")
	public static ArrayList<Membre> getTousLesMembres(){
		ArrayList<Membre> listeTousLesMembres = null;
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		try{
			listeTousLesMembres = (ArrayList<Membre>)session.selectList(Membre.class.getName()+".getTousLesMembres");
		} finally{
			session.close();
		}
		return listeTousLesMembres;
	}
	
	//TODO
	public static ArrayList<Membre> getListeFavoris(int memberId){
		ArrayList<Membre> listeFavoris = null;
		
		return listeFavoris;
	}
	
	//TODO
	public static ArrayList<Membre> getListeFavorisOnline(int memberId){
		ArrayList<Membre> listeFavorisOnline = null;
		
		return listeFavorisOnline;
	}
	
	//TODO
	/**
	 * 
	 * @param toMemberId (le membre connecte)
	 * @return
	 */
	public static ArrayList<Message> getMessagesPasLus(int toMemberId){
		ArrayList<Message> listeMessagesPasLus = null;
		
		
		return listeMessagesPasLus;
	}
	
	
	//TODO
	/**
	 * 
	 * @param toMemberId (le membre connecte)
	 * @return
	 */
	public static ArrayList<Message> getMessagesRecus(int toMemberId){
		ArrayList<Message> listeMessagesRecus = null;
		
		
		return listeMessagesRecus;
	}
	
	
	//TODO
	/**
	 * 
	 * @param fromId (le membre connecte)
	 * @param toId  (le favoris)
	 * @return
	 */
	public static ArrayList<Message> getTousLesMessages(int fromId, int toId){
		ArrayList<Message> listeTousLesMessages = null;
		
		
		return listeTousLesMessages;
	}
	
	

	
	//TODO
	public static Membre getMembreByNickname(String nickname){
		Membre m = null;
		
		return m;
	}
	
	
	
	//TODO
	/**
	 * la methode pour la recherche
	 * @param searchCriteria
	 * @return
	 */
	public static ArrayList<Membre> getSearchMembres(SearchCriteria searchCriteria){
		ArrayList<Membre> listeMembres = null;
		
		return listeMembres;
		
	}
	
	//TODO
	public static int addMembre(Membre m) {
		int ret = 0;
		
		return ret;
	}
	
	//TODO
	/**
	 * la methode pour la modifier le profil
	 * @param m
	 * @return
	 */
	public static int updateMembre(Membre m) {
		int ret = 0;

		return ret;
	}

	

}
