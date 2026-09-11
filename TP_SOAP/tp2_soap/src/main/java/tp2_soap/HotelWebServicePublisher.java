package tp2_soap;

import javax.xml.ws.Endpoint;

public class HotelWebServicePublisher {

	public static void main(String[] args) {
		Hotel monHotel = new Hotel("Hilton Paris", Ville.PARIS, 5);
		for (int i=0; i < 10; i++) {
			monHotel.createChambre(1 + i/3, 50.0 + (i*10));
		}
        
        monHotel.ajouterPartenariat(new Partenariat("Agence1", 0.10));
        monHotel.ajouterPartenariat(new Partenariat("SejourInoubliable", 0.15));
        
        String url = "http://localhost:8082/hotelservice";
                
        Endpoint.publish(url, new HotelWebServiceImpl(monHotel));
        
        System.out.println("SERVEUR HOTEL : " + monHotel.getNom());
        System.out.println("STATUS : Prêt et en attente de requêtes...");
        System.out.println("URL WSDL : " + url + "?wsdl");
	}

}
