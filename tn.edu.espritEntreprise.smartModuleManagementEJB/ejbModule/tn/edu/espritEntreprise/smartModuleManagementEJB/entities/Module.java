package tn.edu.espritEntreprise.smartModuleManagementEJB.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Module implements Serializable {
	private int idModule;
	private String nameModule;

	// link attribute
	private Teacher teacher;

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

	@OneToOne(mappedBy="module",cascade=CascadeType.PERSIST)
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public void linkTeacherToModule(Teacher teacher){
		this.setTeacher(teacher);
		teacher.setModule(this);
	}

}
