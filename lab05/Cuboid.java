package lab05;
//prostopadloscian
public class Cuboid {
    double a,b,h,area,vol;

    public void setA(double c) {
        this.a = c;
    }
    public void setB(double d) {
        this.b = d;
    }
    public void setH(double e){
        this.h = e;
    }
    public void AreaCub(){
        area = 4 * (b*h) + 2 * (a*b);
    }
    public void VolumeCuboid(){
        vol = a * h * b;
    }
    public void WriteOutCubd(){
        System.out.println("area: " + area + " volume: " + vol + "\n");
    }
}
