package lab06;
public class Point {
    public double x,y;
    public Point() { //zadeklarowanie poczatkowych wartosci
        this.x = 0.0;
        this.y = 0.0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;}
    public void setX(double x) {
        this.x = x;}
    public double getY() {
        return y;}
    public void setY(double y) {
        this.y = y;}
    public void zeruj(){
        x = 0.0;
        y = 0.0;
    }
    public void opis(){
        System.out.println("point [x: " + x + ", y: " + y + "]");
    }
    public void przesun(double x, double y){
        this.x += x;
        this.y += y; //dodanie przekazanego parametru
    }
}