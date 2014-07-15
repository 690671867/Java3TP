package pkgBackingBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import javax.faces.model.SelectItem;

import pkgEntities.Categorie;
import pkgEntities.City;
import pkgEntities.EyeColor;
import pkgEntities.HairColor;
import pkgEntities.Hobby;
import pkgEntities.Membre;
import pkgEntities.SkinColor;
import pkgEntities.Status;
import pkgEntities.WeightRange;
import pkgManagers.MembreManager;

public class RechercheBackingBean implements Serializable {
	
	private MembreBackingBean mbb;
	
	//racolte des infos
	private String categorie_id;
	private ArrayList<String> hairColor_id;
	private ArrayList<String> skinColor_id;
	private ArrayList<String> eyeColor_id;
	private String typePhysique_id;
	private String ville_id;
	private ArrayList<String> status_id;
	private ArrayList<String> hobbies_id;
	private String tailleMax;
	private String tailleMin;
	
	
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
	
	
	
	public MembreBackingBean getMbb() {
		return mbb;
	}
	public void setMbb(MembreBackingBean mbb) {
		this.mbb = mbb;
	}
	public String getCategorie_id() {
		return categorie_id;
	}
	public void setCategorie_id(String categorie_id) {
		this.categorie_id = categorie_id;
	}
	public ArrayList<String> getHairColor_id() {
		return hairColor_id;
	}
	public void setHairColor_id(ArrayList<String> hairColor_id) {
		this.hairColor_id = hairColor_id;
	}
	public ArrayList<String> getSkinColor_id() {
		return skinColor_id;
	}
	public void setSkinColor_id(ArrayList<String> skinColor_id) {
		this.skinColor_id = skinColor_id;
	}
	public ArrayList<String> getEyeColor_id() {
		return eyeColor_id;
	}
	public void setEyeColor_id(ArrayList<String> eyeColor_id) {
		this.eyeColor_id = eyeColor_id;
	}
	
	public String getTypePhysique_id() {
		return typePhysique_id;
	}
	public void setTypePhysique_id(String typePhysique_id) {
		this.typePhysique_id = typePhysique_id;
	}
	public String getVille_id() {
		return ville_id;
	}
	public void setVille_id(String ville_id) {
		this.ville_id = ville_id;
	}
	public ArrayList<String> getStatus_id() {
		return status_id;
	}
	public void setStatus_id(ArrayList<String> status_id) {
		this.status_id = status_id;
	}
	public ArrayList<String> getHobbies_id() {
		return hobbies_id;
	}
	public void setHobbies_id(ArrayList<String> hobbies_id) {
		this.hobbies_id = hobbies_id;
	}
	public String getTailleMax() {
		return tailleMax;
	}
	public void setTailleMax(String tailleMax) {
		this.tailleMax = tailleMax;
	}
	public String getTailleMin() {
		return tailleMin;
	}
	public void setTailleMin(String tailleMin) {
		this.tailleMin = tailleMin;
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
		
		listeResultat=MembreManager.recherche(criteresRecherche);
		if(!listeResultat.isEmpty()) //si resultats trouves
			redirection="oui";
		else
			redirection="non";
		return redirection;
	}
	
	public String ajouterMembre(Membre membre)
	{
		String destination=null;
		//tester niveau du user
		mbb.getMembre().getNiveauMembre();
		
		//ajouter amis
		MembreManager.ajouterFavoris(mbb.getMembre(), membre);
		
		return destination;
	}
	
}
