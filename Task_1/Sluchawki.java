package Task_1;

abstract class Sluchawki {
    private final String nazwa;
    private final String marka;
    private final int liczbaDecybeli;

    public Sluchawki(String nazwa, String marka, int liczbaDecybeli) {
        this.nazwa = nazwa;
        this.marka = marka;
        this.liczbaDecybeli = liczbaDecybeli;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getMarka() {
        return marka;
    }

    public int getLiczbaDecybeli() {
        return liczbaDecybeli;
    }

    @Override
    public String toString() {
        return "Sluchawki{" +
                "nazwa='" + nazwa + '\'' +
                ", marka='" + marka + '\'' +
                ", liczbaDecybeli=" + liczbaDecybeli;
    }

    abstract String wyswietlInfo();

    public boolean czyBezprzywodowa(Sluchawki sluchawki) {
        return this instanceof SluchawkiBezprzewodowe;
    }
}
