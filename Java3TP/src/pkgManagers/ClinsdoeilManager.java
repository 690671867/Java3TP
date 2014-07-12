package pkgManagers;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import pkgEntities.Clinsdoeil;
import pkgServices.ConnecteurMyBatis;

public class ClinsdoeilManager {
	
	/**
	 * add a clindoeil
	 * @param clin
	 * @return
	 */
	public static int addClindoeil(Clinsdoeil clin){
		int ret = 0;
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		try{
			ret = session.insert(Clinsdoeil.class.getName()+".addClindoeil", clin);
			session.commit();
		} catch(Exception e){
			e.printStackTrace();
			session.rollback();
		} finally{
			session.close();
		}
		return ret;
	}
	
	/**
	 * get nombres de clinsdoeils received for the connected member 
	 * @param membreId
	 * @return
	 */
	public static int getNombreClinRecus(int membreId){
		int ret = 0;
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		try{
			ret = (int) session.selectOne(Clinsdoeil.class.getName()+".getNombresClinsRecu", membreId);
		} finally{
			session.close();
		}
		return ret;
	}
	
	
	
	//TODO
	/**
	 * 
	 * @param toMemberId (le membre connecte)
	 * @return
	 */
	public static ArrayList<Clinsdoeil> getClinsdoeilRecus(int fromId){
		ArrayList<Clinsdoeil> clinsdoeilRecus = null;
		
		return clinsdoeilRecus;
	} 
}
