package tn.edu.espritEntreprise.smartModuleManagementEJB.services.impl;

import javax.ejb.Stateless;

import tn.edu.espritEntreprise.smartModuleManagementEJB.services.interfaces.IClassroomSheetLocal;
import tn.edu.espritEntreprise.smartModuleManagementEJB.services.interfaces.IClassroomSheetRemote;

@Stateless
public class ClassroomSheet implements IClassroomSheetLocal,
		IClassroomSheetRemote {

	@Override
	public void sayHello() {
		System.out.println("hello everybody ...");

	}

}
