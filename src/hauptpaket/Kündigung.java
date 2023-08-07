package hauptpaket;

public class Kündigung {
    private boolean isKündigungOk = true;
    private String kündigungsText;

    public boolean isKündigungOk() {
        return isKündigungOk;
    }
    public void setKündigungOk(boolean kündigungOk) {
        isKündigungOk = kündigungOk;
    }
    public String getKündigungsText() {
        return kündigungsText;
    }
    public void setKündigungsText(String kündigungsText) {
        this.kündigungsText = kündigungsText;
    }
    public void antwort(boolean isKündigungOk) {
        this.isKündigungOk = isKündigungOk;
        if (isKündigungOk == true) {
            System.out.println(textDrucken());
        }
        else{
            System.out.println("Wegen der Weiter Entscheidung braucht man keinen Kündigunstext");
        }
    }
    public String textDrucken(){
        return "hiermit kündige ich meinen oben genannten Vertrag fristgerecht zum nächstmöglichen Zeitpunkt.\n" +
                "Bitte senden Sie mir eine schriftliche Bestätigung der Kündigung unter Angabe des Beendigungszeit-\n" +
                "punktes zu. Nach Erhalt meiner Kündigung dürfen Sie mich nicht mehr für Werbezwecke kontaktieren. \n" +
                "Etwas anderes gilt nur dann, wenn ich Sie ausdrücklich dazu ermächtige.\n";
    }
}
