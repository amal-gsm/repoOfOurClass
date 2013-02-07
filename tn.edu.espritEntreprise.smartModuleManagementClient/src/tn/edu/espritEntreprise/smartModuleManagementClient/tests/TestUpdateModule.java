package tn.edu.espritEntreprise.smartModuleManagementClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;

import tn.edu.espritEntreprise.smartModuleManagementEJB.entities.Module;
import tn.edu.espritEntreprise.smartModuleManagementEJB.services.interfaces.ModuleManagementServicesRemote;

public class TestUpdateModule {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			ModuleManagementServicesRemote proxy = (ModuleManagementServicesRemote) context
					.lookup("tn.edu.espritEntreprise.smartModuleManagement/tn.edu.espritEntreprise.smartModuleManagementEJB/ModuleManagementServices!tn.edu.espritEntreprise.smartModuleManagementEJB.services.interfaces.ModuleManagementServicesRemote");

			Module moduleToBeUpdated=proxy.findModuleByIdModule(1);
			
			moduleToBeUpdated.setNameModule("dotnet reloaded");
			
			proxy.updateModule(moduleToBeUpdated);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
