package scr;
import java.util.ArrayList; // import the ArrayList class
import java.util.Random;

public class TaskOverview {
    private int totalStud = 0;
    private ArrayList<Student> students;


    public TaskOverview(){
        this.students = new ArrayList<>();
    }

    //metoder
    public int getTotalStud(){
        return students.size();
    }
    
    public void registerNewStudent(Student student) {
        for (Student existingStudent : students) {
            if (existingStudent.getName().equals(student.getName())){
                throw new IllegalArgumentException("Studenten already exist.");
            } 
        }
        students.add(student);
    }

    public void addStudentTest() {
        Random rand = new Random();
        String[] possibleNames = {
            "Alice", "Bob", "Charlie", "Diana", "Ethan", "Fiona", "George", "Hannah",
            "Ivan", "Jasmine", "Kyle", "Laura", "Michael", "Nina", "Oliver", "Paula",
            "Quentin", "Rachel", "Sam", "Tina", "Uma", "Victor", "Wendy", "Xander",
            "Yara", "Zane"
        };
        
        // Add random students
        for (String name : possibleNames) {
            int randomTasks = rand.nextInt(10) + 1; // Random tasks between 1 and 10
            students.add(new Student(name, randomTasks));
        }
    }

    public ArrayList<Student> getTableTask(){
        return students;
    } 
    
    public void increase(String name, int increase){
        for (Student student : students){
            if (student.getName().equals(name)){
                student.setTotalTask(increase);
            } else {
                throw new IllegalArgumentException("Student do not exist.");
            }
        }
    }

    public Student findStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new IllegalArgumentException("Studenten finnes ikke");
    }
    
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Student student : students){
            stringBuilder.append(student.toString() + totalStud);
        }
        return stringBuilder.toString();
    }
}
