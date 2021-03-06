package pkgManagers;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import pkgEntities.Categorie;
import pkgEntities.Clinsdoeil;
import pkgEntities.HairColor;
import pkgEntities.Membre;
import pkgEntities.Message;
import pkgEntities.NiveauMembre;
import pkgEntities.Photo;
import pkgServices.ConnecteurMyBatis;
import pkgSupportClasses.SearchCriteria;

public class MembreManager {
	@SuppressWarnings("unchecked")
	public static ArrayList<Membre> getTousLesMembres() {
		ArrayList<Membre> listeTousLesMembres = null;
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		try {
			listeTousLesMembres = (ArrayList<Membre>) session.selectList(
					Membre.class.getName() + ".getTousLesMembres", null);
			if (listeTousLesMembres != null) {
				for (Membre m : listeTousLesMembres) {
					m.setListeMessagesRecus(MessageManager
							.getListeMessagesRecusByMemberId(m.getMembreId()));

					m.setListeMessagesPasLus(MessageManager.getMessagesPasLus(m
							.getMembreId()));
					m.setListeMessagesEnvoyes(MessageManager
							.getListeMessagesEnvoyesByMemberId(m.getMembreId()));
					m.setProfilImagePath(PhotoManager
							.getProfilPhotosByMemberId(m.getMembreId()).get(0)
							.getChemin());

				}
			}
		} finally {
			session.close();
		}
		return listeTousLesMembres;
	}

	public static Membre getMembreById(int memberId) {
		Membre m = null;
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		try {
			m = (Membre) session.selectOne(Membre.class.getName()
					+ ".getMembreById", memberId);
			if (m != null) {
				m.setListeMessagesRecus(MessageManager
						.getListeMessagesRecusByMemberId(m.getMembreId()));

				m.setListeMessagesPasLus(MessageManager.getMessagesPasLus(m
						.getMembreId()));
				m.setListeMessagesEnvoyes(MessageManager
						.getListeMessagesEnvoyesByMemberId(m.getMembreId()));
				m.setProfilImagePath(PhotoManager
						.getProfilPhotosByMemberId(m.getMembreId()).get(0)
						.getChemin());
			}
		} finally {
			session.close();
		}

		return m;
	}

	// TODO
	public static Membre getMembreByNickname(String nickname) {
		Membre m = null;
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		try {
			m = (Membre) session.selectOne(Membre.class.getName()
					+ ".getMembreByNickname", nickname);
			if (m != null) {
				m.setListeMessagesRecus(MessageManager
						.getListeMessagesRecusByMemberId(m.getMembreId()));

				m.setListeMessagesPasLus(MessageManager.getMessagesPasLus(m
						.getMembreId()));
				m.setListeMessagesEnvoyes(MessageManager
						.getListeMessagesEnvoyesByMemberId(m.getMembreId()));
				m.setProfilImagePath(PhotoManager
						.getProfilPhotosByMemberId(m.getMembreId()).get(0)
						.getChemin());
			}
		} finally {
			session.close();
		}
		return m;
	}

	public static Membre getMembreByNicknamePassword(String pseudo, String pw) {
		Membre m = null;
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		try {
			HashMap<String, Object> hmap = new HashMap<String, Object>();
			hmap.put("pseudo_key", pseudo);
			hmap.put("pw_key", pw);

			m = (Membre) session.selectOne(Membre.class.getName()
					+ ".getMembreByNicknamePassword", hmap);
			if (m != null) {
				m.setListeMessagesRecus(MessageManager
						.getListeMessagesRecusByMemberId(m.getMembreId()));
				;
				m.setListeMessagesPasLus(MessageManager.getMessagesPasLus(m
						.getMembreId()));
				m.setListeMessagesEnvoyes(MessageManager
						.getListeMessagesEnvoyesByMemberId(m.getMembreId()));
				m.setProfilImagePath(PhotoManager
						.getProfilPhotosByMemberId(m.getMembreId()).get(0)
						.getChemin());
			}
		} finally {
			session.close();
		}
		return m;
	}

