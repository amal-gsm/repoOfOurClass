package tn.edu.espritEntreprise.smartModuleManagementEJB.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.edu.espritEntreprise.smartModuleManagementEJB.entities.Module;
import tn.edu.espritEntreprise.smartModuleManagementEJB.entities.Teacher;

@Remote
public interface ModuleManagementServicesRemote {
	public void addModule(Module module);

	public void deleteModuleByIdModule(int idModule);

	public Module findModuleByIdModule(int idModule);

	public void updateModule(Module module);

	public List<Module> findAllModule();

	public void addTeacher(Teacher teacher);

	public Teacher findTeacherByModuleId(int idModule);
}
