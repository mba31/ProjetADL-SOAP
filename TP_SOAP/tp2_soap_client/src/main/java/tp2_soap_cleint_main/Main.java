package tp2_soap_cleint_main;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import java.awt.*;
import javax.swing.*;

import tp2_soap_client.HotelWebService;
import tp2_soap_client.HotelWebServiceImplService;
import tp2_soap_client.*;

public class Main {
	private static HotelWebService proxy;

	public static void main(String[] args) {
		try { 
			URL url = new URL("http://localhost:8082/hotelservice?wsdl"); 
			HotelWebServiceImplService serviceImpl = new HotelWebServiceImplService(url);
			proxy = serviceImpl.getHotelWebServiceImplPort();
			
			SwingUtilities.invokeLater(() -> creerEtAfficherGUI());
			
			
			// --- TEST DES MÉTHODES ---
            
            System.out.println("--- Consultation des disponibilités ---");
            // Appel de la méthode distante
            List<Offre> offres = proxy.consulterDisponibilites("Agence1", "pwd123", 10, 15, 2);

            if (offres.isEmpty()) {
                System.out.println("Aucune offre trouvée.");
            } else {
                for (Offre o : offres) {
                	System.out.println("Offre : " + o.getIdOffre() + " | Image : " + o.getUrlImage());
                }
            }

            // --- TEST DE RÉSERVATION ---
            if (!offres.isEmpty()) {
                String resId = offres.get(0).getIdOffre();
                System.out.println("\n--- Tentative de réservation pour l'offre : " + resId + " ---");
                String confirmation = proxy.efectuerReservation("Agence1", "admin", "password123", resId, "Dupont", "Jean");
                System.out.println("Réponse serveur : " + confirmation);
            }
            
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	
		private static void creerEtAfficherGUI() {
	        JFrame frame = new JFrame("Agence de Voyage - Système de Réservation Connecté");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new BorderLayout(10, 10));

	        // --- Panneau de CRITÈRES ---
	        JPanel recherchePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
	        recherchePanel.setBorder(BorderFactory.createTitledBorder("Recherche via Web Service"));

	        JComboBox<String> cbVille = new JComboBox<>(new String[]{"PARIS", "LONDON", "TOKYO", "NEW_YORK"});
	        JTextField dateDebutField = new JTextField("10", 5);
	        JTextField dateFinField = new JTextField("15", 5);
	        JTextField nbPersField = new JTextField("2", 2);
	        JButton btnRechercher = new JButton("Rechercher");

	        recherchePanel.add(new JLabel("Ville :"));
	        recherchePanel.add(cbVille);
	        recherchePanel.add(new JLabel("Début :"));
	        recherchePanel.add(dateDebutField);
	        recherchePanel.add(new JLabel("Fin :"));
	        recherchePanel.add(dateFinField);
	        recherchePanel.add(new JLabel("Pers :"));
	        recherchePanel.add(nbPersField);
	        recherchePanel.add(btnRechercher);

	        // --- Panneau de RÉSULTATS ---
	        JPanel resultatsPanel = new JPanel();
	        resultatsPanel.setLayout(new BoxLayout(resultatsPanel, BoxLayout.Y_AXIS));
	        JScrollPane scrollPane = new JScrollPane(resultatsPanel);

	        frame.add(recherchePanel, BorderLayout.NORTH);
	        frame.add(scrollPane, BorderLayout.CENTER);

	        // --- LOGIQUE DU BOUTON RECHERCHER ---
	        btnRechercher.addActionListener(e -> {
	            try {
	                int debut = Integer.parseInt(dateDebutField.getText());
	                int fin = Integer.parseInt(dateFinField.getText());
	                int nbPers = Integer.parseInt(nbPersField.getText());

	                // APPEL DISTANT AU SERVEUR
	                List<Offre> offres = proxy.consulterDisponibilites("Agence1", "pwd123", debut, fin, nbPers);

	                resultatsPanel.removeAll();
	                if (offres.isEmpty()) {
	                    resultatsPanel.add(new JLabel("Aucune offre disponible pour ces critères."));
	                } else {
	                    for (Offre offre : offres) {
	                        resultatsPanel.add(creerFicheOffre(offre, debut, fin, frame));
	                        resultatsPanel.add(Box.createRigidArea(new Dimension(0, 5)));
	                    }
	                }
	                resultatsPanel.revalidate();
	                resultatsPanel.repaint();

	            } catch (Exception ex) {
	                JOptionPane.showMessageDialog(frame, "Erreur lors de la recherche : " + ex.getMessage());
	            }
	        });

	        frame.setSize(900, 600);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }

		private static JPanel creerFicheOffre(Offre offre, int debut, int fin, JFrame frame) {
		    // 1. Création du panneau principal de la fiche
		    JPanel panel = new JPanel(new BorderLayout(15, 10));
		    panel.setBorder(BorderFactory.createCompoundBorder(
		            BorderFactory.createLineBorder(Color.GRAY),
		            BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		    panel.setMaximumSize(new Dimension(850, 150));

		    // 2. Création du label pour l'image
		    JLabel imageLabel = new JLabel();
		    imageLabel.setPreferredSize(new Dimension(150, 100));

		    // --- DEBUT DE LA PARTIE LOGIQUE LOCALE ---
		    try {
		        // On cherche l'image dans le dossier "images" à la racine du projet
		        String cheminComplet = "images/" + offre.getUrlImage(); 
		        
		        ImageIcon iconBrut = new ImageIcon(cheminComplet);
		        
		        if (iconBrut.getIconWidth() > 0) {
		            // Si l'image est trouvée, on la redimensionne
		            Image img = iconBrut.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH);
		            imageLabel.setIcon(new ImageIcon(img));
		        } else {
		            // Si le fichier n'existe pas ou est corrompu
		            imageLabel.setText("[Image introuvable]");
		            System.err.println("ERREUR : Fichier non trouvé ici -> " + cheminComplet);
		        }
		    } catch (Exception e) {
		        imageLabel.setText("[Erreur chargement]");
		    }
		    // --- FIN DE LA PARTIE LOGIQUE LOCALE ---

		    panel.add(imageLabel, BorderLayout.WEST);

		    // 3. Infos au centre (ID, Lits, Prix)
		    String infos = "<html><body>" +
		                   "<h3 style='margin:0;'>Offre : " + offre.getIdOffre() + "</h3>" +
		                   "Capacité : <b>" + offre.getNbLits() + " lits</b><br>" +
		                   "<font color='green' size='5'>Prix : " + offre.getPrix() + " €</font>" +
		                   "</body></html>";
		    panel.add(new JLabel(infos), BorderLayout.CENTER);

		    // 4. Bouton de réservation à droite
		    JButton btnRes = new JButton("Réserver");
		    btnRes.setPreferredSize(new Dimension(120, 40));
		    btnRes.addActionListener(e -> {
		        String nom = JOptionPane.showInputDialog(frame, "Nom du client :");
		        if (nom != null && !nom.isEmpty()) {
		            // Appel du proxy (Web Service)
		            String conf = proxy.efectuerReservation("Agence1", "admin", "password123", 
		                                                    offre.getIdOffre(), nom, "Prenom");
		            JOptionPane.showMessageDialog(frame, conf);
		        }
		    });
		    panel.add(btnRes, BorderLayout.EAST);

		    return panel;
		}
}


