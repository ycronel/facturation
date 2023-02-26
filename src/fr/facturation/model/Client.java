package fr.facturation.model;

public class Client {
	
	// ATTRIBUTS DU CLIENT
	
	private String nom, prenom, adresse1, adresse2;
	
	
	// CONSTRUCTEUR
	
	public Client(String nom, String prenom, String adresse1, String adresse2) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse1 = adresse1;
		this.adresse2 = adresse2;
	}
	

	// GETTERS & SETTERS
	
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

	public String getAdresse1() {
		return adresse1;
	}

	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}

	public String getAdresse2() {
		return adresse2;
	}

	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}
		
}
