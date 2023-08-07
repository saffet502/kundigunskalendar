package hauptpaket;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vertrag {

    String vertragNummer;
    String dienstArt;
    String kündigungsDatum = "01-01-2023";
    long kündigunsFrist = 0;
    String endeDatum = "31-12-2023";
    String entscheidungsDatum = "01-01-2023";
    long festgelegteZeit = 0;


    public static LocalDate parseDate(String dateStr) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dateStr, dateFormatter);
        return date;
    }

    public LocalDate kündigungsDatumBerechnen(){
        LocalDate endDatum = parseDate(endeDatum);
        LocalDate kündigungDatum = endDatum.minusDays(kündigunsFrist);
        return kündigungDatum;
    }
    public LocalDate entscheidungsDatumBerechnen(){
        LocalDate entscheidungDatum = kündigungsDatumBerechnen().minusDays(festgelegteZeit);
        return entscheidungDatum;
    }
}
