package pkgEntities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.text.StyleContext.SmallAttributeSet;


public class Membre implements Serializable {
	private int membreId;
	private String nom;
	private String prenom;
	private String description;
	private String pseudo;
	private String password;
	private int age;
	private String email;
	private Categorie categorie;
	private Boolean isOnline;
	private NiveauMembre niveauMembre;
	private Boolean sexe;
	private Date lastVisit;
	private Boolean smoke;
	private int height;
	private HairColor hairColor;
	private SkinColor skinColor;
	private EyeColor eyeColor;
	private WeightRange weightRange;
	private City city;
	private Status status;
	
	private ArrayList<Favoris> listeFavoris;
	private ArrayList<Hobby> listeHobbies;
	private ArrayList<Photo> listePhotos;
	
	public int getMembreId() {
		return membreId;
	}
	public void setMembreId(int membreId) {
		this.membreId = membreId;
	}
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Boolean getIsOnline() {
		return isOnline;
	}
	public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
	}
	public NiveauMembre getNiveauMembre() {
		return niveauMembre;
	}
	public void setNiveauMembre(NiveauMembre niveauMembre) {
		this.niveauMembre = niveauMembre;
	}
	public Boolean getSexe() {
		return sexe;
	}
	public void setSexe(Boolean sexe) {
		this.sexe = sexe;
	}
	public Date getLastVisit() {
		return lastVisit;
	}
	public void setLastVisit(Date lastVisit) {
		this.lastVisit = lastVisit;
	}
	public Boolean getSmoke() {
		return smoke;
	}
	public void setSmoke(Boolean smoke) {
		this.smoke = smoke;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public HairColor getHairColor() {
		return hairColor;
	}
	public void setHairColor(HairColor hairColor) {
		this.hairColor = hairColor;
	}
	public SkinColor getSkinColor() {
		return skinColor;
	}
	public void setSkinColor(SkinColor skinColor) {
		this.skinColor = skinColor;
	}
	public EyeColor getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(EyeColor eyeColor) {
		this.eyeColor = eyeColor;
	}
	public WeightRange getWeightRange() {
		return weightRange;
	}
	public void setWeightRange(WeightRange weightRange) {
		this.weightRange = weightRange;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public ArrayList<Favoris> getListeFavoris() {
		return listeFavoris;
	}
	public void setListeFavoris(ArrayList<Favoris> listeFavoris) {
		this.listeFavoris = listeFavoris;
	}
	public ArrayList<Hobby> getListeHobbies() {
		return listeHobbies;
	}
	public void setListeHobbies(ArrayList<Hobby> listeHobbies) {
		this.listeHobbies = listeHobbies;
	}
	public ArrayList<Photo> getListePhotos() {
		return listePhotos;
	}
	public void setListePhotos(ArrayList<Photo> listePhotos) {
		this.listePhotos = listePhotos;
	}
	
}
