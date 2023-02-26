package fr.facturation.model;

public class Produit {

	// ATTRIBUTS
	
	private String nomProduit;
	private float puProduit;

	
	// CONSTRUCTEURS
	
	public Produit(String nomProduit, float puProduit) {
		super();
		this.nomProduit = nomProduit;
		this.puProduit = puProduit;
	}
	
	
	// GETTERS & SETTERS
	
	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public float getPuProduit() {
		return puProduit;
	}
	public void setPuProduit(float puProduit) {
		this.puProduit = puProduit;
	}
	
}
