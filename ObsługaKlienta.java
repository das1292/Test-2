import java.util.ArrayList;

public class ObsługaKlienta {

    static double procentRabatu;
    private ArrayList<Klient> klienci;

    public static void setZakupy(){
        ObsługaKlienta.procentRabatu =0.05;
    }
    public static double getProcentRabatu(){
        return procentRabatu;
    }
}
