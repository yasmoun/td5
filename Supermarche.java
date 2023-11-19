import java.util.Scanner;
public class Supermarche {
	Article Supermarche[];
	int taille;
	int nb=0;
	static float n=0;
	String date;
	Supermarche (int taille,String date){
		this.date=date;
		this.taille=taille;
		Supermarche=new Article[taille];
		System.out.println("Spermarche du "+date);
	}
	void ajoutArticle (Article a) {
		if(nb<taille) {
			Supermarche[nb]=a;
			nb++;}
		else {
			System.out.println("Supermarche pleine");
		}
	}
	void affichage() {
		for(int i=0;i<nb;i++) {
			Supermarche[i].decrire();
		}
	}
	void acheter() {

		Scanner sc =new Scanner(System.in);
		for(int i=0;i<nb;i++) {
			System.out.print("entrer la quantite achetee pour l'article n"+(i+1)+": ");
			int q=sc.nextInt();
			if(Supermarche[i].estDispo(q)) {
				System.out.println("article disponible en stock");
				if(q>0) {
				System.out.println("article achete "+q+" fois:");
				Supermarche[i].decrire();
				if(Supermarche[i] instanceof Vetement) {
					n+=((Vetement)Supermarche[i]).prixDeVente("21/03/2023")*q;
					System.out.println("prix= "+((Vetement)Supermarche[i]).prixDeVente("21/03/2023")*q+"dt");}
				else if(Supermarche[i] instanceof ProduitElec) {
					n+=((ProduitElec)Supermarche[i]).prixDeVente("21/03/2023")*q;
					System.out.println("prix= "+((ProduitElec)Supermarche[i]).prixDeVente("21/03/2023")*q+"dt");}
				else {
					n+=Supermarche[i].calculPrixTTC()*q;
					System.out.println("prix ="+Supermarche[i].calculPrixTTC()*q+"dt");}
				}
		
			}
			else
				System.out.println("article non disponible en stock");
				Supermarche[i].approvisionner(2);
				if(Supermarche[i] instanceof Vetement) 
					n+=((Vetement)Supermarche[i]).prixDeVente("21/03/2023")*q;
				else if(Supermarche[i] instanceof ProduitElec) 
					n+=((ProduitElec)Supermarche[i]).prixDeVente("21/03/2023")*q;
				else 
					n+=Supermarche[i].calculPrixTTC()*q;
		}
	}
	float montantTot() {
		return n;
	}
}
	