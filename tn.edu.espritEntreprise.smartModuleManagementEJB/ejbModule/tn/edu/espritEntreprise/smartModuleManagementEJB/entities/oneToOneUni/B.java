package tn.edu.espritEntreprise.smartModuleManagementEJB.entities.oneToOneUni;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: B
 * 
 */
@Entity
public class B implements Serializable {

	private int idB;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

	public B() {
		super();
	}

	@Id
	public int getIdB() {
		return this.idB;
	}

	public void setIdB(int idB) {
		this.idB = idB;
	}

}
