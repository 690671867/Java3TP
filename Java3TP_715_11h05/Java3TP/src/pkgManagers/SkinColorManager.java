package pkgManagers;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import pkgEntities.SkinColor;
import pkgServices.ConnecteurMyBatis;

public class SkinColorManager {
	
	public static ArrayList<SkinColor> getListeSkinColors(){
		ArrayList<SkinColor> list = null;
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		
		try{
			list = (ArrayList<SkinColor>)session.selectList(SkinColor.class.getName()+".getListeSkinColors", null);
		}  
		finally{
			session.close();
		}
		
		
		return list;
	}
	
	
	public static SkinColor getListeSkinColorById(int id){
		SkinColor c = null;
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		
		try{
			c = (SkinColor)session.selectOne(SkinColor.class.getName()+".getListeSkinColorById", id);
		}  
		finally{
			session.close();
		}
		return c;
	}
}
