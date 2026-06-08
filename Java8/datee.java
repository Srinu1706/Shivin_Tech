import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class datee {
    public static void main(String[] args) {
        
        // LocalDate date = LocalDate.now();
        // LocalDateTime dt= LocalDateTime.now();
        // System.out.println(dt);
        
        LocalDate birthday =LocalDate.of(2002,06,17);
        LocalDate d =LocalDate.now();

        Period p =Period.between(birthday, d);
        System.out.println(p.getYears());
    }
}
