package lab05;
//kolo
public class Circle {
    double r, area;

    public void AreaC(){
        area = Math.PI * r * r;
    }
    public void WriteOutC(){
        System.out.println("----------CIRCLE----------\narea: " + area);
    }
}
