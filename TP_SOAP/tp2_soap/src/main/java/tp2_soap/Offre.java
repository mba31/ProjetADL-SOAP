package tp2_soap;

public class Offre {
	public String idOffre;
	public int nbLits;
	public double prix;
	public int dateDispo;
	public String urlImage;
	
	public Offre() { }
	
	public Offre (String idOffre, int nbLits, double prix, int dateDispo, String urlImage) {
		this.idOffre = idOffre; 
		this.nbLits = nbLits; 
		this.prix = prix;
		this.dateDispo = dateDispo; 
		this.urlImage = urlImage;
	}	 

}
