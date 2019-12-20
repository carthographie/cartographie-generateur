package fr.education.gouv.cartographie.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import fr.education.gouv.cartographie.Idao.IAcademieDAO;
import fr.education.gouv.cartographie.Idao.IDepartementDAO;
import fr.education.gouv.cartographie.Idao.IDisciplineDAO;
import fr.education.gouv.cartographie.Idao.IInfoMouvementDAO;
import fr.education.gouv.cartographie.dao.DaoFactory;
import fr.education.gouv.cartographie.entity.Academie;
import fr.education.gouv.cartographie.entity.Departement;
import fr.education.gouv.cartographie.entity.Discipline;
import fr.education.gouv.cartographie.entity.InfoMouvement;

/**
 * Cette classe contient les données de 'sial' à mettre en cache tel que défini
 * dans le modèle avec la contrainte 'CACHED'. <br/>
 * MERCI DE NE PAS MODIFIER CETTE CLASSE.
 *
 */
public class DBCacheDataCartographie {
	private static Map<Class, Map<?, ?>> maps = Collections.synchronizedMap(new HashMap<Class, Map<?, ?>>());

	/**
	 * Construteur. <br>
	 * Merci de passer par {@link DBManagerSial} pour récupérer une instance du
	 * cache.
	 */

	protected DBCacheDataCartographie(final String dbAlias) {

	}

	public static void loadCache(String dbAlias) {
		maps.put(Academie.class, Collections.synchronizedMap(new HashMap<String, Academie>()));
		maps.put(Departement.class, Collections.synchronizedMap(new HashMap<String, Departement>()));
		maps.put(Discipline.class, Collections.synchronizedMap(new HashMap<String, Discipline>()));
		maps.put(InfoMouvement.class, Collections.synchronizedMap(new HashMap<String, InfoMouvement>()));
		try {
			DBCartographie dbCartographie = DBManagerCartorgraphie.initConnection(dbAlias);
			if (dbCartographie != null) {
				for (final Class classModel : maps.keySet()) {
					String name = classModel.getSimpleName();
					switch (name) { // possible depuis JDK 7
					// Nomenclatures XACADEMIE
					case "Academie":
						forceUpdateAcademie(dbCartographie);
						break;
					// InfoMouvement
					case "InfoMouvement":
						forceUpdateInfoMouvement(dbCartographie);
						break;
					// Nomenclatures DEPARTEMENT
					case "Departement":
						forceUpdateDepartement(dbCartographie);
						break;
					// Nomenclatures DISCIPLINE
					case "Discipline":
						forceUpdateDiscipline(dbCartographie);
						break;
					}

				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	private static final void forceUpdateAcademie(DBCartographie dbCartographie) throws SQLException {
		IAcademieDAO dao = DaoFactory.getInstance().getAcademieDAO();
		final HashMap<String, Academie> destination = new HashMap<>();
		final List<Academie> vResultNoCache = dao.getAllAcademies(dbCartographie.getConnection(),
				dbCartographie.getQuerryAcademie());
		for (Academie element : vResultNoCache) {
			destination.put(element.getAcaco(), element);
		}
		maps.put(Departement.class, destination);

	}

	@SuppressWarnings("unchecked")
	public static final void forceUpdateDepartement(DBCartographie dbCartographie) throws SQLException {
		IDepartementDAO dao = DaoFactory.getInstance().getDepartementDAO();
		final HashMap<String, Departement> destination = new HashMap<>();
		final List<Departement> vResultNoCache = dao.getAllDepartements(dbCartographie.getConnection(),
				dbCartographie.getQuerryDepartement());
		if(vResultNoCache != null )
		{
		for (Departement element : vResultNoCache) {
			destination.put(element.getDepaco(), element);
		}
		}
		maps.put(Departement.class, destination);
	}

	@SuppressWarnings("unchecked")
	public static final void forceUpdateDiscipline(DBCartographie dbCartographie) throws SQLException {
		IDisciplineDAO dao = DaoFactory.getInstance().getDisciplineDAO();
		final HashMap<String, Discipline> destination = new HashMap<>();
		final List<Discipline> vResultNoCache = dao.getAllDisciplines(dbCartographie.getConnection(),
				dbCartographie.getQuerryDiscipline());
		if(vResultNoCache != null )
		{
		for (Discipline element : vResultNoCache) {
			destination.put(element.getDiscco(), element);
		}
		}
		maps.put(Discipline.class, destination);
	}

	@SuppressWarnings("unchecked")
	public static final void forceUpdateInfoMouvement(DBCartographie dbCartographie) throws SQLException {
		IInfoMouvementDAO dao = DaoFactory.getInstance().getInfoMouvementDAO();

		final HashMap<String, InfoMouvement> destination = new HashMap<>();
		final List<InfoMouvement> vResultNoCache = dao.getAllInfoMvt(dbCartographie.getConnection());
		if(vResultNoCache != null )
		{
		for (InfoMouvement element : vResultNoCache) {
			destination.put(
					element.getCodeDisicpline() != null ? element.getCodeDisicpline() : element.getCodeAcademie(),
					element);
		}
		}
		maps.put(InfoMouvement.class, destination);
	}

	public static Map<String, InfoMouvement> getInfoMouvements() {
		return (Map<String, InfoMouvement>) maps.get(InfoMouvement.class);
	}

	public static Map<String, Academie> getAcademies() {
		return (Map<String, Academie>) maps.get(Academie.class);
	}

	public static Map<String, Departement> getDepartements() {
		return (Map<String, Departement>) maps.get(Departement.class);
	}

	public static Map<String, Discipline> getDisciplines() {
		return (Map<String, Discipline>) maps.get(Discipline.class);
	}
	
}
