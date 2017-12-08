package Fr.PoleEmploi.GestionListedesCourses.dao;

import java.util.List;

import Fr.PoleEmploi.GestionListedesCourses.modele.MesCourses;


public interface MesCoursesDao {
	
	static List<MesCourses> findAll(int first, int size) {
		// TODO Auto-generated method stub
		return null;
	}
	
	MesCourses getMesCoursesById(Long id);

	void deleteMesCoursesById(Long id);

	MesCourses createMesCourses(MesCourses mescources);
	
	MesCourses updateMesCourses(MesCourses mescources);
}
