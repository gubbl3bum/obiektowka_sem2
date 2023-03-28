package lab05;
public class Square {
    double a, area, circut;
    public void AreaSq(){
        area = a * a;
    }
    public void CircutSq(){
        circut = 4 * a;
    }
    public void WriteOutSq(){
        System.out.println("----------SQUARE----------\narea: " + area + " circut: " + circut);
    }
}
