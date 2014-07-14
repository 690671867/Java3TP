package pkgBackingBeans;

import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpSession;

import pkgEntities.Categorie;
import pkgEntities.City;
import pkgEntities.EyeColor;
import pkgEntities.Favoris;
import pkgEntities.HairColor;
import pkgEntities.Hobby;
import pkgEntities.Membre;
import pkgEntities.Message;
import pkgEntities.Photo;
import pkgEntities.SkinColor;
import pkgEntities.Status;
import pkgEntities.WeightRange;
import pkgManagers.ClinsdoeilManager;
import pkgManagers.FavorisManager;
import pkgManagers.MembreManager;
import pkgManagers.MessageManager;
import pkgManagers.PhotoManager;
import services.FacesTools;

public class MembreBackingBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//attribut membre
	private Membre membre;
	private HttpSession session;
	
	
	private String nom;
	private String prenom;
	private int age;
	private String description;
	private String email;
	private String password;
	private String pseudo;
	private int categorie;
	private int hairColor_id;
	private int skinColor_id;
	private int eyeColor_id;
	private int grandeur;
	private int weightrange_id;
	private int city_id;
	private boolean smoke;
	private int status_id;
	private ArrayList<String> hobbies;
	private String photoProfile;
	private int nbMsgPasLues;
	private int nbFavorisOnline;
	private int nbClin;
	private boolean courrielMessage;
	private boolean courrielAjoute;
	private boolean courrielSupprime;
	
	//afficher dans la vue inscription
	private ArrayList<SelectItem> listeCategorie;
	private ArrayList<SelectItem> listeHairColor;
	private ArrayList<SelectItem> listeSkinColor;
	private ArrayList<SelectItem> listeEyeColor;
	private ArrayList<SelectItem> listeTypePhysique;
	private ArrayList<SelectItem> listeStatus;
	private ArrayList<SelectItem> listeHobbies;
	private ArrayList<SelectItem> listeVilles;
		
	
	public Membre getMembre() {
		return membre;
	}

	public void setMembre(Membre membre) {
		this.membre = membre;
	}

	public HttpSession getSession() {
		return session;
	}

	public void setSession(HttpSession session) {
		this.session = session;
	}

	//GETTERS ET SETTERS
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public int getCategorie() {
		return categorie;
	}

	public void setCategorie(int categorie) {
		this.categorie = categorie;
	}

	public int getHairColor_id() {
		return hairColor_id;
	}
	public void setHairColor_id(int hairColor_id) {
		this.hairColor_id = hairColor_id;
	}
	public int getSkinColor_id() {
		return skinColor_id;
	}
	public void setSkinColor_id(int skinColor_id) {
		this.skinColor_id = skinColor_id;
	}
	public int getEyeColor_id() {
		return eyeColor_id;
	}
	public void setEyeColor_id(int eyeColor_id) {
		this.eyeColor_id = eyeColor_id;
	}
	public int getGrandeur() {
		return grandeur;
	}
	public void setGrandeur(int grandeur) {
		this.grandeur = grandeur;
	}
	public int getWeightrange_id() {
		return weightrange_id;
	}
	public void setWeightrange_id(int weightrange_id) {
		this.weightrange_id = weightrange_id;
	}
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public boolean isSmoke() {
		return smoke;
	}
	public void setSmoke(boolean smoke) {
		this.smoke = smoke;
	}
	public int getStatus_id() {
		return status_id;
	}
	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}
	public ArrayList<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}
	public String getPhotoProfile() {
		
		Photo photoP=new Photo();
		photoP=PhotoManager.getProfilPhoto(membre.getMembreId());
		photoProfile=photoP.getChemin();
				
		return photoProfile;
	}
	public void setPhotoProfile(String photoProfile) {
		this.photoProfile = photoProfile;
	}
	public int getNbMsgPasLues() {
		
		ArrayList<Message> listeMessages=new ArrayList<Message>();
		listeMessages=MessageManager.getListeMessagesRecus(membre.getMembreId());
		
		nbMsgPasLues=0;
		for(Message m:listeMessages)
		{
			boolean lu=m.getEstDejaVu();
			if(!lu)
				nbMsgPasLues++;
		}	
		return nbMsgPasLues;
	}
	
	public void setNbMsgPasLues(int nbMsgPasLues) {
		this.nbMsgPasLues = nbMsgPasLues;
	}
	
	public int getNbFavorisOnline() {
		//pour utilisation dans le dashboard du user
		nbFavorisOnline=0;
		ArrayList<Favoris> listeFavorisOnline=new ArrayList<Favoris>();
		listeFavorisOnline=FavorisManager.getListeFavorisOnline(membre.getMembreId());
		nbFavorisOnline=listeFavorisOnline.size();
			
		return nbFavorisOnline;
	}
	public void setNbFavorisOnline(int nbFavorisOnline) {
		this.nbFavorisOnline = nbFavorisOnline;
	}
	public int getNbClin() {
		
		nbClin=ClinsdoeilManager.getNombreClinRecus(membre.getMembreId());
		
		return nbClin;
	}
	public void setNbClin(int nbClin) {
		this.nbClin = nbClin;
	}
	public boolean isCourrielMessage() {
		return courrielMessage;
	}
	public void setCourrielMessage(boolean courrielMessage) {
		this.courrielMessage = courrielMessage;
	}

	
	public boolean isCourrielAjoute() {
		return courrielAjoute;
	}

	public void setCourrielAjoute(boolean courrielAjoute) {
		this.courrielAjoute = courrielAjoute;
	}

	public boolean isCourrielSupprime() {
		return courrielSupprime;
	}

	public void setCourrielSupprime(boolean courrielSupprime) {
		this.courrielSupprime = courrielSupprime;
	}

	public ArrayList<SelectItem> getListeCategorie() {
		
		listeCategorie=new ArrayList<SelectItem>();
		ArrayList<Categorie> categories=new ArrayList<Categorie>();
		categories=CategorieManager.getListeCategories();
		for(Categorie c: categories)
		{
			SelectItem item=new SelectItem(c.getCategorieID(), c.getDescription());
			listeCategorie.add(item);
		}	
		
		return listeCategorie;
	}
	public void setListeCategorie(ArrayList<SelectItem> listeCategorie) {
		this.listeCategorie = listeCategorie;
	}
	public ArrayList<SelectItem> getListeHairColor() {
		
		listeHairColor=new ArrayList<SelectItem>();
		ArrayList<HairColor> hairColors=new ArrayList<HairColor>();
		hairColors=HairColorManager.getListeHairColors();
		for(HairColor hc: hairColors)
		{
			SelectItem item=new SelectItem(hc.getId(), hc.getDescription());
			listeHairColor.add(item);
		}	
		
		return listeHairColor;
	}
	public void setListeHairColor(ArrayList<SelectItem> listeHairColor) {
		this.listeHairColor = listeHairColor;
	}
	public ArrayList<SelectItem> getListeSkinColor() {
		
		listeSkinColor=new ArrayList<SelectItem>();
		ArrayList<SkinColor> skinColors=new ArrayList<SkinColor>();
		skinColors=SkinColorManager.getListeSkinColors();
		for(SkinColor sc: skinColors)
		{
			SelectItem item=new SelectItem(sc.getId(), sc.getDescription());
			listeSkinColor.add(item);
		}	
		return listeSkinColor;
	}
	public void setListeSkinColor(ArrayList<SelectItem> listeSkinColor) {
		this.listeSkinColor = listeSkinColor;
	}
	public ArrayList<SelectItem> getListeEyeColor() {
		
		listeEyeColor=new ArrayList<SelectItem>();
		ArrayList<EyeColor> eyeColors=new ArrayList<EyeColor>();
		eyeColors=EyeColorManager.getListeEyeColors();
		for(EyeColor ec: eyeColors)
		{
			SelectItem item=new SelectItem(ec.getId(), ec.getDescription());
			listeEyeColor.add(item);
		}	
		return listeEyeColor;
	}
	public void setListeEyeColor(ArrayList<SelectItem> listeEyeColor) {
		this.listeEyeColor = listeEyeColor;
	}
	public ArrayList<SelectItem> getListeTypePhysique() {
		
		listeTypePhysique=new ArrayList<SelectItem>();
		ArrayList<WeightRange> typesPhysiques=new ArrayList<WeightRange>();
		typesPhysiques=WeightRangeManager.getListeWeightRanges();
		for(WeightRange wr: typesPhysiques)
		{
			SelectItem item=new SelectItem(wr.getId(), wr.getDescription());
			listeTypePhysique.add(item);
		}	
		return listeTypePhysique;
	}
	public void setListeTypePhysique(ArrayList<SelectItem> listeTypePhysique) {
		this.listeTypePhysique = listeTypePhysique;
	}
	public ArrayList<SelectItem> getListeStatus() {
		listeStatus=new ArrayList<SelectItem>();
		ArrayList<Status> lesStatus=new ArrayList<Status>();
		lesStatus=StatusManager.getListeStatus();
		for(Status st: lesStatus)
		{
			SelectItem item=new SelectItem(st.getId(), st.getDescription());
			listeStatus.add(item);
		}	
		return listeStatus;
	}
	public void setListeStatus(ArrayList<SelectItem> listeStatus) {
		this.listeStatus = listeStatus;
	}
	public void setListeHobbies(ArrayList<SelectItem> listeHobbies) {
		this.listeHobbies = listeHobbies;
	}

	public ArrayList<SelectItem> getListeHobbies() {
		
		listeHobbies=new ArrayList<SelectItem>();
		ArrayList<Hobby> hobbies=new ArrayList<Hobby>();
		hobbies=HobbyManager.getListeHobbies();
		for(Hobby h:hobbies)
		{
			SelectItem item=new SelectItem(h.getId(), h.getDescription());
			listeHobbies.add(item);
		}	
		
		return listeHobbies;
	}


	public ArrayList<SelectItem> getListeVilles() {
		listeVilles=new ArrayList<SelectItem>();
		ArrayList<City> cities=new ArrayList<City>();
		cities=CityManager.getListeCities();
		for(City c:cities)
		{
			SelectItem item=new SelectItem(c.getId(), c.getDescription());
			listeVilles.add(item);
		}	
		return listeVilles;
	}

	public void setListeVilles(ArrayList<SelectItem> listeVilles) {
		this.listeVilles = listeVilles;
	}

	//METHODES
	public String logOut(){
		
		String out=null;
		ExternalContext ec=FacesContext.getCurrentInstance().getExternalContext();
		HttpSession session=(HttpSession)ec.getSession(false);
		
		try {
			FacesTools.invalidateSession(session);
			ec.redirect("./index.xhtml");
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return out;
	}
	
	public String verifierLogin()
	{
		String destination=null;
		
		Membre leMembre=new Membre();
		leMembre=MembreManager.getMembreByNickname(pseudo, password);
		
		//si bon user
		if(leMembre!=null){
			session=(HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
			session.setAttribute("user", membre);
			destination="oui";
		}
		
		return destination;
	}
}
