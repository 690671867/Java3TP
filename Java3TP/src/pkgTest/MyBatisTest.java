package pkgTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.junit.Test;

import pkgEntities.Clinsdoeil;
import pkgEntities.Favoris;
import pkgEntities.Membre;
import pkgManagers.ClinsdoeilManager;
import pkgManagers.FavorisManager;
import pkgManagers.MembreManager;

public class MyBatisTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	
	
//	@Test 
//	public void addClinTest(){
//		Clinsdoeil clin = new Clinsdoeil();
//		clin.setFromId(1);
//		clin.setToId(2);;
//		
//		System.out.println(ClinsdoeilManager.addClindoeil(clin));
//		
//	}
	
	
	
//	@Test 
//	public void getNombreClinRecusTest(){
//		Clinsdoeil clin = new Clinsdoeil();
//		clin.setFromId(1);
//		clin.setToId(2);;
//		
//		System.out.println(ClinsdoeilManager.getNombreClinRecus(2));
//		
//	}
	
	

//	@Test
//	public void addFavorisTest(){
//		System.out.println(FavorisManager.addFavoris(new Date(), 23, 30));
//	}
	
	
//	@Test
//	public void deleteFavorisTest(){
//		System.out.println(FavorisManager.deleteFavoris(23, 30));
//	}
	
	@Test
	public void getTousLesMembresTest(){
		System.out.println(MembreManager.getTousLesMembres().get(0).getNiveauMembre());
	}
	
}
