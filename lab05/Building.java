package lab05;
import java.time.LocalDate;
public class Building {
    String buld_name;
    int buld_year, buld_floors;
    public void setBuld_name(String name){
        this.buld_name = name;
    }
    public void setBuld_year(int year){
        this.buld_year = year;
    }
    public void setBuld_floors(int floors){
        this.buld_floors = floors;
    }
    public void WriteOutBuld(){
        System.out.println("\nname: " + buld_name + " year: " + buld_year + " floors: " + buld_floors);
    }

    public void YearCalc(){
        LocalDate date = LocalDate.now(); //uzyskanie aktualnej daty z systemu
        int year_now = date.getYear();
        int years = year_now - buld_year;
        System.out.println("building is " + years + " years old");
    }
}
