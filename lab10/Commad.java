package lab10;
public class Commad {
    private String text;
    public Commad(String text){
        this.text = text;
    }
    public void operation(){
        System.out.println(text);
    }
}