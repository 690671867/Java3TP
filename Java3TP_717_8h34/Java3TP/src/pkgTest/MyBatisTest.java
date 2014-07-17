package pkgTest;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import org.junit.Test;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import pkgEntities.Categorie;
import pkgEntities.City;
import pkgEntities.Clinsdoeil;
import pkgEntities.EyeColor;
import pkgEntities.Favoris;
import pkgEntities.HairColor;
import pkgEntities.HeightRange;
import pkgEntities.Hobby;
import pkgEntities.NiveauMembre;
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
import pkgManagers.NiveauMembreManager;
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
//	public void getSkinColorByIdTest(){
//		SkinColor c = SkinColorManager.getSkinColorById(1);
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
	
//	
//	@Test
//	public void getEyeColorByIdTest(){
//		EyeColor c = EyeColorManager.getEyeColorById(1);
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
//	public void getHairColorByIdTest(){
//		HairColor c = HairColorManager.getHairColorById(1);
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
//	public void getListeHobbiesByMembreIdTest(){
//		ArrayList<Hobby> list = HobbyManager.getListeHobbiesByMembreId(1);
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
	
	
//	@Test
//	public void getStatusByIdTest(){
//		Status s = StatusManager.getStatusById(1);
//		System.out.println(s);
//		
//	}
	
	
	@Test
	public void getTousLesMembresTest(){
//		System.out.println(MembreManager.getTousLesMembres().get(0).getSkinColor().getDescription());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getEyeColor().getDescription());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getSkinColor().getDescription());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getInformed_added_by_others());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getWeightRange().getDescription());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getCity().getDescription());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getCategorie().getDescription());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getStatus().getDescription());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getListePhotos().size());
//		System.out.println(MembreManager.getTousLesMembres().get(0).getImagePath());
		
		
//		ArrayList<Photo> listePhotos = MembreManager.getTousLesMembres().get(0).getListePhotos();
//		for(Photo p : listePhotos){
//			System.out.println(p.getChemin());
//		}
//		
		
//		ArrayList<Hobby> listeHobbies = MembreManager.getTousLesMembres().get(0).getListeHobbies();
//		for(Hobby h : listeHobbies){
//			System.out.println(h.getDescription());
//		}
		
		
//		ArrayList<Message> listeMessages = MembreManager.getTousLesMembres().get(0).getListeMessagesRecus();
//		for(Message m : listeMessages) {
//			System.out.println(m.getContenu());
//		}
		
		
//		ArrayList<Message> listeMessagesPasLus = MembreManager.getTousLesMembres().get(0).getListeMessagesPasLus();
//		for(Message m : listeMessagesPasLus) {
//			System.out.println(m.getContenu());
//		}
		
		
	}
	
	
//	@Test
//	public void getFavorisByMembreIdTest(){
//		ArrayList<Membre> listeFavoris = MembreManager.getFavorisByMembreId(1);
//		if(listeFavoris != null){
//			for(Membre m : listeFavoris){
//				System.out.println(m
//						);
//			}
//		}
//	}
	
//	@Test
//	public void getListeFavorisOnlineTest(){
//		ArrayList<Membre> listeFavoris = MembreManager.getListeFavorisOnline(1);
//		if(listeFavoris != null){
//			for(Membre m : listeFavoris){
//				System.out.println(m
//						);
//			}
//		}
//	}

//	@Test
//	public void getListeNiveauMembresTest(){
//		ArrayList<NiveauMembre> list = NiveauMembreManager.getListeNiveauMembres();
//		if(list != null){
//			for(NiveauMembre m : list){
//				System.out.println(m
//						);
//			}
//		}
//		
//	}
	
	
//	@Test
//	public void getMembreByIdTest(){
//		Membre m = MembreManager.getMembreById(1);
//		System.out.println(m);
//	}
//	


//	@Test
//	public void getMembreByNicknameTest(){
//		Membre m = MembreManager.getMembreByNickname("beaubob");
//		System.out.println(m);
//	}
	
//	@Test
//	public void getMembreByNicknamePasswordTest(){
//		Membre m = MembreManager.getMembreByNicknamePassword("beaubob", "12345");
//		System.out.println(m);
//	}
//	

	
//	@Test
//	public void getClinsdoeilRecusTest(){
//		ArrayList<Clinsdoeil> list = ClinsdoeilManager.getClinsdoeilRecus(5);
//		for(Clinsdoeil c : list){
//			System.out.println(c.getClindoeilId());
//		}
//		
//	}
	
	
	@Test
	public void rechercheTest(){
		HashMap<String, Object> hmap = new HashMap<String, Object>();
		hmap.put("categorie_id", "2");
		hmap.put("ville_id", "8");
		hmap.put("hairColor_id", "");
		hmap.put("skinColor_id", "");
		hmap.put("eyeColor_id", "");
		hmap.put("weightRange_id", "");
		hmap.put("status_id", "");
		hmap.put("hobbies_id", "");
		hmap.put("tailleMax", "172");
		hmap.put("tailleMin", "150");
//		hmap.put("fumeur", true);
		
		ArrayList<Membre> listrecherche = MembreManager.recherche(hmap);
		ArrayList<Membre> listTous = MembreManager.getTousLesMembres();
		for(Membre m : listrecherche){
			System.out.println(m);
		}
		
		
		
		//System.out.println(listTous.size());
		
		
		
		
	}
}
