package lab05;
public class Square {
    double a, area, circut;

    public void setA(double b) {
        this.a = b;
    }

    public void Area_squ() {area = a * a; }
    public void Circut_squ(){
        circut = 4 * a;
    }
    public void WriteOut_squ(){
        System.out.println("area: " + area + " circut: " + circut + "\n");
    }
}
