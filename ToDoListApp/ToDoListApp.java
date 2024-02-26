import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        System.out.println("Welcome to the To-Do List Application!");

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. View Tasks");
            System.out.println("4. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available to mark as completed.");
                    } else {
                        System.out.println("Current Tasks:");
                        displayTasks(tasks);

                        System.out.print("Enter the task number to mark as completed: ");
                        int taskIndex = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        if (taskIndex >= 1 && taskIndex <= tasks.size()) {
                            tasks.remove(taskIndex - 1);
                            System.out.println("Task marked as completed!");
                        } else {
                            System.out.println("Invalid task number. Please try again.");
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("Current Tasks:");
                        displayTasks(tasks);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the To-Do List Application. Goodbye!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }

    private static void displayTasks(ArrayList<String> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}

