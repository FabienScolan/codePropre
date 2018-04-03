package ex1;

import java.util.Date;

public class entreprise {

	private int Siret;
	private String Nom;
	private String adresse;
	private Date date_Creation;

	public static final int capitalMax = 3000000;

	@Override
	public String toString() {
		return "entreprise [Siret=" + Siret + ", Nom=" + Nom + ", adresse=" + adresse + ", date_Creation="
				+ date_Creation + "]";
	}

	public int getSiret() {
		return Siret;
	}

	public void setSiret(int siret) {
		Siret = siret;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDate_Creation() {
		return date_Creation;
	}

	public void setDate_Creation(Date date_Creation) {
		this.date_Creation = date_Creation;
	}

}
