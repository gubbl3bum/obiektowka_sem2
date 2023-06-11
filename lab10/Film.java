package lab10;
public class Film {
    private int czasTrwania;
    private String tytul;
    private boolean czyObejrzany;
    public Film(int czasTrwania, String tytul, boolean czyObejrzany){
        this.czasTrwania = czasTrwania;
        this.tytul = tytul;
        this.czyObejrzany = czyObejrzany;
    }
    public int getCzasTrwania() {
        return czasTrwania;
    }
    public String getTytul() {
        return tytul;
    }
    public boolean isCzyObejrzany() {
        return czyObejrzany;
    }
    public void setCzasTrwania(boolean czyObejrzany){
        this.czyObejrzany = czyObejrzany;
    }
}