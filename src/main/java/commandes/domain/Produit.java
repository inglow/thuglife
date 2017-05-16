package commandes.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Produit {
	
	@JsonIgnore
	Commande commande;
	Stock stock;
	int typeProduit;

	public Produit(int typeProduit) {
		super();
		this.typeProduit = typeProduit;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public int getTypeProduit() {
		return typeProduit;
	}

	public void setTypeProduit(int typeProduit) {
		this.typeProduit = typeProduit;
	}
	
	

}
