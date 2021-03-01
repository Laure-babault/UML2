package champollion;

public class Salle {
	public String intitule;
	public int capacite;
	
	public Salle(String intitule, int capacite) {
		this.intitule = intitule;
		this.capacite = capacite;
	}
	
	public String getIntitule() {
		return intitule;
	}
	
	public int getCapacite() {
		return capacite;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
}
