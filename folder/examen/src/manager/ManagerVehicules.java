package manager;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import entites.Vehicules;
import services.ConnecteurMyBatis;


public class ManagerVehicules {
	@SuppressWarnings("unchecked")
	public static ArrayList<Vehicules> getListeVehicules(int marqueID)
	{
		ArrayList<Vehicules> listeVehicules= new ArrayList<Vehicules>();
		
		
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		
		try {
			listeVehicules=(ArrayList<Vehicules>)session.selectList("services.VehiculesXmlMapper.AfficheVehiculesSelonmarqueID",marqueID);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally
		{
			session.close();
			
		}
		
		return listeVehicules;
	}
	
public static Integer insertVehicule(Vehicules vehicule){
		
		
		SqlSession session=ConnecteurMyBatis.ouvrirSession();
		Integer ligneAffectee=0;
		try {
			
			ligneAffectee=session.insert("services.VehiculesXmlMapper.InsererUnVehicule", vehicule);
			session.commit();
			
			//recuperation de l'ID du user qui vient d'être recupéré
			//System.out.println(user.getIdUser());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally{
			
			session.close();
		}
		
		return ligneAffectee;
	}

public static Integer modifierVehicule(Vehicules vehicule){
	
	Integer ligneAffectee=0;
	
	SqlSession session=ConnecteurMyBatis.ouvrirSession();
	
	try {
		
		ligneAffectee=session.update("services.VehiculesXmlMapper.ModifierUnVehiculer", vehicule);
		session.commit();
	} catch (Exception e) {
		// TODO: handle exception
	}
	finally{
		
		
	}
	
	return ligneAffectee;
}

public static Integer supprimerVehicule(Vehicules vehicule){
	
	Integer ligneAffectee=0;
	
	SqlSession session=ConnecteurMyBatis.ouvrirSession();
	
	try {
		
		ligneAffectee=session.delete("services.VehiculesXmlMapper.SupprimerUnVehicule", vehicule);
		session.commit();
	} catch (Exception e) {
		// TODO: handle exception
	}
	finally{
		
		
	}
	
	return ligneAffectee;
}


}
