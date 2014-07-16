package pkgBackingBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.faces.model.SelectItem;

import pkgEntities.Categorie;
import pkgEntities.City;
import pkgEntities.Clinsdoeil;
import pkgEntities.EyeColor;
import pkgEntities.HairColor;
import pkgEntities.Hobby;
import pkgEntities.Membre;
import pkgEntities.Message;
import pkgEntities.NiveauMembre;
import pkgEntities.SkinColor;
import pkgEntities.Status;
import pkgEntities.WeightRange;
import pkgManagers.CategorieManager;
import pkgManagers.ClinsdoeilManager;
import pkgManagers.FavorisManager;
import pkgManagers.MembreManager;
import pkgManagers.MessageManager;
import services.SendEmail;

public class RechercheBackingBean implements Serializable {
	
	private MembreBackingBean mbb;
	
	//racolte des infos
	private Integer categorie_id;
	private ArrayList<Integer> hairColor_id;
	private ArrayList<Integer> skinColor_id;
	private ArrayList<Integer> eyeColor_id;
	private Integer typePhysique_id;
	private Integer ville_id;
	private ArrayList<Integer> status_id;
	private ArrayList<Integer> hobbies_id;
	private Integer tailleMax;
	private Integer tailleMin;
	private Boolean fumeur;
	
	
	//affichages des options
	private ArrayList<SelectItem> listeCategorie;
	private ArrayList<SelectItem> listeHairColor;
	private ArrayList<SelectItem> listeSkinColor;
	private ArrayList<SelectItem> listeEyeColor;
	private ArrayList<SelectItem> listeTypePhysique;
	private ArrayList<SelectItem> listeVilles;
	private ArrayList<SelectItem> listeStatus;
	private ArrayList<SelectItem> listeHobbies;
	
	
	//liste de membres pour afficher les resultats
	private ArrayList<Membre> listeResultat;
	//recuperer le Champ reponse du user a lautre
	private String reponse;
	
	
	public MembreBackingBean getMbb() {
		return mbb;
	}
	public void setMbb(MembreBackingBean mbb) {
		this.mbb = mbb;
	}
	
	
	public Integer getCategorie_id() {
		return categorie_id;
	}
	public void setCategorie_id(Integer categorie_id) {
		this.categorie_id = categorie_id;
	}
	public ArrayList<Integer> getHairColor_id() {
		return hairColor_id;
	}
	public void setHairColor_id(ArrayList<Integer> hairColor_id) {
		this.hairColor_id = hairColor_id;
	}
	public ArrayList<Integer> getSkinColor_id() {
		return skinColor_id;
	}
	public void setSkinColor_id(ArrayList<Integer> skinColor_id) {
		this.skinColor_id = skinColor_id;
	}
	public ArrayList<Integer> getEyeColor_id() {
		return eyeColor_id;
	}
	public void setEyeColor_id(ArrayList<Integer> eyeColor_id) {
		this.eyeColor_id = eyeColor_id;
	}
	public Integer getTypePhysique_id() {
		return typePhysique_id;
	}
	public void setTypePhysique_id(Integer typePhysique_id) {
		this.typePhysique_id = typePhysique_id;
	}
	public Integer getVille_id() {
		return ville_id;
	}
	public void setVille_id(Integer ville_id) {
		this.ville_id = ville_id;
	}
	public ArrayList<Integer> getStatus_id() {
		return status_id;
	}
	public void setStatus_id(ArrayList<Integer> status_id) {
		this.status_id = status_id;
	}
	public ArrayList<Integer> getHobbies_id() {
		return hobbies_id;
	}
	public void setHobbies_id(ArrayList<Integer> hobbies_id) {
		this.hobbies_id = hobbies_id;
	}
	public Integer getTailleMax() {
		return tailleMax;
	}
	public void setTailleMax(Integer tailleMax) {
		this.tailleMax = tailleMax;
	}
	public Integer getTailleMin() {
		return tailleMin;
	}
	public void setTailleMin(Integer tailleMin) {
		this.tailleMin = tailleMin;
	}
	public Boolean getFumeur() {
		return fumeur;
	}
	public void setFumeur(Boolean fumeur) {
		this.fumeur = fumeur;
	}
	public ArrayList<Membre> getListeResultat() {
		return listeResultat;
	}
	public void setListeResultat(ArrayList<Membre> listeResultat) {
		this.listeResultat = listeResultat;
	}
	public ArrayList<SelectItem> getListeCategorie() {

		listeCategorie = new ArrayList<SelectItem>();
		ArrayList<Categorie> categories = new ArrayList<Categorie>();
		categories = CategorieManager.getListeCategories();
		for (Categorie c : categories) {
			SelectItem item = new SelectItem(c.getCategorieID(),
					c.getDescription());
			listeCategorie.add(item);
		}

		return listeCategorie;
	}

