package lab10;
class Horror extends Film{
    private final String typ = "Horror";
    public Horror(int czasTrwania, String tytul, boolean czyObejrzany) {
        super(czasTrwania, tytul, czyObejrzany);
    }
    public String getTyp(){
        return typ;
    }
    public void wypiszDaneFilmu(){
        System.out.println("tytul: " + getTytul() + ", czas trwania: " + getCzasTrwania() + " min, czy obejrzany: " +
                (isCzyObejrzany() ? "tak" : "nie") + ", typ: " + getTyp());
    }
}
class Komedia extends Film{
    private final String typ = "komedia";
    public Komedia(int czasTrwania, String tytul, boolean czyObejrzany) {
        super(czasTrwania, tytul, czyObejrzany);
    }
    public String getTyp(){
        return typ;
    }
    public void wypiszDaneFilmu(){
        System.out.println("tytul: " + getTytul() + ", czas trwania: " + getCzasTrwania() + " min, czy obejrzany: " +
                (isCzyObejrzany() ? "tak" : "nie") + ", typ: " + getTyp());
    }
}