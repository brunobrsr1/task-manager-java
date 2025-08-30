import java.time.LocalDate;

public class TimedTask extends Task {
    private int duration;

    // Constructor
    public TimedTask(int id, String name, TaskStatus status, LocalDate deadline, int duration) {
        super(id, name, status, deadline);
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
