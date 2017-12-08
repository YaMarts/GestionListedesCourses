package Fr.PoleEmploi.GestionListedesCourses.endpoint;

import java.awt.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import Fr.PoleEmploi.GestionListedesCourses.dao.MesCoursesDao;
import Fr.PoleEmploi.GestionListedesCourses.modele.MesCourses;

@Path("/MesCourses")
@RequestScoped
public class MesCoursesRessources {

	private static int DEFAULT_PAGE_SIZE = 10;

	@Inject
	private MesCoursesDao mescoursesDao;

	@GET
	
	public List getMesCourses(@QueryParam("from") Integer from,
			@QueryParam("limit") Integer limit) {
		if (from == null) {
			from = 0;
		}
		if (limit == null) {
			limit = DEFAULT_PAGE_SIZE;
		}
		java.util.List<MesCourses> mescourses = MesCoursesDao.findAll(from, limit);
		return (List) mescoursesDao;
	}

}