package tp2_soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface HotelWebService {
	@WebMethod
	List<Offre> consulterDisponibilites(String agenceId, String password, int debut, int fin, int nbPers);
	
	@WebMethod
	String efectuerReservation(String agenceId, String login, String password, String offreId, String nomClient, String prenomClient);
	

}
