import java.time.LocalDate;

public class PriorityTask extends Task{
    private Priority priority;

    public PriorityTask(String name, TaskStatus status, LocalDate deadline, Priority priority) {
        super(name, status, deadline);
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return super.toString() + " priority: " + this.priority;
    }
}
