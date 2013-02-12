package tn.edu.espritEntreprise.smartModuleManagementClient.tests;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import tn.edu.espritEntreprise.smartModuleManagementEJB.entities.Module;
import tn.edu.espritEntreprise.smartModuleManagementEJB.services.interfaces.ModuleManagementServicesRemote;

public class TestFindAllModule {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Context context = new InitialContext();
			ModuleManagementServicesRemote proxy = (ModuleManagementServicesRemote) context
					.lookup("tn.edu.espritEntreprise.smartModuleManagement/tn.edu.espritEntreprise.smartModuleManagementEJB/ModuleManagementServices!tn.edu.espritEntreprise.smartModuleManagementEJB.services.interfaces.ModuleManagementServicesRemote");

			List<Module> modules = proxy.findAllModule();
			for ( Module m:modules){
				System.out.println(m.getNameModule());
				
			}
			

		

		} catch (Exception e) {
			// TODO: handle exception
		

	}
		

	}

}
