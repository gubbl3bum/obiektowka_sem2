package lab05;
public class Rectangle {
    double a,b,area, circut;
    public void setA_rec(double c) {
        this.a = c;
    }
    public void setB_rec(double c) {
        this.b = c;
    }
    public void Area_rec(){
        area = a * b;
    }
    //obwod
    public void Circut_rec(){
        circut = (2*a)+(2*b);
    }
    public void WriteOut_rec(){
        System.out.println("field: " + area + " circut: " + circut +"\n");
    }
}
