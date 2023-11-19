
public class ProduitGC extends Article{
ProduitGC (long ref, String lib, float p, int q){
	super(ref,lib,p, q);
}
float calculPrixTTC() {
	return this.prixHT*(1+super.TVA);
}
void decrire() {
	super.decrire();
}
}
