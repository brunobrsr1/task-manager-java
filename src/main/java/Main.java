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

        TimedTask task3 = new TimedTask("Fazer exercícios", 60);
        task3.show();
        task3.start();

        try {
            Task task = new PriorityTask("", Priority.HIGH);
        } catch (InvalidTaskException e) {
            System.out.println("Failed to create task: " + e.getMessage());
        }
    }
}
