
public abstract class Task {
    private static int idCounter = 0;
    private final int id;
    private String name;
    private TaskStatus status;

    // Constructor
    public Task(String name) {
        this.id = idCounter++;
        this.name = name;
        this.status = TaskStatus.PENDING;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public TaskStatus getStatus() { return status; }


    public void complete() {
        this.status = TaskStatus.COMPLETED;
    }

    public void cancel() {
        this.status = TaskStatus.CANCELLED;
    }

    public void start() {
        this.status = TaskStatus.IN_PROGRESS;
    }

    public abstract void show();
}
