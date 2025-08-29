import java.time.LocalDate;

public class Task {
    private final int id;
    private final String name;
    private final String description;
    private TaskStatus status;
    private boolean priority;
    private LocalDate deadline;

    public Task(int id, String name, String description, TaskStatus status, boolean priority, LocalDate deadline) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.deadline = deadline;
    }

}
