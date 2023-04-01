package lab05;
//kolo
public class Circle {
    double r, area;
    public void setR(double c){
        this.r = c;
    }
    public void Area_circ(){
        area = Math.PI * r * r;
    }
    public void WriteOutC(){
        System.out.println("area: " + area + "\n");
    }
}
