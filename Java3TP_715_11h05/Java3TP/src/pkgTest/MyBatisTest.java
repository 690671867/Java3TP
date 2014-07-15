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
import pkgEntities.City;
import pkgEntities.Clinsdoeil;
import pkgEntities.EyeColor;
import pkgEntities.Favoris;
import pkgEntities.HairColor;
import pkgEntities.HeightRange;
import pkgEntities.Hobby;
import pkgEntities.SkinColor;
import pkgEntities.Membre;
import pkgEntities.Message;
import pkgEntities.Photo;
import pkgEntities.Status;
import pkgEntities.WeightRange;
import pkgManagers.CategorieManager;
import pkgManagers.CityManager;
import pkgManagers.ClinsdoeilManager;
import pkgManagers.EyeColorManager;
import pkgManagers.FavorisManager;
import pkgManagers.HairColorManager;
import pkgManagers.HeightRangeManager;
import pkgManagers.HobbyManager;
import pkgManagers.SkinColorManager;
import pkgManagers.MembreManager;
import pkgManagers.MessageManager;
import pkgManagers.PhotoManager;
import pkgManagers.StatusManager;
import pkgManagers.WeightRangeManager;

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
//		//System.out.println(MembreManager.getTousLesMembres().get(0).getSkinColor().getDescription());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getEyeColor().getDescription());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getSkinColor().getDescription());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getInformed_added_by_others());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getWeightRange().getDescription());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getCity().getDescription());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getCategorie().getDescription());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getStatus().getDescription());
//	}
//	
	
//	@Test
//	public void getListeCategoriesTest(){
//		ArrayList<Categorie> list = CategorieManager.getListeCategories();
//		for(Categorie c : list){
//			System.out.println(c);
//		}
//	}

	
//	@Test
//	public void getCategorieByIdTest(){
//		Categorie c = CategorieManager.getCategorieById(1);
//			System.out.println(c);
//	}
	
//	@Test
//	public void getListeSkinColorTest(){
//		ArrayList<SkinColor> list = SkinColorManager.getListeSkinColors();
//		for(SkinColor c : list){
//			System.out.println(c);
//		}
//	}
	
	
//	@Test
//	public void getListeSkinColorTest(){
//		ArrayList<SkinColor> list = SkinColorManager.getListeSkinColors();
//		for(SkinColor c : list){
//			System.out.println(c);
//		}
//	}
	
	
//	@Test
//	public void getListeSkinColorByIdTest(){
//		SkinColor c = SkinColorManager.getListeSkinColorById(1);
//			System.out.println(c);
//	}
	
	
//	@Test
//	public void getListeEyeColorTest(){
//		ArrayList<EyeColor> list = EyeColorManager.getListeEyeColors();
//		for(EyeColor c : list){
//			System.out.println(c);
//		}
//	}
//	
	
	
//	@Test
//	public void getListeEyeColorByIdTest(){
//		EyeColor c = EyeColorManager.getListeEyeColorById(1);
//			System.out.println(c);
//	}
	
	
//	@Test
//	public void getListeHairColorTest(){
//		ArrayList<HairColor> list = HairColorManager.getListeHairColors();
//		for(HairColor c : list){
//			System.out.println(c);
//		}
//	}
	
//	@Test
//	public void getListeHairColorByIdTest(){
//		HairColor c = HairColorManager.getListeHairColorById(1);
//			System.out.println(c);
//	}
	
	
//	@Test
//	public void getListeHeightRangesTest(){
//		ArrayList<HeightRange> list = HeightRangeManager.getListeHeightRanges();
//		for(HeightRange c : list){
//			System.out.println(c);
//		}
//	}
	
	
//	@Test
//	public void getListeWeightRangesTest(){
//		ArrayList<WeightRange> list = WeightRangeManager.getListeWeightRanges();
//		for(WeightRange c : list){
//			System.out.println(c);
//		}
//	}
	
	
	
//	@Test
//	public void getWeightRangeByIdTest(){
//		WeightRange wr = WeightRangeManager.getWeightRangeById(1);
//		System.out.println(wr);
//		
//	}
	
	
//	@Test
//	public void getListeCitiesTest(){
//		ArrayList<City> list = CityManager.getListeCities();
//		for(City c : list){
//			System.out.println(c);
//		}
//	}
	
	
//	@Test
//	public void getCityByIdTest(){
//		City c = CityManager.getCityById(1);
//		System.out.println(c);
//		
//	}
	
//	@Test
//	public void getListeHobbiesTest(){
//		ArrayList<Hobby> list = HobbyManager.getListeHobbies();
//		for(Hobby c : list){
//			System.out.println(c);
//		}
//	}
	
	
//	@Test
//	public void getListeStatusTest(){
//		ArrayList<Status> list = StatusManager.getListeStatus();
//		for(Status c : list){
//			System.out.println(c);
//		}
//	}
	
	
	@Test
	public void getStatusByIdTest(){
		Status s = StatusManager.getStatusById(1);
		System.out.println(s);
		
	}
	
}
