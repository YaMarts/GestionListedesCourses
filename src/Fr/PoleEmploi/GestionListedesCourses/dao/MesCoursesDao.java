package Fr.PoleEmploi.GestionListedesCourses.dao;

import java.util.List;
import Fr.PoleEmploi.GestionListedesCourses.modele.MesCourses;


public interface MesCoursesDao {
	
	public static List<MesCourses> findAll(int first, int size) {
		// TODO Auto-generated method stub
		return null;
	}
		// TODO Auto-generated method stub
	
	
	
	MesCourses getMesCoursesById(Long id);

	void deleteMesCoursesById(Long id);

	MesCourses createMesCourses(MesCourses mescources);
	
	MesCourses updateMesCourses(MesCourses mescources);



	MesCourses getVilleById(Long id);



	List<MesCourses> findAllForMesCoursesId(Long idMesCourses, int first, int size);
}
