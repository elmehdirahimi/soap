package entity;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "StudentObject" )
public class Enseignants {
	@XmlElement
	String cni;
	@XmlElement
	String nom;
	@XmlElement
	String prenom;
	@XmlElement
	Integer age;
	@XmlElement
	String addresse;
	@XmlElement
	String ville;
	@XmlElement
	String photo;
	@XmlElement
	String sexe;
	

	
	public Enseignants(String cni, String nom, String prenom, Integer age, String addresse, String ville, String photo,
			String sexe) {
		super();
		this.cni = cni;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.addresse = addresse;
		this.ville = ville;
		this.photo = photo;
		this.sexe = sexe;
	}

	public Enseignants() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCni() {
		return cni;
	}

	public void setCni(String cni) {
		this.cni = cni;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	@Override
	public String toString() {
		return "Enseignants [cni=" + cni + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", addresse="
				+ addresse + ", ville=" + ville + ", photo=" + photo + ", sexe=" + sexe + "]";
	}

	
	


	

}
