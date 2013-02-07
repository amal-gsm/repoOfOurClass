package tn.edu.espritEntreprise.smartModuleManagementEJB.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Module implements Serializable {
	private int idModule;
	private String nameModule;

	@Id
	public int getIdModule() {
		return idModule;
	}

	public void setIdModule(int idModule) {
		this.idModule = idModule;
	}

	public String getNameModule() {
		return nameModule;
	}

	public void setNameModule(String nameModule) {
		this.nameModule = nameModule;
	}

}