	public void setListeCategorie(ArrayList<SelectItem> listeCategorie) {
		this.listeCategorie = listeCategorie;
	}

	public ArrayList<SelectItem> getListeHairColor() {

		listeHairColor = new ArrayList<SelectItem>();
		ArrayList<HairColor> hairColors = new ArrayList<HairColor>();
		hairColors = HairColorManager.getListeHairColors();
		for (HairColor hc : hairColors) {
			SelectItem item = new SelectItem(hc.getId(), hc.getDescription());
			listeHairColor.add(item);
		}

		return listeHairColor;
	}

	public void setListeHairColor(ArrayList<SelectItem> listeHairColor) {
		this.listeHairColor = listeHairColor;
	}

	public ArrayList<SelectItem> getListeSkinColor() {

		listeSkinColor = new ArrayList<SelectItem>();
		ArrayList<SkinColor> skinColors = new ArrayList<SkinColor>();
		skinColors = SkinColorManager.getListeSkinColors();
		for (SkinColor sc : skinColors) {
			SelectItem item = new SelectItem(sc.getId(), sc.getDescription());
			listeSkinColor.add(item);
		}
		return listeSkinColor;
	}

	public void setListeSkinColor(ArrayList<SelectItem> listeSkinColor) {
		this.listeSkinColor = listeSkinColor;
	}

	public ArrayList<SelectItem> getListeEyeColor() {

		listeEyeColor = new ArrayList<SelectItem>();
		ArrayList<EyeColor> eyeColors = new ArrayList<EyeColor>();
		eyeColors = EyeColorManager.getListeEyeColors();
		for (EyeColor ec : eyeColors) {
			SelectItem item = new SelectItem(ec.getId(), ec.getDescription());
			listeEyeColor.add(item);
		}
		return listeEyeColor;
	}

	public void setListeEyeColor(ArrayList<SelectItem> listeEyeColor) {
		this.listeEyeColor = listeEyeColor;
	}

	public ArrayList<SelectItem> getListeTypePhysique() {

		listeTypePhysique = new ArrayList<SelectItem>();
		ArrayList<WeightRange> typesPhysiques = new ArrayList<WeightRange>();
		typesPhysiques = WeightRangeManager.getListeWeightRanges();
		for (WeightRange wr : typesPhysiques) {
			SelectItem item = new SelectItem(wr.getId(), wr.getDescription());
			listeTypePhysique.add(item);
		}
		return listeTypePhysique;
	}

	public void setListeTypePhysique(ArrayList<SelectItem> listeTypePhysique) {
		this.listeTypePhysique = listeTypePhysique;
	}

