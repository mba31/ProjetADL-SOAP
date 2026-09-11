package tp2_soap;

public class Reservation {
	private static int ID_compt = 0;
	private String id;
	private int dateDebut;
	private int dateFin;
	private Chambre chambres;
	private String nomClient;
	
	public Reservation (int dateDebut, int dateFin, Chambre chambre, String nomClient) {
		ID_compt++;
		this.id = "RES_" + ID_compt;
		this.setDateDebut(dateDebut);
		this.setDateFin(dateFin);
		this.setChambre(chambre);
		this.setNomClient(nomClient);
	}
	
	public String getId() { return this.id; }
	public void setId(String id) { this.id = id; }
	
	public int getDateDebut() { return this.dateDebut; }
	public void setDateDebut(int dateDebut) { this.dateDebut = dateDebut; }
	
	public int getDateFin() { return this.dateFin; }
	public void setDateFin( int dateFin ) { this.dateFin = dateFin; }
	
	public Chambre getChambre() { return this.chambres; }
	public void setChambre( Chambre chambre) { this.chambres = chambre; }
	
	public String getNomClient() { return this.nomClient; }
	public void setNomClient(String nomClient) { this.nomClient = nomClient; }
	
	@Override
	public String toString() {
		return "Reservation [ID = " + id + ", Client = " + nomClient + ", Date Début =  " + dateDebut
				+ ", Date Fin = " + dateFin + " ]."; 
	}
	

}
