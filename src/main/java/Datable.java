import java.time.LocalDate;

public interface Datable {
    default void printActualDate() {
        System.out.println(LocalDate.now());
    }
}