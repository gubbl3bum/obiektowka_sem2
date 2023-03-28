package lab05;
public class Cube {
        double a, vol, area;

        public void VolumeCu(){
                vol = Math.pow(3, a);
        }
        public void AreaCu(){
                area = 6 * (Math.pow(2,a));
        }
        public void WriteOutCu(){
                System.out.println("----------CUBE----------\narea: " + area + " volume: " + vol);
        }
        }
