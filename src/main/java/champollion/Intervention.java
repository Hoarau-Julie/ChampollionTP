package champollion;

import java.util.Date;

public class Intervention {
	private final UE matiere;
	private final Enseignant intervenant;
	private boolean annulee = false;
	private final Date debut;
	private final int duree;
	private final Salle lieu;
	private TypeIntervention type;
	
	public Intervention(Salle s, UE ue, Enseignant e, Date debut, int duree) {
		this.lieu = s;
		this.matiere = ue;
		this.intervenant = e;
		this.debut = debut;
		this.duree = duree;
	}
	
	public TypeIntervention getType() {
		return type;
	}

	public void setType(TypeIntervention type) {
		this.type = type;
	}

	public UE getMatiere() {
		return matiere;
	}

	public boolean isAnnulee() {
		return annulee;
	}

	public void setAnnulee(boolean annulee) {
		this.annulee = annulee;
	}

	public int getDuree() {
		return duree;
	}

	public Salle getLieu() {
		return lieu;
	}
	
}
