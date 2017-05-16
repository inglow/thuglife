package commandes.services;

import java.util.ArrayList;
import java.util.List;

import commandes.domain.Produit;
import commandes.domain.Commande;

public class GestionCommande {
	
	List<Commande> commandes = new ArrayList<Commande>();
	
	public void creerCommande(int typeProduit, int nombreProduits){
		
		ArrayList<Produit> produits = new ArrayList<Produit>();
		
		Commande commande = new Commande();
		
		for(int i=0; i<nombreProduits; i++){
			Produit produit = new Produit(typeProduit); 
			produits.add(produit);			
			produit.setCommande(commande);
		}
		
		commande.setProduits(produits);
		
		commandes.add(commande);
		
	}

	public List<Commande> listerCommandes() {
		return commandes;
	}

}
