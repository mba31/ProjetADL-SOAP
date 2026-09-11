package tp2_soap;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

@WebService(endpointInterface = "tp2_soap.HotelWebService")
public class HotelWebServiceImpl implements HotelWebService {
	private Hotel hotelMetier; 
	
	public HotelWebServiceImpl(Hotel hotel) {
		this.hotelMetier = hotel;
	}

	@Override
	public List<Offre> consulterDisponibilites(String agenceId, String password, int debut, int fin, int nbPers) {
		List<Offre> resultats = new ArrayList<>();
		
		ArrayList<Chambre> libres = hotelMetier.listeChambresLibres(debut, fin);
		
		for (Chambre c : libres) {
			if (c.getNbLits() >= nbPers) {
				double prixFinal = hotelMetier.calculerPrixAgence(c, agenceId);
				String imagePath = "chambre1.jpeg";
				resultats.add(new Offre(c.getId(), c.getNbLits(), prixFinal, debut, imagePath));
			}
		}
		return resultats;
	}

	@Override
	public String efectuerReservation(String agenceId, String login, String password, String offreId, String nomClient, String prenomClient) {
	    
	    
	    if (!login.equals("admin") || !password.equals("password123")) {
	        return "ERREUR : Authentification agence échouée.";
	    }

	    //cherche la chambre correspondant à l'offre
	    for (Chambre c : hotelMetier.getChambres()) {
	        if (c.getId().equals(offreId)) {	    
	            return "RES_CONFIRMED_" + c.getId() + " pour " + prenomClient + " " + nomClient;
	        }
	    }
	    
	    return "ERREUR : Identifiant d'offre '" + offreId + "' introuvable.";
	}

}
