package entity;

import javax.xml.bind.annotation.XmlElement;

public class Module {

	@XmlElement
	String code_module;
	@XmlElement
	String nom_module;
	@XmlElement
	String code_enseignant;
	public Module(String code_module, String nom_module, String code_enseignant) {
		super();
		this.code_module = code_module;
		this.nom_module = nom_module;
		this.code_enseignant = code_enseignant;
	}
	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCode_module() {
		return code_module;
	}
	public void setCode_module(String code_module) {
		this.code_module = code_module;
	}
	public String getNom_module() {
		return nom_module;
	}
	public void setNom_module(String nom_module) {
		this.nom_module = nom_module;
	}
	public String getCode_enseignant() {
		return code_enseignant;
	}
	public void setCode_enseignant(String code_enseignant) {
		this.code_enseignant = code_enseignant;
	}
	@Override
	public String toString() {
		return "Module [code_module=" + code_module + ", nom_module=" + nom_module + ", code_enseignant="
				+ code_enseignant + "]";
	}
	
	
}
