package Fr.PoleEmploi.GestionListedesCourses.dao;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import Fr.PoleEmploi.GestionListedesCourses.modele.MesCourses;



@Named
public abstract class MesCoursesJpaDao implements MesCoursesDao {

	@Inject
	private EntityManager entityManager;

	public MesCoursesJpaDao() {
		super();
	}
	
	@Override
	public List<MesCourses> findAllForMesCoursesId(Long idMesCourses, int first, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<MesCourses> findAll(int first, int size) {
		// TODO Auto-generated method stub
		//return null;
		return entityManager.createNamedQuery("Visite.findAll", MesCourses.class)
				.setFirstResult(first).setMaxResults(size).getResultList();
	}

}

//@Named
//public abstract class MesCoursesJpaDao implements MesCoursesDao {
//
//	@Inject
//	private EntityManager entityManager;
//
//	public MesCoursesJpaDao() {
//		super();
//	}
//
//	@Override
//	public MesCourses getVilleById(Long id) {
//		return (MesCourses) entityManager.find(MesCourses.class, id);
//	}
//
//	@Override
//	public void deleteMesCoursesById(Long id) {
//		entityManager.getTransaction().begin();
//		entityManager.createNamedQuery("MesCourses.deleteById")
//				.setParameter("id", id).executeUpdate();
//		entityManager.getTransaction().commit();
//	}
//
//	@Override
//	public MesCourses createMesCourses(MesCourses mescourses) {
//		entityManager.getTransaction().begin();
//		entityManager.persist(mescourses);
//		entityManager.getTransaction().commit();
//		return mescourses;
//	}
//
//	@Override
//	public MesCourses updateMesCourses(MesCourses mescourses) {
//		entityManager.getTransaction().begin();
//		mescourses = entityManager.merge(mescourses);
//		entityManager.getTransaction().commit();
//		return mescourses;
//	}
//
//	public List<MesCourses> findAll(int first, int size) {
//		return entityManager.createNamedQuery("MesCourses.findAll", MesCourses.class)
//				.setFirstResult(first).setMaxResults(size).getResultList();
//	}
//
//}
