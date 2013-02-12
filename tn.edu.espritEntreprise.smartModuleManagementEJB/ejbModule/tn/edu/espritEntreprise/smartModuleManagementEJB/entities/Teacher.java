package tn.edu.espritEntreprise.smartModuleManagementEJB.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Teacher
 * 
 */
@Entity
public class Teacher implements Serializable {

	private int idTeacher;
	private String nameTeacher;

	// link attribute
	private Module module;

	private static final long serialVersionUID = 1L;

	public Teacher() {
		super();
	}

	@Id
	public int getIdTeacher() {
		return this.idTeacher;
	}

	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}

	public String getNameTeacher() {
		return this.nameTeacher;
	}

	public void setNameTeacher(String nameTeacher) {
		this.nameTeacher = nameTeacher;
	}

	@OneToOne(cascade = CascadeType.PERSIST)
	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

}
