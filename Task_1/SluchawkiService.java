package Task_1;

public class SluchawkiService {
    private static Sluchawki[] sluchawki;
    Sluchawki[] sluchawkis;

    public SluchawkiService(Sluchawki[] sluchawkis) {
        this.sluchawkis = sluchawkis;
    }

    public void wyswietlSluchawkiPrzewodowe(Sluchawki[] sluchawkis) {
        System.out.println("Sluchawki Przewodowe");
        for (Sluchawki sluchawki : sluchawkis) {
            if (sluchawki instanceof SluchawkiPrzewodowe) {
                System.out.println(sluchawki.wyswietlInfo());
            }
        }
    }

    public int ileBezprzewodowych() {
        int licznik = 0;
        for (Sluchawki sluchawki : sluchawki) {
            if (sluchawki instanceof SluchawkiBezprzewodowe) {
                licznik++;
            }
        }
        return licznik;
    }
}
