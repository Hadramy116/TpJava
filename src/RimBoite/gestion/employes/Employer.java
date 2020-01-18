package RimBoite.gestion.employes;

public class Employer {

	protected int id;
	protected String nom;
	protected String adresse;
	protected int nbrHeurs;
	// public static int NOMBRE_HEURS = 240;

	public Employer(int id, String nom, String adresse, int nbrHeurs) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.nbrHeurs = nbrHeurs;
	}

	public Employer() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNbrHeurs() {
		return nbrHeurs;
	}

	public void setNbrHeurs(int nbrHeurs) {
		this.nbrHeurs = nbrHeurs;
	}

	@Override
	public String toString() {
		return "Employer [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", nbrHeurs=" + nbrHeurs + "]";
	}

}
