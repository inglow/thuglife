package commandes.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import commandes.services.GestionCommande;
import commandes.services.GestionStock;
import commandes.domain.Commande;
import commandes.domain.Stock;

@Controller
public class GestionCommandesController {

	GestionCommande gestionCommande = new GestionCommande();
	GestionStock gestionStock = new GestionStock();

	@RequestMapping(value = "/commandes", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void creerCommande(@RequestBody UneCommande uneCommande) {
		gestionCommande.creerCommande(uneCommande.getTypeProduit(), uneCommande.getNombreProduits());
	}

	@RequestMapping(value = "/commandes", method = RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public List<Commande> listerCommandes() {
		return gestionCommande.listerCommandes();
	}
	@RequestMapping(value = "/stocks", method = RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public List<Stock> listerStock() {
		return gestionStock.listerStocks();
	}

	@RequestMapping(value = "/stocks", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void creerStock(@RequestBody UnStock unStock) {
		gestionStock.creerStock(unStock.getTypeProduit(), unStock.getNombreProduits());
	}
}
