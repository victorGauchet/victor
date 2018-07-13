package Client.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Version;

@Entity
@DiscriminatorValue("P")
public class ClientPhysique extends Client {
	@Version
	@Column(name = "VERSION")
	private Integer version;
	@Column(name = "physical_title", length = 100)
	private String TitrePhysique;
	@Column(name = "first_name", length = 100)
	private String pr�nom;

	public ClientPhysique() {
	}

	public String getTitrePhysique() {
		return TitrePhysique;
	}

	public void setTitrePhysique(String titrePhysique) {
		TitrePhysique = titrePhysique;
	}

	public String getPr�nom() {
		return pr�nom;
	}

	public void setPr�nom(String pr�nom) {
		this.pr�nom = pr�nom;
	}

}
