
public class Achat {
	public static void main(String[] args) {
		Supermarche s= new Supermarche(4,"21/03/2023");
		Article s1 = new Vetement(123, "Jupe", 39.0f, 2, "Bleue", 'S');
		Article s2 = new ProduitElec(145, "TV Led 80cm", 1450.0f, 0, "TV");
		Article s3 = new Vetement(178, "Pantalon ", 42.0f, 5, "Noir", 'M');
		Article s4 = new ProduitGC(191, "Pates", 0.41f, 18);
		s.ajoutArticle(s1);
		s.ajoutArticle(s2);
		s.ajoutArticle(s3);
		s.ajoutArticle(s4);
		s.affichage();
		System.out.println("");
		s.acheter();
		System.out.println("le montant total = "+ s.montantTot()+"dt");
		
}
}
