package RimBoite.prob.gestionmagasin;

import java.util.Date;
import java.util.LinkedList;

import RimBoite.gestion.employes.Caissier;
import RimBoite.gestion.employes.Employer;
import RimBoite.gestion.employes.Responsable;
import RimBoite.gestion.employes.Vendeur;
import RimBoite.gestionMagazin.data.ListeChainee;

public class Application {


	public static void main(String[] args) {

		ListeChainee lisp = new ListeChainee();
		ListeChainee lisp1 = new ListeChainee();


		Produit riz = new Produit(1, "RizP", "RimRiz", 10002.0);
		Produit the = new Produit(90, "The", "Azawad", 10002.0);

		Produit coffee = new Produit(1, "Coffie", "Nestlet", 90.0);
		Produit eau = new Produit(12, "Eau", "Tayba", 10.0);


		lisp.add(riz);
		lisp.add(the);
		lisp1.add(coffee);
		lisp1.add(eau);

		Magazin mg1 = new Magazin(1, " Carrefour - - Centre-Ville ", 50, null);
		Magazin mg2 = new Magazin(2, " Monoprix --- Tavragh Zein ", 50, null);

		LinkedList<Employer> mg1Employes = new LinkedList<>();

		mg1Employes.add(new Caissier(0, "Sidi", "Carrefour", 240, 208));
		mg1Employes.add(new Caissier(1, "Sadame", "Leksar", 240, 209));
		mg1Employes.add(new Vendeur(2, "Ahmed", "Leksar", 240, 16));
		mg1Employes.add(new Responsable(4, "El Hadramy", "Capitale", 240, 40));

		mg1.setEmployes(mg1Employes);
		mg1.setProduits(lisp);
		mg2.setEmployes(mg1Employes);
		mg2.setProduits(lisp1);

		LinkedList<Employer> mg2Employes = new LinkedList<>();

		mg2Employes.add(new Caissier(0, "Didi", "Arafat", 240, 208));
		mg2Employes.add(new Vendeur(3, "Dia", "Leksar", 240, 10));
		mg2Employes.add(new Vendeur(4, "Amadou", "Carrfour", 240, 15));
		mg2Employes.add(new Vendeur(2, "Ahmed", "Leksar", 240, 16));
		mg2Employes.add(new Responsable(4, "El Hadramy", "Capitale", 240, 40));

		mg2.setEmployes(mg2Employes);

		System.out.println(
				"--------------------------- Magazin 1  les employes avec leur caracteristiques  ---------------------");

		mg1.getEmployes().forEach((emp) -> {
			if (emp instanceof Vendeur) {
				Vendeur vd = (Vendeur) emp;
				System.out.println(vd.toString());
			} else if (emp instanceof Caissier) {
				Caissier cs = (Caissier) emp;
				System.out.println(cs.toString());
			} else {
				Responsable resp = (Responsable) emp;
				System.out.println(resp.toString());
			}
		});

		System.out.println(
				"--------------------------- Magazin 2  les employes avec leur caracteristiques  ---------------------");

		mg2.getEmployes().forEach((emp) -> {
			if (emp instanceof Vendeur) {
				Vendeur vd = (Vendeur) emp;
				System.out.println(vd.toString());
			} else if (emp instanceof Caissier) {
				Caissier cs = (Caissier) emp;
				System.out.println(cs.toString());
			} else {
				Responsable resp = (Responsable) emp;
				System.out.println(resp.toString());
			}
		});


		System.out.println("----------------------------- Magazin  1 affichage  -------------------------------------");
		System.out.println(mg1.toString());
		System.out.println(
				"===========================les employes avec les salaires du magazin 1 ==================================");

		mg1.getEmployes().forEach((emp) -> {

			if (emp instanceof Vendeur) {
				Vendeur vd = (Vendeur) emp;
				System.out.println(vd.toString());
				System.out.println("Vendeur Salaire : " + vd.calculeSalaire());

			} else if (emp instanceof Caissier) {

				Caissier cs = (Caissier) emp;
				System.out.println(cs.toString());
				System.out.println("Caissier salaire : " + cs.calculeSalaire());
			} else {

				Responsable resp = (Responsable) emp;
				System.out.println(resp.toString());
				System.out.println("Responsable salaire : " + resp.calculeSalaire());
			}
		});

		System.out.println(
				"------------------------  les produits du Magazin 1   --------------------------------------------------");
		mg1.getProduits().display();

		System.out.println("----------------------------- Magazin  2 affichage  -------------------------------------");
		System.out.println(mg2.toString());
		System.out.println(
				"===========================les employes avec les salaieres du magazin 2 ==================================");

		mg2.getEmployes().forEach((emp) -> {

			System.out.println("------------------------------------------------");

			if (emp instanceof Vendeur) {
				Vendeur vd = (Vendeur) emp;
				System.out.println(vd.toString());
				System.out.println("Vendeur Salaire : " + vd.calculeSalaire());
			} else if (emp instanceof Caissier) {
				Caissier cs = (Caissier) emp;
				System.out.println(cs.toString());
				System.out.println("Caissier salaire : " + cs.calculeSalaire());
			} else {
				Responsable resp = (Responsable) emp;
				System.out.println(resp.toString());
				System.out.println("Responsable salaire : " + resp.calculeSalaire());
			}
		});

		System.out.println(
				"------------------------  les produits du Magazin 2   --------------------------------------------------");
		mg1.getProduits().display();

		System.out.println();
		System.out.println();
		System.out.println("======« RimBoite» Gestion Catégories de Produits ====================================");


		// ListeChainee produits = new ListeChainee();
		Produit p1 = new ProduitFruit(12345, "Fraise ", "AnyMarque", 10.0, "Martrs", 12.3);
		Produit p2 = new ProduitFruit(1224, "Pastèque  ", "AnyMarque", 10.0, "Juin", 50.0);
		Produit p3 = new ProduitFruit(7896, "Mandarine  ", "AnyMarque", 10.0, "Décembre", 25.6);
		Produit p4 = new ProduitLegume(8521, "Artichauts ", "AnyMarque", 10.0, "Janvier", 14.0);

		mg1.getProduits().add(p1);
		mg1.getProduits().add(p2);
		mg1.getProduits().add(p3);
		mg1.getProduits().add(p4);

		System.out.println("---------------Les produits avec leur type ------------------------");
		mg1.getProduits().display();

		/// Peroduit
		Produit any = new Produit();
		Produit npp1 = new Produit(10212, "Lait", "Delice");
		Produit npp2 = new Produit(2510, "Yaourt", "Vitalait");
		Produit npp3 = new Produit(3250, "Tomate", "Sicam", 1.200);

		ListeChainee np = new ListeChainee();
		np.add(any);
		np.add(npp1);
		np.add(npp2);
		np.add(npp3);

		System.out.println("Type Produit npp3 : " + npp3.determinerTypeProduit());

		np.display();
		System.out.println("---------------- Les produits aprs modifications ----------------------");
		npp1.setPrix(0.700);
		System.out.println(npp1.toString());

		any = new Produit(112221, "Huile", "Anymarque", 30.0);
		System.out.println(any.toString());
		npp2.setPrix(120.0);
		System.out.println(npp2.toString());

		any.setDate(new Date(12, 12, 2019));

	}

}
