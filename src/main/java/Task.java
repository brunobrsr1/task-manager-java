import java.time.LocalDate;

public class Task implements Notifiable{
    private static int idCounter = 0;
    private final int id;
    private final String name;
    private TaskStatus status;
    private LocalDate deadline;

    // Constructor
    public Task(String name, TaskStatus status, LocalDate deadline) {
        this.id = idCounter++;
        this.name = name;
        this.status = status;
        this.deadline = deadline;
    }

    public Task(String name, LocalDate deadline) {
        this.id = idCounter++;
        this.name = name;
        this.deadline = deadline;
    }

    // Getters
    public int getId(){
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public TaskStatus getStatus() {
        return this.status;
    }

    public LocalDate getDeadline() {
        return this.deadline;
    }

    // Setters
    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public void notifyUser() {
        System.out.println("Reminder: Task: " +this.name + "  is due at " + this.deadline);
    }

    @Override
    public String toString() {
        return "Task ID: " + this.id + " Name: " + this.name + " Status: " + this.status + " Deadline: " + this.deadline;
    }
}
