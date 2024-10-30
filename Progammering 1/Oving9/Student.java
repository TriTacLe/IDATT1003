import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    private String name; 
    private int totalTask;
    private int totalStud;
    //private ArrayList<String> name;

    //konstruktør
    public Student(String name){
        this.name = name;
        //this.name = new ArrayList<>();
        this.totalTask = 0;
    }
    
    public Student(String name, int totalTask){
        //this.name = new ArrayList<>();
        this.name = name;
        this.totalTask = totalTask;
    }

    //metoder
    /*
    public ArrayList<String> getName(){
        return name;
    }
     */
    
    public String getName(){
        return name;
    }
    
    public int getTotalTask() {
        return totalTask;
    }
    
    public void setTotalTask(int increase){
        totalTask += increase;
    }

    @Override
    public String toString(){
        return "Name: " + name + ". total task done: " + totalTask;
    }

}