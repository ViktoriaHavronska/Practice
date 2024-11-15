package Task_1;

public class Main {
    public static void main(String[] args) {
        SluchawkiPrzewodowe sluchawkiPrzewodowe1 = new SluchawkiPrzewodowe("Sluchawki1","Samsung",23,15);
        SluchawkiPrzewodowe sluchawkiPrzewodowe2 = new SluchawkiPrzewodowe("Sluchawki2","Samsung",17,13);

        SluchawkiBezprzewodowe sluchawkiBezprzewodowe3 = new SluchawkiBezprzewodowe("Sluchawki3","Samsung",15,15000,20);
        SluchawkiBezprzewodowe sluchawkiBezprzewodowe4 = new SluchawkiBezprzewodowe("Sluchawki4","Samsung",20,14000,25);

        Sluchawki[] sluchawki = {sluchawkiPrzewodowe1, sluchawkiPrzewodowe2, sluchawkiBezprzewodowe3,sluchawkiBezprzewodowe4 };
        SluchawkiService sluchawkiService = new SluchawkiService(sluchawki);

        System.out.println("\nInformacje o sluchawkach przewodowych:");
        sluchawkiPrzewodowe1.wyswietlInfo();
        sluchawkiPrzewodowe2.wyswietlInfo();
        sluchawkiService.wyswietlSluchawkiPrzewodowe(sluchawki);

        System.out.println("\nInformacje o sluchawkach bezprzewodowych:");
        sluchawkiBezprzewodowe3.wyswietlInfo();
        sluchawkiBezprzewodowe4.wyswietlInfo();

        System.out.println("\nLiczba sluchawek bezprzewodowych: " + sluchawkiService.ileBezprzewodowych());




    }
}
