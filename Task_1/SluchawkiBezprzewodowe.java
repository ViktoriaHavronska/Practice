package Task_1;

public class SluchawkiBezprzewodowe extends Sluchawki {
    private double zywotnoscBaterii;
    private double zasieg;

    public SluchawkiBezprzewodowe(String nazwa, String marka, int liczbaDecybeli, double zywotnoscBaterii, double zasieg) {
        super(nazwa, marka, liczbaDecybeli);
        this.zywotnoscBaterii = zywotnoscBaterii;
        this.zasieg = zasieg;
    }

    public double getZywotnoscBaterii() {
        return zywotnoscBaterii;
    }

    public void setZywotnoscBaterii(double zywotnoscBaterii) {
        this.zywotnoscBaterii = zywotnoscBaterii;
    }

    public double getZasieg() {
        return zasieg;
    }

    public void setZasieg(double zasieg) {
        this.zasieg = zasieg;
    }

    public double zwracaZywnoscBateri() {
        return zywotnoscBaterii / 24;
    }

    @Override
    String wyswietlInfo() {
        return super.toString() + "zywotnoscBaterii = " + zywotnoscBaterii + "Zasieg: " + zasieg + " cm" + "\n";
    }

    @Override
    public boolean czyBezprzywodowa(Sluchawki sluchawki) {
        return super.czyBezprzywodowa(sluchawki);
    }
}
