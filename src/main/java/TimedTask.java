import java.time.LocalDate;

public class TimedTask extends Task {
    private int duration;

    // Constructor
    public TimedTask(int id, String name, String description, TaskStatus status, boolean isPriority, LocalDate deadline, int duration) {
        super(id, name, description, status, isPriority, deadline);
        this.duration = duration;
    }

    // Getter
    public int getDuration() {
        return duration;
    }

    // Setter
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return super.toString() + " duration: " + this.duration;
    }
}
