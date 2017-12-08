package Fr.PoleEmploi.GestionListedesCourses.modele;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="MesCourses")
@NamedQuery(name="MesCourses.findAll",query="SELECT m FROM Visite m")


public class MesCourses implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
    
	private String nom_enseigne;
	private String nom_ville;
	private Date date_achat;
	public String getNom_enseigne() {
		return nom_enseigne;
	}
	public void setNom_enseigne(String nom_enseigne) {
		this.nom_enseigne = nom_enseigne;
	}
	public String getNom_ville() {
		return nom_ville;
	}
	public void setNom_ville(String nom_ville) {
		this.nom_ville = nom_ville;
	}
	public Date getDate_achat() {
		return date_achat;
	}
	public void setDate_achat(Date date_achat) {
		this.date_achat = date_achat;
	}

}
