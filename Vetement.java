
class Vetement extends ProduitGC implements Promotion{
private String couleur;
private char taille;
private String date;
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getCouleur() {
	return couleur;
}
public void setCouleur(String couleur) {
	this.couleur = couleur;
}
public char getTaille() {
	return taille;
}
public void setTaille(char taille) {
	this.taille = taille;
}
Vetement(long ref, String lib, float p, int q,String couleur,char taille){
	super(ref,lib,p, q);
	this.couleur=couleur;
	this.taille=taille;
}

boolean appartientPromo() {
	return true;
}
public float prixDeVente(String dateStr) {
	if(appartientPromo() && estPeriodePromo(dateStr) ) {
		return super.calculPrixTTC()*0.3f;
	}
	else
		return super.calculPrixTTC();
}
void decrire() {
	super.decrire();
	System.out.println(" couleur :"+this.getCouleur()+" taille : "+this.getTaille());
}
}
