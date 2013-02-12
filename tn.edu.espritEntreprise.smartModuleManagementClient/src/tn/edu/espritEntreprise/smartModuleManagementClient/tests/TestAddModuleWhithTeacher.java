package tn.edu.espritEntreprise.smartModuleManagementClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;

import tn.edu.espritEntreprise.smartModuleManagementEJB.entities.Module;
import tn.edu.espritEntreprise.smartModuleManagementEJB.entities.Teacher;
import tn.edu.espritEntreprise.smartModuleManagementEJB.services.interfaces.ModuleManagementServicesRemote;

public class TestAddModuleWhithTeacher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			ModuleManagementServicesRemote proxy = (ModuleManagementServicesRemote) context
					.lookup("tn.edu.espritEntreprise.smartModuleManagement/tn.edu.espritEntreprise.smartModuleManagementEJB/ModuleManagementServices!tn.edu.espritEntreprise.smartModuleManagementEJB.services.interfaces.ModuleManagementServicesRemote");

			Module moduleJEE = new Module();
			moduleJEE.setIdModule(1);
			moduleJEE.setNameModule("architecture n tiers");

			Teacher teacher = new Teacher();
			teacher.setIdTeacher(1);
			teacher.setNameTeacher("med ali");

			moduleJEE.linkTeacherToModule(teacher);

			proxy.addModule(moduleJEE);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
