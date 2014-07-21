package pkgManagers;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import pkgEntities.Hobby;
import pkgServices.ConnecteurMyBatis;

public class HobbyManager {

	public static ArrayList<Hobby> getListeHobbies() {
		ArrayList<Hobby> list = null;
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		
		try{
			list = (ArrayList<Hobby>)session.selectList(Hobby.class.getName()+".getListeHobbies", null);
		}  
		finally{
			session.close();
		}
		
		return list;
	}
	
	
	public static ArrayList<Hobby> getListeHobbiesByMembreId(int id){
		ArrayList<Hobby> list = null;
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		
		try{
			list = (ArrayList<Hobby>)session.selectList(Hobby.class.getName()+".getListeHobbiesByMembreId", id);
		}  
		finally{
			session.close();
		}
		
		return list;
	}


	public static Hobby getHobbyById(int hobbyId) {
		Hobby h = null;
		SqlSession session = ConnecteurMyBatis.ouvrirSession();
		
		try{
			h = (Hobby)session.selectOne(Hobby.class.getName()+".getHobbyById", hobbyId);
		}  
		finally{
			session.close();
		}
		
		return h;
	}
	
	

}
