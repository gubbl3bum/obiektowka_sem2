package lab05;
public class Rectangle {
    double a,b,area, circut;
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double AreaR(){
        area = a * b;
        return area;
    }
    //obwod
    public double CircutR(){
        circut = (2*a)+(2*b);
        return circut;
    }
    public void WriteOutR(){
        System.out.println("----------RECTANGLE----------\nfield: " + area + " circut: " + circut);
    }
}
