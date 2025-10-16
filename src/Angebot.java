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

    public double getRegulärpreis() {
        return regulärpreis;
    }

    public void setRegulärpreis(double regulärpreis) {
        this.regulärpreis = regulärpreis;
    }

    public GregorianCalendar getFlugdatum() {
        return flugdatum;
    }

    public void setFlugdatum(GregorianCalendar flugdatum) {
        this.flugdatum = flugdatum;
    }

    public String getFlugnummer() {
        return flugnummer;
    }

    public void setFlugnummer(String flugnummer) {
        this.flugnummer = flugnummer;
    }
}
