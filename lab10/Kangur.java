package lab10;
public class Kangur {
    private int nrKangura;
    public Kangur(int nrKangura){
        this.nrKangura = nrKangura;
    }
    public void skok(){
        System.out.println("Kangur o numerze " + nrKangura + " wykonuje skok!");
    }

    public int getNrKangura() {
        return nrKangura;
    }
}