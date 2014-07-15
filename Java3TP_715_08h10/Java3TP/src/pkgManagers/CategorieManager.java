package pkgManagers;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import pkgEntities.Categorie;
import pkgEntities.Photo;
import pkgServices.ConnecteurMyBatis;

public class CategorieManager {
	public static ArrayList<Categorie> getListeCategories(){
		ArrayList<Categorie> list = null;
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		
		try{
			list = (ArrayList<Categorie>)session.selectList(Categorie.class.getName()+".getListeCategories", null);
		}  
		finally{
			session.close();
		}
		
		
		return list;
	}
}
