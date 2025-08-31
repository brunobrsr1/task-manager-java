public class PriorityTask extends Task{
    private Priority priority;

    // Constructor
    public PriorityTask(String name, Priority priority) {
        super(name);
        this.priority = priority;
    }

    // Getter & Setter
    public Priority getPriority() { return priority; }

    public void setPriority(Priority priority) { this.priority = priority; }

    @Override
    public void show() {
        System.out.println("Task: " + getName() + " [" + getStatus() + "]: " + getPriority());
    }
}
