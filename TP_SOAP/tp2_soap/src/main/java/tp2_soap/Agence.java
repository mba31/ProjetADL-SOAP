package tp2_soap;

import java.util.ArrayList;

public class Agence {
	private String nom;
	private ArrayList<Hotel> hotels = new ArrayList<>(); 
	
	public Agence() {}
	
	public Agence(String nom) {
		this.setNom(nom);
	}
	
	public String getNom() { return this.nom; }
	public void setNom(String nom) { this.nom = nom; }
	
	public ArrayList<Hotel> getHotels() { return this.hotels; }
	public void setHotels(ArrayList<Hotel> hotels) { this.hotels = hotels; }
	
	
	public ArrayList<Chambre> getChambre(){
		ArrayList<Chambre> liste = new ArrayList<>();
		for (Hotel hotels : this.getHotels()) {
			liste.addAll(hotels.getChambres());
		}
		return liste;
	}
	
	public boolean ajouterHotel (Hotel hotels) {
		boolean b= false;
		if(!this.getHotels().contains(hotels)) {
			this.getHotels().add(hotels);
			b=true;
		} else {
			System.err.println("L'ajout de l'Hotel " + hotels.getNom() + " a echoué.");
		}
		return b;
	}
	
	public ArrayList<Hotel> rechercheHotelVille (Ville ville){
		ArrayList<Hotel> listeHotelVille = new ArrayList<>();
		for (Hotel hotels : this.getHotels()) {
			if (hotels.getVille().equals(ville)) {
				listeHotelVille.add(hotels);
			}
		}
		return listeHotelVille;	
	}
	
	public ArrayList<Hotel> rechercheHotelEtoile (ArrayList<Hotel> selected, int nbEtoiles) {
		ArrayList<Hotel> listeHotelEtoile = new ArrayList<>();
		for (Hotel hotels : selected) {
			if (hotels.getNbEtoiles() >= nbEtoiles) {
				listeHotelEtoile.add(hotels);
			}
		}
		return listeHotelEtoile;
		
	}
	
	public ArrayList<Chambre> rechercheChambreDate(ArrayList<Hotel> selected, int dateDebut, int dateFin) {
		ArrayList<Chambre> listeChambreDispoDate = new ArrayList<>();
		for (Hotel hotels : selected) {
			for (Chambre chambre : hotels.getChambres()) {
				if (chambre.estDisponible(dateDebut, dateFin)) {
					listeChambreDispoDate.add(chambre); 
				}
			}
		}
		return listeChambreDispoDate;
	}
	
	public ArrayList<Chambre> rechercheChambreLit(ArrayList<Chambre> selected, int nbLits) {
		ArrayList<Chambre> listeChambreLit = new ArrayList<>();
		for (Chambre chambre : selected) {
			if (chambre.getNbLits() >= nbLits) {
				listeChambreLit.add(chambre);
			}
		}
		return listeChambreLit;
	}
	
	public ArrayList<Chambre> rechercheChambrePrix(ArrayList<Chambre> selected, double prixMin, double prixMax) {
		ArrayList<Chambre> listeChambrePrix = new ArrayList<>();
		for (Chambre chambre : selected) {
			if (chambre.getPrix() >= prixMin && chambre.getPrix() <= prixMax) {
				listeChambrePrix.add(chambre);
			}
		}
		return listeChambrePrix;
	}
	
	public String afficherChambres (ArrayList<Chambre> selected) {
		String resultat = " ";
		for (Chambre ch : selected) {
			resultat += ch.toString()+ "\n";
		}
		return resultat;
	}
	
	public String afficheToutesChambres () {
		String resultat = " ";
		for (Chambre ch : this.getChambre()) {
			resultat += ch.toString() + "\n";
		}
		return resultat;
	}
	
	
	
	
	
	// Partie Reservation
	public Reservation realiserReservation(Chambre chambre, int dateDebut, int dateFin, String nomClient) {
		if (chambre == null) {
			System.err.println("La chambre spécifié n'est pas disponible.");
			return null;
		}
		
		if (chambre.estDisponible(dateDebut, dateFin)) {
			//création d'une nouvelle reservation
			Reservation nouvRes = new Reservation(dateDebut, dateFin, chambre, nomClient);
			//ajout de la chambre
			chambre.getReservations().add(nouvRes);
			//affichage
			System.out.println("Réservation réussie : " + nouvRes.getId() + 
					" pour la chambre " + chambre.getId() + 
					" du " + dateDebut + " au " + dateFin );
			return nouvRes;
		} else {
			System.err.println("La chambre " + chambre.getId() +
					" n'est pas dispo entre le " + dateDebut + " et le " +
					dateFin);
			return null;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