	public static ArrayList<Membre> getFavorisByMembreId(int memberId) {
		ArrayList<Membre> listeFavoris = null;
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		try {
			listeFavoris = (ArrayList<Membre>) session.selectList(
					Membre.class.getName() + ".getFavorisByMembreId", memberId);
			if (listeFavoris != null) {
				for (Membre m : listeFavoris) {
					m.setProfilImagePath(PhotoManager
							.getProfilPhotosByMemberId(m.getMembreId()).get(0)
							.getChemin());
					m.setListeMessagesRecus(MessageManager
							.getListeMessagesRecusByMemberId(m.getMembreId()));
					;
					m.setListeMessagesPasLus(MessageManager.getMessagesPasLus(m
							.getMembreId()));
					m.setListeMessagesEnvoyes(MessageManager
							.getListeMessagesEnvoyesByMemberId(m.getMembreId()));
					m.setListePhotos(PhotoManager.getPhotosByMemberId(m
							.getMembreId()));
					m.setListeHobbies(HobbyManager.getListeHobbiesByMembreId(m
							.getMembreId()));
					m.setCategorie(CategorieManager.getCategorieByMemberId(m
							.getMembreId()));
					m.setNiveauMembre(NiveauMembreManager
							.getNiveauMembreByMemberId(m.getMembreId()));
					m.setHairColor(HairColorManager.getHairColorByMemberId(m
							.getMembreId()));
					m.setSkinColor(SkinColorManager.getSkinColorByMemberId(m
							.getMembreId()));
					m.setEyeColor(EyeColorManager.getEyeColorByMemberId(m
							.getMembreId()));
					m.setCity(CityManager.getCityByMemberId(m.getMembreId()));
					m.setStatus(StatusManager.getStatusByMemberId(m
							.getMembreId()));
					m.setWeightRange(WeightRangeManager
							.getWeightRangeBymemberId(m.getMembreId()));
				}
			}
		} finally {
			session.close();
		}
		return listeFavoris;
	}

	// TODO
	public static ArrayList<Membre> getListeFavorisOnline(int memberId) {
		ArrayList<Membre> listeFavorisOnline = null;
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		try {
			listeFavorisOnline = (ArrayList<Membre>) session
					.selectList(Membre.class.getName()
							+ ".getListeFavorisOnline", memberId);
			if (listeFavorisOnline != null) {
				for (Membre m : listeFavorisOnline) {
					m.setProfilImagePath(PhotoManager
							.getProfilPhotosByMemberId(m.getMembreId()).get(0)
							.getChemin());
					m.setListeMessagesRecus(MessageManager
							.getListeMessagesRecusByMemberId(m.getMembreId()));
					m.setListeMessagesPasLus(MessageManager.getMessagesPasLus(m
							.getMembreId()));
					m.setListeMessagesEnvoyes(MessageManager
							.getListeMessagesEnvoyesByMemberId(m.getMembreId()));
					m.setListePhotos(PhotoManager.getPhotosByMemberId(m
							.getMembreId()));
					m.setListeHobbies(HobbyManager.getListeHobbiesByMembreId(m
							.getMembreId()));
					m.setCategorie(CategorieManager.getCategorieByMemberId(m
							.getMembreId()));
					m.setNiveauMembre(NiveauMembreManager
							.getNiveauMembreByMemberId(m.getMembreId()));
					m.setHairColor(HairColorManager.getHairColorByMemberId(m
							.getMembreId()));
					m.setSkinColor(SkinColorManager.getSkinColorByMemberId(m
							.getMembreId()));
					m.setEyeColor(EyeColorManager.getEyeColorByMemberId(m
							.getMembreId()));
					m.setCity(CityManager.getCityByMemberId(m.getMembreId()));
					m.setStatus(StatusManager.getStatusByMemberId(m
							.getMembreId()));
					m.setWeightRange(WeightRangeManager
							.getWeightRangeBymemberId(m.getMembreId()));
				}
			}
		} finally {
			session.close();
		}
		return listeFavorisOnline;
	}

	// TODO
	/**
	 * la methode pour la recherche
	 * 
	 * @param searchCriteria
	 * @return
	 */
	public static ArrayList<Membre> recherche(
			HashMap<String, Object> searchCriteria) {
		ArrayList<Membre> listeMembres = null;
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		try{
			listeMembres = (ArrayList<Membre>) session
					.selectList(Membre.class.getName()
							+ ".recherche", searchCriteria);
			if (listeMembres != null) {
				for (Membre m : listeMembres) {
					m.setListeMessagesRecus(MessageManager
							.getListeMessagesRecusByMemberId(m.getMembreId()));

					m.setListeMessagesPasLus(MessageManager.getMessagesPasLus(m
							.getMembreId()));
					m.setListeMessagesEnvoyes(MessageManager
							.getListeMessagesEnvoyesByMemberId(m.getMembreId()));
					m.setProfilImagePath(PhotoManager
							.getProfilPhotosByMemberId(m.getMembreId()).get(0)
							.getChemin());

				}
			}
			
			
		} finally{
			session.close();
		}
		
		
		return listeMembres;

	}

	// TODO
	public static int addMembre(Membre m) {
		int ret = 0;

		return ret;
	}

	// TODO
	/**
	 * la methode pour la modifier le profil
	 * 
	 * @param m
	 * @return
	 */
	public static int updateMembre(Membre m) {
		int ret = 0;

		return ret;
	}

}
