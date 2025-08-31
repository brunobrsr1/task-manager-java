import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PriorityTask task1 = new PriorityTask("Fazer bolo", Priority.HIGH);

        task1.complete();
        task1.show();
        task1.cancel();
        task1.show();

        TimedTask task2 = new TimedTask("Estudar matemática", 60);
        task2.show();
        task2.start();
        task2.show();

        task2.notifyUser();
        task2.setDuration(30);
        task2.notifyUser();
    }
}
