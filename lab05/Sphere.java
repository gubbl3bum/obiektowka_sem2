package lab05;
public class Sphere {
    double r, area, vol;
    public void setR(double r) {
        this.r = r;
    }
    public void AreaSph(){
        area = 4 * Math.PI * r * r;
    }
    public void VolSph(){
        vol = (4/3) * Math.PI * r * r * r;
    }
    public void WriteOutSph(){
        System.out.println("area: " + area + " volume: " + vol + "\n");
    }
}
