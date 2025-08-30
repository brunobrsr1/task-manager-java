import java.time.LocalDate;

public class Task {
    private final int id;
    private final String name;
    private final String description;
    private TaskStatus status;
    private boolean isPriority;
    private LocalDate deadline;

    // Constructor
    public Task(int id, String name, String description, TaskStatus status, boolean isPriority, LocalDate deadline) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.isPriority = isPriority;
        this.deadline = deadline;
    }

    // Getters
    public int getId(){
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public TaskStatus getStatus() {
        return this.status;
    }

    public boolean isPriority() {
        return this.isPriority;
    }

    public LocalDate getDeadline() {
        return this.deadline;
    }


    // Setters
    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public void setPriority(boolean isPriority) {
        this.isPriority = isPriority;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }


}
