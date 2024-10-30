package scr;
import java.util.Scanner;

public class testKlient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskOverview overview = new TaskOverview();
        overview.addStudentTest();
        
        //Studenter som allerede eksisterer
        System.out.println("Student task overview");

        boolean running = true;
        
        while (running) {
            System.out.println("\nChose: ");
            System.out.println("1. Register a new student");
            System.out.println("2. Increase a student's tasks");
            System.out.println("3. View all students and tasks");
            System.out.println("4. View total number of students");
            System.out.println("5. View total task a student have done");
            System.out.println("6. Exit");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter student's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter starting task count: ");
                    String taskInput = scanner.nextLine();
                    int tasks = taskInput.isEmpty() ? 0 : Integer.parseInt(taskInput); //ny greie
                    
                    Student newStudent = new Student(name, tasks);
                    overview.registerNewStudent(newStudent);
                    System.out.println("Student registered successfully!");
                    break;
                case 2:
                    System.out.print("Enter student's name to increase tasks: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter the number of tasks to add: ");
                    int taskIncrease = scanner.nextInt();
                    scanner.nextLine(); //
                    overview.increase(studentName, taskIncrease);
                    break;
                case 3:
                    System.out.println("\nList of students and tasks:");
                    System.out.println(overview.getTableTask());
                    break;
                case 4:
                    System.out.println("Total number of students: " + overview.getTotalStud());
                    break;
                case 5:
                    System.out.print("Enter student's name to increase tasks: ");
                    studentName = scanner.nextLine();
                    System.out.println(overview.findStudent(studentName));
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Please try again.");
            }
        }
        scanner.close();
    }
}
