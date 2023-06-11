package lab08;
import java.util.List;
class NieprawidlowyAdresException extends Exception{
    private List<String> nieprawidlowePola;
    public NieprawidlowyAdresException(List <String> nieprawidlowePola){
        this.nieprawidlowePola = nieprawidlowePola;
    }
    public List<String> getNieprawidlowePola(){
        return nieprawidlowePola;
    }
    public String getMessage(){
        StringBuilder sb = new StringBuilder();
        for (String pole : nieprawidlowePola) {
            sb.append(pole).append(" nie moze byc nullem\n");
        }
        return sb.toString();
    }
}
public class Adres {
    private String ulica;
    private int numerDomu;
    private String kodPocztowy;
    private String miasto;
    public void setUlica(String ulica) throws NieprawidlowyAdresException {
        if(ulica == null || ulica.isEmpty()){
            throw new NieprawidlowyAdresException(List.of("ulica "));
        }
        this.ulica = ulica;
    }
    public void setNumerDomu(int numerDomu) throws NieprawidlowyAdresException{
        if(numerDomu == 0){
            throw new NieprawidlowyAdresException(List.of("numer domu "));
        }
        this.numerDomu = numerDomu;
    }
    public void setKodPocztowy(String kodPocztowy) throws NieprawidlowyAdresException{
        if(kodPocztowy == null || kodPocztowy.isEmpty()){
            throw new NieprawidlowyAdresException(List.of("kod pocztowy "));
        }
        this.kodPocztowy = kodPocztowy;
    }
    public void setMiasto(String miasto) throws NieprawidlowyAdresException{
        if(miasto == null || miasto.isEmpty()){
            throw new NieprawidlowyAdresException(List.of("miasto"));
        }
        this.miasto = miasto;
    }
    public String getUlica() {
        return ulica;
    }
    public int getNumerDomu() {
        return numerDomu;
    }
    public String getKodPocztowy() {
        return kodPocztowy;
    }
    public String getMiasto() {
        return miasto;
    }
    }