	public ArrayList<SelectItem> getListeStatus() {
		listeStatus = new ArrayList<SelectItem>();
		ArrayList<Status> lesStatus = new ArrayList<Status>();
		lesStatus = StatusManager.getListeStatus();
		for (Status st : lesStatus) {
			SelectItem item = new SelectItem(st.getId(), st.getDescription());
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

		listeHobbies = new ArrayList<SelectItem>();
		ArrayList<Hobby> hobbies = new ArrayList<Hobby>();
		hobbies = HobbyManager.getListeHobbies();
		for (Hobby h : hobbies) {
			SelectItem item = new SelectItem(h.getId(), h.getDescription());
			listeHobbies.add(item);
		}

		return listeHobbies;
	}

	public ArrayList<SelectItem> getListeVilles() {
		listeVilles = new ArrayList<SelectItem>();
		ArrayList<City> cities = new ArrayList<City>();
		cities = CityManager.getListeCities();
		for (City c : cities) {
			SelectItem item = new SelectItem(c.getId(), c.getDescription());
			listeVilles.add(item);
		}
		return listeVilles;
	}

	public void setListeVilles(ArrayList<SelectItem> listeVilles) {
		this.listeVilles = listeVilles;
	}

	public String rechercher()
	{
		String redirection=null;
		HashMap<String, Object> criteresRecherche=new HashMap<String, Object>();
		
		criteresRecherche.put("categorie_id", categorie_id);
		criteresRecherche.put("hairColor_id", hairColor_id);	
		criteresRecherche.put("skinColor_id", skinColor_id);
		criteresRecherche.put("eyeColor_id", eyeColor_id);
		criteresRecherche.put("typePhysique_id", typePhysique_id);
		criteresRecherche.put("ville_id", ville_id);
		criteresRecherche.put("status_id", status_id);
		criteresRecherche.put("hobbies_id", hobbies_id);
		criteresRecherche.put("tailleMax", tailleMax);
		criteresRecherche.put("tailleMin", tailleMin);
		criteresRecherche.put("fumeur", fumeur);
		
		listeResultat=MembreManager.recherche(criteresRecherche);
		if(!listeResultat.isEmpty()) //si resultats trouves
			redirection="oui";
		else
			redirection="non";
		return redirection;
	}
	
	public String ajouterFavoris(Membre membreCible)
	{
		String destination=null;
		//tester niveau du user
		NiveauMembre niveau=new NiveauMembre();
		int maxFavoris=0;
		niveau=mbb.getMembre().getNiveauMembre();
		maxFavoris=niveau.getNbFavorisMax();
		
		ArrayList<Membre> listeFavoris=new ArrayList<Membre>();
		listeFavoris=mbb.getListeFavoris();
		
		if(listeFavoris.size()<maxFavoris){
			//ajouter amis
			int ajoute=FavorisManager.addFavoris(new Date(), mbb.getMembre().getMembreId(), membreCible.getMembreId());
			boolean recevoirCourriel=false;
			recevoirCourriel=membreCible.getInformed_added_by_others();
			if(ajoute>0 && recevoirCourriel){
				//envoyer courriel a qui a ete ajoute
				SendEmail.envoyerMail(mbb.getMembre(), membreCible, "ajoute");
			}
		}
		return destination;
	}
	
	public String envoyerClinDoeil(Membre membreCible)
	{
		String destination=null;
		
		Clinsdoeil clin=new Clinsdoeil();
		clin.setFromId(mbb.getMembre().getMembreId());
		clin.setToId(membreCible.getMembreId());
		//get date now
		Date date = new Date();
		clin.setDateEnvoi(date);
		
		ClinsdoeilManager.addClindoeil(clin);
		
		return destination;
	}
	
	public String envoyerMessage(Membre membreCible)
	{
		Message msg=new Message();
		msg.setContenu(reponse);
		msg.setDejalu(false);
		msg.setMsgFrom(mbb.getMembre().getMembreId());
		msg.setMsgTo(membreCible.getMembreId());
		msg.setSendDate(new Date());
		
		//tester si le user a le droit denvoyer un message
		NiveauMembre niveau=new NiveauMembre();
		boolean droitMsg=false;
		niveau=mbb.getMembre().getNiveauMembre();
		droitMsg=niveau.getDroitEnvoyerMag();
		
		if(droitMsg){
			int msgEnregistre=0;
			boolean recevoirCourriel=false;
			msgEnregistre=MessageManager.addMessage(msg);
			//tester si le user cible veut recevoir des courriel
			recevoirCourriel=membreCible.getInformed_message_received();
			if(msgEnregistre>0 && recevoirCourriel)
				SendEmail.envoyerMail(mbb.getMembre(), membreCible, "message");
		}
		return null;
	}
}