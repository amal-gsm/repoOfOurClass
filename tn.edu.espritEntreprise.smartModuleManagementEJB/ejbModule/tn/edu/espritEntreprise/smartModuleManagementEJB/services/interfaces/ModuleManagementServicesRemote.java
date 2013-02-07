package tn.edu.espritEntreprise.smartModuleManagementEJB.services.interfaces;

import javax.ejb.Remote;

import tn.edu.espritEntreprise.smartModuleManagementEJB.entities.Module;

@Remote
public interface ModuleManagementServicesRemote {
	public void addModule(Module module);

	public void deleteModuleByIdModule(int idModule);

	public Module findModuleByIdModule(int idModule);

	public void updateModule(Module module);

}
