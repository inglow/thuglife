package commandes;

import commandes.services.GestionCommande;
import commandes.services.GestionStock;


public class Main {

	public static void main(String[] args) {

		GestionCommande gestionCommande = new GestionCommande();
	GestionStock gestionStock = new GestionStock();

		int typeProduit = 1;
		int nombreProduits = 5;
		gestionCommande.creerCommande(typeProduit, nombreProduits);
		gestionStock.creerStock(typeProduit, nombreProduits);
		
	}

}
