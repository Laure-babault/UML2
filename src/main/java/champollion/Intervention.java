package champollion;

import java.util.Date;

public class Intervention {
	public Date debut;
	public int duree;
	public boolean annulee;
	private int heureDebut;
	private TypeIntervention type;
	private Salle salle;
	
	public Intervention(Date debut, int duree, boolean annulee, int heureDebut, TypeIntervention type, Salle salle) {
		this.debut = debut;
		this.duree = duree;
		this.annulee = annulee;
		this.heureDebut = heureDebut;
		this.type = type;
		this.salle = salle;
	}

	public Date getDebut() {
		return debut;
	}

	public int getDuree() {
		return duree;
	}

	public boolean isAnnulee() {
		return annulee;
	}

	public int getHeureDebut() {
		return heureDebut;
	}

	public TypeIntervention getType() {
		return type;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setDebut(Date debut) {
		this.debut = debut;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public void setAnnulee(boolean annulee) {
		this.annulee = annulee;
	}
	
}