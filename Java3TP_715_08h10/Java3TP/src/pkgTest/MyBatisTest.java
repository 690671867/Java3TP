package pkgTest;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import org.junit.Test;

import pkgEntities.Categorie;
import pkgEntities.Clinsdoeil;
import pkgEntities.Favoris;
import pkgEntities.Membre;
import pkgEntities.Message;
import pkgEntities.Photo;
import pkgManagers.CategorieManager;
import pkgManagers.ClinsdoeilManager;
import pkgManagers.FavorisManager;
import pkgManagers.MembreManager;
import pkgManagers.MessageManager;
import pkgManagers.PhotoManager;

public class MyBatisTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	
//	
//	@Test 
//	public void addClinTest(){
//		Clinsdoeil clin = new Clinsdoeil();
//		clin.setFromId(1);
//		clin.setToId(2);
//		
//		System.out.println(ClinsdoeilManager.addClindoeil(clin));
//		
//	}
	
	
	
//	@Test 
//	public void getNombreClinRecusTest(){
//		Clinsdoeil clin = new Clinsdoeil();
//		clin.setFromId(1);
//		clin.setToId(2);;
//		
//		System.out.println(ClinsdoeilManager.getNombreClinRecus(2));
//		
//	}
	
	

//	@Test
//	public void addFavorisTest(){
//		System.out.println(FavorisManager.addFavoris(new Date(), 23, 30));
//	}
	
	
//	@Test
//	public void deleteFavorisTest(){
//		System.out.println(FavorisManager.deleteFavoris(23, 30));
//	}
	
	
//	@Test
//	public void getFavorisByMemberIdTest(){
//		ArrayList<Favoris> liste = FavorisManager.getFavorisByMemberId(1);
//		for(Favoris f : liste){
//			System.out.println(f);
//		}
//	}
	
	
	
//	@Test
//	public void getListeFavorisOnlineTest(){
//		ArrayList<Favoris> liste = FavorisManager.getListeFavorisOnline(1);
//		for(Favoris f : liste){
//			System.out.println(f);
//		}
//	}
	
	
//	@Test
//	public void getPhotosByMemberIdTest(){
//		ArrayList<Photo> liste = PhotoManager.getPhotosByMemberId(1);
//		for(Photo p : liste){
//			System.out.println(p);
//		}
//	}
//	
//	
//	@Test
//	public void getProfilPhotosByMemberIdTest(){
//		ArrayList<Photo> liste = PhotoManager.getProfilPhotosByMemberId(1);
//		for(Photo p : liste){
//			System.out.println(p);
//		}
//	}
	
	
//	@Test
//	public void addPhotoTest(){
//		Photo photo = new Photo();
//		photo.setIsProfil(true);
//		photo.setMemberID(1);
//		photo.setChemin("chcccc");
//		
//		PhotoManager.addPhoto(photo);
//	}
//	
//	
//	@Test
//	public void deletePhotoTest(){		
//		PhotoManager.deletePhoto(25);
//	}
//	
	
	
//	@Test
//	public void getListeMessagesRecusByMemberIdTest(){
//		ArrayList<Message> liste = MessageManager.getListeMessagesRecusByMemberId(1);
//		for(Message m : liste){
//			System.out.println(m);
//		}
//	}
	
//	@Test
//	public void getListeMessagesEnvoyesByMemberIdTest(){
//		ArrayList<Message> liste = MessageManager.getListeMessagesEnvoyesByMemberId(2);
//		for(Message m : liste){
//			System.out.println(m);
//		}
//		
//	}
	
	
//	@Test
//	public void addMessageTest(){
//		Message m =  new Message();
//		m.setMsgTo(2);
//		m.setMsgFrom(1);
//		m.setContenu("aaaaaaaa");
//		
//		MessageManager.addMessage(m);
//		
//	}
	
	
//	@Test
//	public void getListeMessagesByMembersTest(){
//		ArrayList<Message> liste = MessageManager.getListeMessagesByMembers(1,2);
//		for(Message m : liste){
//			System.out.println(m);
//		}
//	}
//	
//	@Test
//	public void marquerMessagesTest(){
//		System.out.println(MessageManager.marquerMessages(2, false));
//	}
	
	
	
	
	
//	@Test
//	public void getTousLesMembresTest(){
//		//System.out.println(MembreManager.getTousLesMembres().get(0).getHairColor().getDescription());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getEyeColor().getDescription());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getSkinColor().getDescription());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getInformed_added_by_others());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getWeightRange().getDescription());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getCity().getDescription());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getCategorie().getDescription());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getStatus().getDescription());
//	}
//	
	
	@Test
	public void getListeCategoriesTest(){
		ArrayList<Categorie> list = CategorieManager.getListeCategories();
		for(Categorie c : list){
			System.out.println(c);
		}
	}

	
}
