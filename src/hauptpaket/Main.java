package hauptpaket;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vertrag vertrag = new Vertrag();
        vertrag.endeDatum = "10-08-2023";
        vertrag.kündigunsFrist = 90;
        vertrag.festgelegteZeit = 30;
        vertrag.vertragNummer = "VN0012054";
        vertrag.dienstArt = "Festnet";
        LocalDate kündigungDatum = vertrag.kündigungsDatumBerechnen();
        LocalDate entscheidungDatum = vertrag.entscheidungsDatumBerechnen();
        System.out.printf("Das Kündigungsdatum Ihres Vertrags, dessen \n" +
                          "Nummer %s und im Zusammenhang mit dem %s ist, \n" +
                          "%s ist. Nach den Informationen, die wir von Ihnen \n" +
                          "erhalten haben, können Sie Ihre Entscheidung für eine \n" +
                          "Verlängerung/Nichtverlängerung ab heute(%s) treffen.\n"
                          ,vertrag.vertragNummer, vertrag.dienstArt, kündigungDatum, entscheidungDatum);

        Kündigung kündigung = new Kündigung();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Möchten Sie kündigen? Wenn Ja, drucken Sie bitte y/Y. Falls nein, egal eine Taste ");
        String antwort = scanner.nextLine();
        if(antwort.equalsIgnoreCase("y")){
            kündigung.antwort(true);
        }
        else{
            kündigung.antwort(false);
        }
    }
}
