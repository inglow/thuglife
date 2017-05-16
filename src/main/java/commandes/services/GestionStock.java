package commandes.services;

import java.util.ArrayList;
import java.util.List;

import commandes.domain.Produit;
import commandes.domain.Stock;

public class GestionStock {
	
	List<Stock> stocks = new ArrayList<Stock>();
	
	public void creerStock(int typeProduit, int nombreProduits){
		
		ArrayList<Produit> produits = new ArrayList<Produit>();
		
		Stock stock = new Stock();
		
		for(int i=0; i<nombreProduits; i++){
			Produit produit = new Produit(typeProduit); 
			produits.add(produit);			
			produit.setStock(stock);
		}
		
		stock.setProduits(produits);
		
		stocks.add(stock);
		
	}

	public List<Stock> listerStocks() {
		return stocks;
	}

	

}
