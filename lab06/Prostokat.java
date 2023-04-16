package lab06;

public class Prostokat {
    double wys, szer;

    public Prostokat() {
        this.wys = 0;
        this.szer = 0;
    }
    public Prostokat(double x, double y){
        this.wys = x;
        this.szer = y;
    }
    public double getWys() {
        return wys;
    }
    public void setWys(double wys) {
        this.wys = wys;
    }
    public double getSzer() {
        return szer;
    }
    public void setSzer(double szer) {
        this.szer = szer;
    }
    double getPowierzchnia() {
        return (szer * wys);
    }
}
