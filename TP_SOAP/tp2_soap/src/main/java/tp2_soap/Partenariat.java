package tp2_soap;

public class Partenariat {
	private String agenceID;
	private double pourcentageReduction;
	
	public Partenariat(String agenceID, double pourcentageReduction) {
		this.agenceID = agenceID;
		this.pourcentageReduction = pourcentageReduction;
	}
		
		
	public String getAgenceID() { return agenceID; }
	public void setAgenceID(String agenceID) { this.agenceID = agenceID; }
	
	public double getPourcentageReduction() { return this.pourcentageReduction; }
	public void setPourcentageReduction(double pourcentageReduction) { this.pourcentageReduction = pourcentageReduction;}
			
		
}


