package tp2_soap;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;


public class MainHotel {
	public static void main(String[] args) {
		
		// PARIS
        Hotel h1  = new Hotel("Hilton Paris Opera", Ville.PARIS, 5);
        Hotel h2  = new Hotel("Ibis Paris Bastille", Ville.PARIS, 3);
        Hotel h3  = new Hotel("Hotel Voltaire", Ville.PARIS, 2);
        Hotel h4  = new Hotel("Le Grand Paris", Ville.PARIS, 4);

        // NEW_YORK
        Hotel h5  = new Hotel("Radisson Times Square", Ville.NEW_YORK, 5);
        Hotel h6  = new Hotel("Budget Inn NYC", Ville.NEW_YORK, 2);
        Hotel h7  = new Hotel("Manhattan Suites", Ville.NEW_YORK, 4);
        Hotel h8  = new Hotel("Brooklyn Comfort", Ville.NEW_YORK, 3);

        // TOKYO
        Hotel h9  = new Hotel("Tokyo Central Hotel", Ville.TOKYO, 4);
        Hotel h10 = new Hotel("Shinjuku Inn", Ville.TOKYO, 3);
        Hotel h11 = new Hotel("Sakura Grand", Ville.TOKYO, 5);
        Hotel h12 = new Hotel("Asakusa Guesthouse", Ville.TOKYO, 2);

        // LONDON
        Hotel h13 = new Hotel("The Londoner", Ville.LONDON, 5);
        Hotel h14 = new Hotel("Camden Lodge", Ville.LONDON, 3);
        Hotel h15 = new Hotel("Thames View Hotel", Ville.LONDON, 4);
        Hotel h16 = new Hotel("Budget London", Ville.LONDON, 2);

        // SYDNEY
        Hotel h17 = new Hotel("Harbour Grand", Ville.SYDNEY, 5);
        Hotel h18 = new Hotel("Bondi Beach Inn", Ville.SYDNEY, 3);
        Hotel h19 = new Hotel("Sydney Central", Ville.SYDNEY, 4);
        Hotel h20 = new Hotel("Opera House Hostel", Ville.SYDNEY, 2);

        // RIO_DE_JANEIRO
        Hotel h21 = new Hotel("Copacabana Palace", Ville.RIO_DE_JANEIRO, 5);
        Hotel h22 = new Hotel("Ipanema Lodge", Ville.RIO_DE_JANEIRO, 4);
        Hotel h23 = new Hotel("Sugarloaf Inn", Ville.RIO_DE_JANEIRO, 3);
        Hotel h24 = new Hotel("Rio Budget Stay", Ville.RIO_DE_JANEIRO, 2);

        // ROME
        Hotel h25 = new Hotel("Colosseum Hotel", Ville.ROME, 5);
        Hotel h26 = new Hotel("Trastevere Inn", Ville.ROME, 3);
        Hotel h27 = new Hotel("Via Veneto Grand", Ville.ROME, 4);
        Hotel h28 = new Hotel("Roma Economica", Ville.ROME, 2);

        // BERLIN
        Hotel h29 = new Hotel("Berlin Central", Ville.BERLIN, 4);
        Hotel h30 = new Hotel("Alexanderplatz Hotel", Ville.BERLIN, 5);
        Hotel h31 = new Hotel("Kreuzberg Lodge", Ville.BERLIN, 3);
        Hotel h32 = new Hotel("Berlin Budget", Ville.BERLIN, 2);

        // MOSCOW
        Hotel h33 = new Hotel("Red Square Hotel", Ville.MOSCOW, 5);
        Hotel h34 = new Hotel("Arbat Comfort", Ville.MOSCOW, 4);
        Hotel h35 = new Hotel("Moscow Inn", Ville.MOSCOW, 3);
        Hotel h36 = new Hotel("Soviet Budget", Ville.MOSCOW, 2);

        // BEIJING
        Hotel h37 = new Hotel("Forbidden City Hotel", Ville.BEIJING, 5);
        Hotel h38 = new Hotel("Wangfujing Inn", Ville.BEIJING, 4);
        Hotel h39 = new Hotel("Beijing Central", Ville.BEIJING, 3);
        Hotel h40 = new Hotel("Peking Budget", Ville.BEIJING, 2);

        // TORONTO
        Hotel h41 = new Hotel("Toronto Grand", Ville.TORONTO, 5);
        Hotel h42 = new Hotel("Downtown Toronto Inn", Ville.TORONTO, 4);
        Hotel h43 = new Hotel("Queen St. Lodge", Ville.TORONTO, 3);
        Hotel h44 = new Hotel("Toronto Budget Stay", Ville.TORONTO, 2);

        // MARRAKECH
        Hotel h45 = new Hotel("Royal Palm M", Ville.MARRAKECH, 5);
        Hotel h46 = new Hotel("Riad Al Jamil", Ville.MARRAKECH, 4);
        Hotel h47 = new Hotel("Medina Comfort", Ville.MARRAKECH, 3);
        Hotel h48 = new Hotel("Marrakech Auberge", Ville.MARRAKECH, 2);

        // MEXICO
        Hotel h49 = new Hotel("Mexico City Grand", Ville.MEXICO, 5);
        Hotel h50 = new Hotel("Condesa Inn", Ville.MEXICO, 4);
        Hotel h51 = new Hotel("Centro Budget", Ville.MEXICO, 3);
        Hotel h52 = new Hotel("Mexico Hostel", Ville.MEXICO, 2);

        // CAPE_TOWN
        Hotel h53 = new Hotel("Table Mountain Hotel", Ville.CAPE_TOWN, 5);
        Hotel h54 = new Hotel("Sea View Lodge", Ville.CAPE_TOWN, 4);
        Hotel h55 = new Hotel("Cape Town Inn", Ville.CAPE_TOWN, 3);
        Hotel h56 = new Hotel("Cape Budget Stay", Ville.CAPE_TOWN, 2);

        // DUBAI
        Hotel h57 = new Hotel("Burj View Hotel", Ville.DUBAI, 5);
        Hotel h58 = new Hotel("Dubai Marina Inn", Ville.DUBAI, 4);
        Hotel h59 = new Hotel("Deira Comfort", Ville.DUBAI, 3);
        Hotel h60 = new Hotel("Dubai Budget", Ville.DUBAI, 2);

        // SINGAPORE
        Hotel h61 = new Hotel("Marina Bay Grand", Ville.SINGAPORE, 5);
        Hotel h62 = new Hotel("Orchard Road Inn", Ville.SINGAPORE, 4);
        Hotel h63 = new Hotel("Little India Lodge", Ville.SINGAPORE, 3);
        Hotel h64 = new Hotel("Singapore Budget", Ville.SINGAPORE, 2);

		Agence a1= new Agence("Séjour inoubliable");
	
		
		ArrayList<Hotel> allHotels = new ArrayList<>();
        allHotels.add(h1);  allHotels.add(h2);  allHotels.add(h3);  allHotels.add(h4);
        allHotels.add(h5);  allHotels.add(h6);  allHotels.add(h7);  allHotels.add(h8);
        allHotels.add(h9);  allHotels.add(h10); allHotels.add(h11); allHotels.add(h12);
        allHotels.add(h13); allHotels.add(h14); allHotels.add(h15); allHotels.add(h16);
        allHotels.add(h17); allHotels.add(h18); allHotels.add(h19); allHotels.add(h20);
        allHotels.add(h21); allHotels.add(h22); allHotels.add(h23); allHotels.add(h24);
        allHotels.add(h25); allHotels.add(h26); allHotels.add(h27); allHotels.add(h28);
        allHotels.add(h29); allHotels.add(h30); allHotels.add(h31); allHotels.add(h32);
        allHotels.add(h33); allHotels.add(h34); allHotels.add(h35); allHotels.add(h36);
        allHotels.add(h37); allHotels.add(h38); allHotels.add(h39); allHotels.add(h40);
        allHotels.add(h41); allHotels.add(h42); allHotels.add(h43); allHotels.add(h44);
        allHotels.add(h45); allHotels.add(h46); allHotels.add(h47); allHotels.add(h48);
        allHotels.add(h49); allHotels.add(h50); allHotels.add(h51); allHotels.add(h52);
        allHotels.add(h53); allHotels.add(h54); allHotels.add(h55); allHotels.add(h56);
        allHotels.add(h57); allHotels.add(h58); allHotels.add(h59); allHotels.add(h60);
        allHotels.add(h61); allHotels.add(h62); allHotels.add(h63); allHotels.add(h64);

        for (Hotel h : allHotels) {
            a1.ajouterHotel(h);
        }
		
        for (Hotel h : allHotels) {
			for (int i=0; i<10; i++) {
				h.createChambre(1+i/3, i*10);
			}
		}
		
		
		
// --- 2. DÉFINITION DE L'INTERFACE GRAPHIQUE SWING ---
        
        JFrame frame = new JFrame(a1.getNom() + " - Système de Réservation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10)); // Utilisation de BorderLayout

        // --- Panneau de CRITÈRES DE RECHERCHE (en haut) ---
        JPanel recherchePanel = new JPanel();
        recherchePanel.setBorder(BorderFactory.createTitledBorder("Critères de Recherche"));
        recherchePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        
        JLabel labelVille = new JLabel("Ville :");
        Ville[] toutesLesVilles = Ville.values();
        JComboBox<Ville> cbVille = new JComboBox<>(toutesLesVilles);
        
        JLabel labelDebut = new JLabel("Date Début :");
        JTextField dateDebutField = new JTextField(5);
        JLabel labelFin = new JLabel("Date Fin :");
        JTextField dateFinField = new JTextField(5);
        
        JLabel labelEtoiles = new JLabel("Min. Étoiles :");
        JTextField etoilesField = new JTextField(2); // 2 colonnes pour saisir 1 à 5
        
        JButton btnRechercher = new JButton("Rechercher");
        
        recherchePanel.add(labelVille);
        recherchePanel.add(cbVille);
        recherchePanel.add(labelDebut);
        recherchePanel.add(dateDebutField);
        recherchePanel.add(labelFin);
        recherchePanel.add(dateFinField);
        recherchePanel.add(labelEtoiles);
        recherchePanel.add(etoilesField);
        
        recherchePanel.add(btnRechercher);

        // --- Panneau de RÉSULTATS (au centre) ---
        // Utilisé pour contenir les 'fiches' de chaque chambre trouvée
        JPanel resultatsPanel = new JPanel();
        // Utilise BoxLayout pour empiler les résultats les uns sous les autres
        resultatsPanel.setLayout(new BoxLayout(resultatsPanel, BoxLayout.Y_AXIS)); 
        JScrollPane scrollPane = new JScrollPane(resultatsPanel);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Chambres Disponibles"));
        
        // Ajout des panneaux au Frame
        frame.add(recherchePanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        
        // Configuration et affichage du Frame
        frame.setSize(800, 600); // Taille initiale
        frame.setLocationRelativeTo(null); // Centrer la fenêtre
        frame.setVisible(true);
        
        // --- 3. LOGIQUE INTERACTIVE (ACTION LISTENER) ---
        
        btnRechercher.addActionListener(e -> {
            
            // 1. Récupération et validation des critères
            Ville villeChoisie = (Ville) cbVille.getSelectedItem();
            int dateDebut;
            int dateFin;
            int minEtoiles = 3; //si le champ est vide, on cherche 3 etoiles min
            
            try {
                dateDebut = Integer.parseInt(dateDebutField.getText());
                dateFin = Integer.parseInt(dateFinField.getText());
                minEtoiles = Integer.parseInt(etoilesField.getText());
                
                /*
                if (minEtoiles < 11 || minEtoiles > 5) {
                	JOptionPane.showMessageDialog(frame, "Le nombre d'étoiles doit être entre 1 et 5.", "Erreur de Saisie", JOptionPane.ERROR_MESSAGE);
                    return;
                }*/
                if (dateDebut >= dateFin) {
                     JOptionPane.showMessageDialog(frame, "La date de début doit être antérieure à la date de fin.", "Erreur de Dates", JOptionPane.ERROR_MESSAGE);
                     return;
                }
                
                String etoilesText = etoilesField.getText().trim();
                if (!etoilesText.isEmpty()) {
                    minEtoiles = Integer.parseInt(etoilesText);
                    
                    // Validation si une valeur a été entrée
                    if (minEtoiles < 1 || minEtoiles > 5) {
                         JOptionPane.showMessageDialog(frame, "Le nombre d'étoiles doit être un nombre entier entre 1 et 5.", "Erreur de Saisie", JOptionPane.ERROR_MESSAGE);
                         return;
                    }
                }
                
                
                
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Veuillez entrer des dates valides (nombres entiers), et si spécifié, un nombre d'étoiles valide.", "Erreur de Saisie", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // 2. Recherche des chambres disponibles
            ArrayList<Hotel> hotelsVille = a1.rechercheHotelVille(villeChoisie);
            ArrayList<Hotel> hotelsFiltresParEtoile = a1.rechercheHotelEtoile(hotelsVille, minEtoiles);
            ArrayList<Chambre> chambresDisponibles = a1.rechercheChambreDate(hotelsFiltresParEtoile, dateDebut, dateFin);
            
          
            
            
            // 3. Affichage interactif des résultats
            
            // Vider les anciens résultats avant d'afficher les nouveaux
            resultatsPanel.removeAll();
            
            if (chambresDisponibles.isEmpty()) {
                JLabel noResultLabel = new JLabel("Aucune chambre disponible pour " + villeChoisie + " du " + dateDebut + " au " + dateFin + ".");
                resultatsPanel.add(noResultLabel);
            } else {
                JLabel headerLabel = new JLabel("--- " + chambresDisponibles.size() + " Chambres Disponibles à " + villeChoisie + " ---");
                resultatsPanel.add(headerLabel);
                resultatsPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Ajouter un espace
                
                // Parcourir la liste et créer une 'fiche' pour chaque chambre
                for (Chambre chambre : chambresDisponibles) {
                    
                    // Conteneur pour une seule ligne de chambre
                    JPanel chambreFiche = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 5));
                    chambreFiche.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
                    chambreFiche.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40)); // Pour maintenir une taille raisonnable
                    
                    // Texte des informations
                    String info = String.format("ID: %s | Prix: %.2f€ | Lits: %d | Hôtel: %s (%s Étoiles)", 
                                                chambre.getId(), 
                                                chambre.getPrix(), 
                                                chambre.getNbLits(), 
                                                chambre.getHotels().getNom(),
                                                chambre.getHotels().getNbEtoiles());
                    JLabel infoLabel = new JLabel(info);
                    
                    // Bouton de Réservation
                    JButton btnReserver = new JButton("Réserver");
                    
                    // --- Action de Réservation pour cette chambre ---
                    btnReserver.addActionListener(actionEvent -> {
                        String nomClient = JOptionPane.showInputDialog(frame, 
                                                                    "Entrez votre nom pour la chambre " + chambre.getId() + " :", 
                                                                    "Réservation", 
                                                                    JOptionPane.QUESTION_MESSAGE);
                        
                        if (nomClient != null && !nomClient.trim().isEmpty()) {
                            // Appel de la méthode métier de l'agence
                            Reservation res = a1.realiserReservation(chambre, dateDebut, dateFin, nomClient.trim());
                            
                            if (res != null) {
                                JOptionPane.showMessageDialog(frame, 
                                                              "Réservation confirmée pour " + nomClient + " !\nID: " + res.getId(), 
                                                              "Succès", 
                                                              JOptionPane.INFORMATION_MESSAGE);
                                
                                // Relancer la recherche pour mettre à jour la liste
                                btnRechercher.doClick(); 
                                
                            } else {
                                 JOptionPane.showMessageDialog(frame, 
                                                              "Erreur: Chambre non disponible pour ces dates (déjà réservée).", 
                                                              "Échec", 
                                                              JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    });
                    
                    // Ajouter les composants à la fiche et la fiche au panneau global
                    chambreFiche.add(infoLabel);
                    chambreFiche.add(btnReserver);
                    resultatsPanel.add(chambreFiche);
                }
            }
            
            // Mise à jour de l'affichage
            resultatsPanel.revalidate();
            resultatsPanel.repaint();
        });
		
		
		
		
		
		
		
		
		
		
		
	}

}
