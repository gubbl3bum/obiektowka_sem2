package lab05;
public class Cube {
        double a, vol, area;
        public void setA(double b) {
                this.a = b;
        }
        public void Volume_cube(){
                vol = a * a * a;
        }
        public void Area_cube(){
                area = 6 * (a * a);
        }
        public void WriteOutCu(){
                System.out.println("area: " + area + " volume: " + vol + "\n");
        }
        }
