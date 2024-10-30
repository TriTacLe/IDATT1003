package scr;
import java.util.ArrayList; // import the ArrayList class

public class TaskOverview {
    private int totalStud = 0;
    private ArrayList<Student> students;


    public TaskOverview(){
        this.students = new ArrayList<>();
    }

    //metoder
    public int getTotalStud(){
        return totalStud;
    }
    
    public void registerNewStudent(Student student) {
        for (Student existingStudent : students) {
            if (existingStudent.getName().equals(student.getName())){
                throw new IllegalArgumentException("Studenten already exist.");
            } 
        }
        students.add(student);
        totalStud++;
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
