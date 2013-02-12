package tn.edu.espritEntreprise.smartModuleManagementEJB.entities.oneToOneUni;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: A
 * 
 */
@Entity
public class A implements Serializable {

	private int idA;

	private B b;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

	public A() {
		super();
	}

	@Id
	public int getIdA() {
		return this.idA;
	}

	public void setIdA(int idA) {
		this.idA = idA;
	}

	@OneToOne
	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

}
