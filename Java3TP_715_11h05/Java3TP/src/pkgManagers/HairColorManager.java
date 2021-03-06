package pkgManagers;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;



import pkgEntities.HairColor;
import pkgServices.ConnecteurMyBatis;

public class HairColorManager {
	public static ArrayList<HairColor> getListeHairColors(){
		ArrayList<HairColor> list = null;
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		
		try{
			list = (ArrayList<HairColor>)session.selectList(HairColor.class.getName()+".getListeHairColors", null);
		}  
		finally{
			session.close();
		}
		
		
		return list;
	}
	
	
	public static HairColor  getListeHairColorById(int id){
		HairColor c = null;
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		
		try{
			c = (HairColor)session.selectOne(HairColor.class.getName()+".getListeHairColorById", id);
		}  
		finally{
			session.close();
		}
		return c;
	}
}
