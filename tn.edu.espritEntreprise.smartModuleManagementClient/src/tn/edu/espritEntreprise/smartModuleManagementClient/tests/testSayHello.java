package tn.edu.espritEntreprise.smartModuleManagementClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.espritEntreprise.smartModuleManagementEJB.services.interfaces.IClassroomSheetRemote;

public class testSayHello {

	public static void main(String[] args) {
		try {
			// creation and placement in the root of the JNDI directory
			Context context = new InitialContext();
			IClassroomSheetRemote iClassroomSheetRemoteProxy = (IClassroomSheetRemote) context
					.lookup("tn.edu.espritEntreprise.smartModuleManagement/tn.edu.espritEntreprise.smartModuleManagementEJB/ClassroomSheet!tn.edu.espritEntreprise.smartModuleManagementEJB.services.interfaces.IClassroomSheetRemote");

			iClassroomSheetRemoteProxy.sayHello();

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
