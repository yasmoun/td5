abstract public class Article {
protected long reference;
protected String libelle;
protected float prixHT;
protected int qteStock=0;
protected final float TVA=0.1f;
Article(long ref, String lib, float p, int q){
	this.reference=ref;
	this.libelle=lib;
	this.prixHT=p;
	this.qteStock=q;
}
public long getReference() {
	return reference;
}
public void setReference(long reference) {
	this.reference = reference;
}
public double getTVA() {
	return TVA;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public void setPrixHT(float prixHT) {
	this.prixHT = prixHT;
}
public void setQteStock(int qteStock) {
	this.qteStock = qteStock;
}
public String getLibelle() {
	return libelle;
}
public float getPrixHT() {
	return prixHT;
}
public int getQteStock() {
	return qteStock;
}
void approvisionner(int nb) {
	this.setQteStock(this.getQteStock()+nb);
}
void decrire() {
	System.out.println(this.getClass().getSimpleName()+" : la reference : "+this.getReference()+" ,libelle :"+this.getLibelle());
}
abstract float calculPrixTTC();
 boolean appartientPromo() {
	return false;
}
boolean estDispo(int qteAchat) {
	if (this.getQteStock()>=0 && this.getQteStock()>qteAchat)
		return true;
	else
		return false;
}
}