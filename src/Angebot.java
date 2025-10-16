import java.util.GregorianCalendar;

public class Angebot {

    private double regulärpreis;
    private GregorianCalendar flugdatum;
    private String flugnummer;

    public Angebot(double regulärpreis, GregorianCalendar flugdatum, String flugnummer) {
        this.regulärpreis = regulärpreis;
        this.flugdatum = flugdatum;
        this.flugnummer = flugnummer;
    }


}
