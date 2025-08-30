import java.time.LocalDate;

public class Task {
    private final int id;
    private final String name;
    private TaskStatus status;
    private LocalDate deadline;

    // Constructor
    public Task(int id, String name, TaskStatus status, LocalDate deadline) {
        this.id = id;
        this.name = name;
        this.status = status;
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

    @Override
    public String toString() {
        return "Task ID: " + this.id + " Name: " + this.name + " Status: " + this.status + " Deadline: " + this.deadline;
    }
}
