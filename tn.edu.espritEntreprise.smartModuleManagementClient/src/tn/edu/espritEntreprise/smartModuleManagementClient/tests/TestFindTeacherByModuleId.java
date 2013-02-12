package tn.edu.espritEntreprise.smartModuleManagementClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;

import tn.edu.espritEntreprise.smartModuleManagementEJB.entities.Teacher;
import tn.edu.espritEntreprise.smartModuleManagementEJB.services.interfaces.ModuleManagementServicesRemote;

public class TestFindTeacherByModuleId {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			ModuleManagementServicesRemote proxy = (ModuleManagementServicesRemote) context
					.lookup("tn.edu.espritEntreprise.smartModuleManagement/tn.edu.espritEntreprise.smartModuleManagementEJB/ModuleManagementServices!tn.edu.espritEntreprise.smartModuleManagementEJB.services.interfaces.ModuleManagementServicesRemote");

			Teacher teacher = proxy.findTeacherByModuleId(1);
			System.out.println(teacher.getNameTeacher());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
