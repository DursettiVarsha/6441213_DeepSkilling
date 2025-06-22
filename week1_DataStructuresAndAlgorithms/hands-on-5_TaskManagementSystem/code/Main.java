public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task t1 = new Task(1, "Design UI", "Pending");
        Task t2 = new Task(2, "Implement Backend", "In Progress");
        Task t3 = new Task(3, "Write Tests", "Not Started");

        manager.addTask(t1);
        manager.addTask(t2);
        manager.addTask(t3);

        manager.listTasks();

        System.out.println("\nSearching for Task ID 2:");
        Task found = manager.searchTask(2);
        System.out.println(found != null ? found : "Task not found.");

        System.out.println("\nDeleting Task ID 2:");
        manager.deleteTask(2);
        manager.listTasks();
    }
}
