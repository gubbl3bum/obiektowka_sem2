package lab05;
//stozek
public class Cone {
    double r,l,h,area, vol;

    public void setR(double r){
        this.r = r;
    }
    public void setL(double l){
        this.l = l;
    }
    public void setH(double h){
        this.h = h;
    }
    public void AreaCone(){
        area = (Math.PI * r * r) + Math.PI * r * l;
    }
    public void VolCone(){
        vol  = (Math.PI * r * r * h)/3;
    }
    public void WriteOutCone(){
        System.out.println("area: " + area + " volume: " + vol + "\n");
    }

}
