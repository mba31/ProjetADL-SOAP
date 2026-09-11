	package tp2_soap;

import java.util.ArrayList;

public class Hotel {
	private String nom;
	private Ville ville;
	private int nbEtoiles;
	private ArrayList<Chambre> chambres = new ArrayList<>();
	
	private ArrayList<Partenariat> partenariats = new ArrayList<>();
	
	public Hotel() {}
	
	public Hotel (String nom, Ville ville, int nbEtoiles) {
		super();
		this.setNom(nom);
		this.setVille(ville);
		this.setNbEtoiles(nbEtoiles);
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Ville getVille (){
		return this.ville;
	}
	
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	public int getNbEtoiles() {
		return this.nbEtoiles; 
	}
	
	public void setNbEtoiles(int nbEtoiles) {
		this.nbEtoiles = nbEtoiles;
	}
	
	public ArrayList<Chambre> getChambres() {
		return chambres;
	}
	
	public void setChambres(ArrayList<Chambre> chambres) {
		this.chambres = chambres;
	}
	
	public void ajouterPartenariat (Partenariat p) {
		this.partenariats.add(p);
	}
	
	
	//methode qui renvoie les chambres libres entre 2 date, sans chevauchement
	public ArrayList<Chambre> listeChambresLibres (int dateDebut, int dateFin) { 
		ArrayList<Chambre> chambresLibres = new ArrayList<> ();
		for (Chambre c : this.getChambres()) {
			if (c.estDisponible(dateDebut, dateFin)) {
				chambresLibres.add(c);
			} 
		}
		return chambresLibres; 
	}
	
	public boolean ajouter(Chambre ch) {
		boolean b = false;
		if(!this.getChambres().contains(ch)) {
			this.getChambres().add(ch);
			b=true;
		} else {
			System.err.println(ch.getId() + " existe déjà dans " + this.getNom());
		}
		return b;
	}
	
	public boolean createChambre(int nbLits, double prix) {
		if (nbLits <= 0 || prix < 0) {
			System.err.println("Paramètres invalides");
			return false;
		} 
		Chambre chambre = new Chambre(nbLits, prix, this);
		return this.ajouter(chambre);
	}
	
	public String afficheChambre() {
		String result = "";
		for (Chambre chambre : this.getChambres()) {
			result+=chambre.toString()+"\n";
		}
		return result;
	}
	
	public double calculerPrixAgence (Chambre chambre, String agenceID) {
		double prixDeBase = chambre.getPrix();
		
		for (Partenariat p : this.partenariats) {
			if(p.getAgenceID().equals(agenceID)) {
				return prixDeBase * (1.0 - p.getPourcentageReduction());
			}
		}
		return prixDeBase;
	}
	
	
	

}
