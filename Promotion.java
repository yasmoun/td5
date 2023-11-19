import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public interface Promotion {
	public static final String debutPromo = "19/03/2022";
	public static final String finPromo = "19/03/2022";
	float prixDeVente(String dateStr);
	default boolean estPeriodePromo(String dateStr) {
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(dateStr, dateFormatter);
		LocalDate debutPromoDate = LocalDate.parse(debutPromo, dateFormatter);
        LocalDate finPromoDate = LocalDate.parse(finPromo, dateFormatter);
        return (date.isAfter(debutPromoDate)|| date.isEqual(debutPromoDate)) && (date.isBefore(finPromoDate)|| date.isEqual(finPromoDate));
	}
	static double calculerRemise(double prixAvantRemise, double prixApresRemise) {
		return ( prixAvantRemise - prixApresRemise) / prixAvantRemise * 100;
	}
	
}
