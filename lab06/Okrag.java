package lab06;
public class Okrag {
    public Point srodek;
    double promien;
    public Okrag() {
        srodek.x = 0.0;
        srodek.y = 0.0;
        this.promien = 0.0;
    }
    public Okrag(double x, double y, double p){
        this.srodek.x = x;
        this.srodek.y = y;
        this.promien = p;
    }
    double getPowierzchnia(){
        return Math.PI*promien*promien;
    }
    double getSrednica(){
        return 2*promien;
    }
    void setPromien(double p){
        this.promien = p;
    }
    public double getPromien() {
        return promien;
    }
    void wSrodku(Point punkcior){
        if(Math.pow(2, srodek.x - punkcior.x) + Math.pow(2,srodek.y - punkcior.y)<= Math.pow(2,promien)){
            System.out.println("punkt znajduje sie w okregu");
        }else{
            System.out.println("punkt nie znajduje sie w okregu");
        }
    }
}
