package tn.edu.espritEntreprise.smartModuleManagementEJB.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.edu.espritEntreprise.smartModuleManagementEJB.entities.Module;
import tn.edu.espritEntreprise.smartModuleManagementEJB.entities.Teacher;
import tn.edu.espritEntreprise.smartModuleManagementEJB.services.interfaces.ModuleManagementServicesLocal;
import tn.edu.espritEntreprise.smartModuleManagementEJB.services.interfaces.ModuleManagementServicesRemote;

/**
 * Session Bean implementation class ModuleManagementServices
 */
@Stateless
public class ModuleManagementServices implements
		ModuleManagementServicesRemote, ModuleManagementServicesLocal {

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ModuleManagementServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addModule(Module module) {
		entityManager.persist(module);
		System.out.println("insertion OK");
	}

	@Override
	public void deleteModuleByIdModule(int idModule) {
		entityManager.remove(entityManager.find(Module.class, idModule));

	}

	@Override
	public Module findModuleByIdModule(int idModule) {
		return entityManager.find(Module.class, idModule);
	}

	@Override
	public void updateModule(Module module) {
		entityManager.merge(module);

	}

	@Override
	public List<Module> findAllModule() {
		String jpql = "select m from Module m";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();

	}

	@Override
	public void addTeacher(Teacher teacher) {
		entityManager.persist(teacher);
	}

}
