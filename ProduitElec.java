class ProduitElec extends Article implements Promotion{
private String categorie;
String[] tableau = {"électroménager", "TV", "téléphones", "ordinateurs"};
public String getCategorie() {
	return categorie;
}
public void setCategorie(String categorie) {
	for (String element : tableau) {
        if (element.equalsIgnoreCase(categorie)) {
            this.categorie=categorie;
            break;
        }
    }
}
ProduitElec(long ref, String lib, float p, int q,String categorie){
	super(ref,lib,p, q);
	this.setCategorie(categorie);
}
float calculPrixTTC() {
	return this.prixHT*(1.08f+super.TVA);
}
void decrire() {
	super.decrire();
	System.out.println(" la categorie : "+this.getCategorie());
}
boolean appartientPromo() {
	return true;
}
public float prixDeVente(String dateStr) {
	if(appartientPromo() && estPeriodePromo(dateStr) ) {
		return calculPrixTTC()*0.2f;
	}
	else
		return calculPrixTTC();
}
}
