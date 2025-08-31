import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();

        Task task1 = new Task("Fazer bolo", data);
        task1.notifyUser();
    }
}
