package tp2_soap;

import java.util.ArrayList;

public class Chambre {
	private static int ID_compt = 0;
	private String id;
	private int nbLits;
	private double prix;
	private Hotel hotels;
	private ArrayList<Reservation> reservations = new ArrayList<>();
	
	public Chambre() {}
	 
	public Chambre(int nbLits, double prix, Hotel hotels) {
		ID_compt++;
		this.id = "CH_" + ID_compt;; 
		this.setNbLits(nbLits);
		this.setPrix(prix);
		this.setHotels(hotels);
	}
	
	public String getId() {return this.id;	}
	public void setId(String id) { this.id = id; }
	
	public int getNbLits() { return this.nbLits; }
	public void setNbLits(int nbLits) { this.nbLits = nbLits; }
	
	public double getPrix() { return this.prix;	}
	public void setPrix(double prix) { this.prix = prix; } 
	
	public Hotel getHotels() { return this.hotels; }
	public void setHotels(Hotel hotels) { this.hotels = hotels; }
	
	public ArrayList<Reservation> getReservations() { return this.reservations; }
	public void setReservation(ArrayList<Reservation> reservations) { this.reservations = reservations; }
	
	public String toString() {
		return this.getId() + "\n ville : " + this.getHotels().getVille() +
				"\n prix : " + this.getPrix() + 
				"\n nb de lits : " + this.getNbLits() +
				"\n reservation " + this.getReservations().toString();
	}
	
	public boolean estDisponible(int dateDebut, int dateFin) {
		//verification que les dates sont bien entrées
		if(dateDebut >= dateFin) {
			return false;
		}
		//si pas de reservation , la chambre est dispo
		if(this.getReservations() == null || this.getReservations().size() == 0) {
			return true;
		}
		
		//vérification de chevauchement des dates
		for (Reservation res : this.getReservations()) {
			if (res == null) continue; //pas de while pour ne pas avoir une boucle infinie
				boolean overlap = dateDebut < res.getDateFin() && res.getDateDebut() < dateFin;
				if (overlap) { return false; }
		}
		return true;
	}
	

}
