package Task_1;

public class SluchawkiPrzewodowe extends Sluchawki {
    private int glugoscKabla;

    public SluchawkiPrzewodowe(String nazwa, String marka, int liczbaDecybeli, int glugoscKabla) {
        super(nazwa, marka, liczbaDecybeli);
        this.glugoscKabla = glugoscKabla;
    }

    public int getGlugoscKabla() {
        return glugoscKabla;
    }

    public void setGlugoscKabla(int glugoscKabla) {
        this.glugoscKabla = glugoscKabla;
    }


    @Override
    String wyswietlInfo() {
        return super.toString() + " dlugoscKabla: " + glugoscKabla + " m";
    }

}
