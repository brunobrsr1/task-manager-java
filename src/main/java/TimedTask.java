public class TimedTask extends Task implements Notifiable {
    private int duration;

    // Constructor
    public TimedTask(String name, int duration) {
        super(name);
        this.duration = duration;
    }

    // Getter and Setter
    public int getDuration() { return duration; }

    public void setDuration(int duration) { this.duration = duration; }

    @Override
    public void notifyUser() {
        System.out.println("Reminder: " + getName() + " is due in " + getDuration() + " minutes!");
    }

    @Override
    public void show() {
        System.out.println("Task: " + getName() + " [" + getStatus() + "] (Timed " + getDuration() + "mins)");
    }
}
