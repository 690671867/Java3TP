package manager;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import entites.Marques;
import services.ConnecteurMyBatis;


public class ManagerMarques {
	@SuppressWarnings("unchecked")
	public static ArrayList<Marques> getListeMarques()
	{
		ArrayList<Marques> listeMarques= new ArrayList<Marques>();
		
		
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		
		try {
			listeMarques=(ArrayList<Marques>)session.selectList("services.MarquesXmlMapper.AfficheListMarquesVehicules");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally
		{
			session.close();
			
		}
		
		return listeMarques;
	}

}
