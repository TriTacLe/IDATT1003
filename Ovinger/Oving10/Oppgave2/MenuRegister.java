import java.util.*;

public class MenuRegister {
    //private ArrayList<Dish> dishes;
    private HashMap<String, Dish> dishes;
    private String name;

    public MenuRegister(String name){
        //this.dishes = new ArrayList<>();
        this.dishes = new HashMap<>();
        this.name = name;
    }   
    public String getName(){
        return name;
    }

    /**
     * add new dish object to the arraylist if only it doesnt exist (its name dont exist)
     * @param dish
     */
    public void registerNewDish(Dish dish){
        if (dishes.containsKey(dish.getName())){
            return;
        }
        /*
        for (Dish d : dishes){
            if (d.getName().equals(dish.getName())){
                return;
            }
        }
        */
        dishes.put(dish.getName(), dish);
        System.out.println("Registered new dish: " + dish.getName());
    }

    /**
     * @param dish
     */
    public void findDish(Dish dish){
        if (dish == null || dish.getName() == null){
            System.out.println("Dish cannot be null");
            return;
        }
        if (dishes.containsKey(dish.getName())){
            System.out.println("Found dish: " + dish.getName());
            System.out.println("- " + dish);
        } else {
            System.out.println("Dish does not exist");
        }
    }

    /**
     * Gets all the dish with the arguemtn type 
     * @param dish.getType
     */
    public void findDishByType(String type){
        ArrayList<Dish> dishesByType = new ArrayList<>(); 
        if (type == null){
            System.out.println("Must enter a type");
            return;
        }
        for (Dish d : dishes.values()){
            if (d.getType().equals(type)) {
                dishesByType.add(d);
            }   
        }
        if (dishesByType.isEmpty()){
            System.out.println("No dishes of this type: " + type);
        } else {
            System.out.println("All dishes of type: " + type);
            for (Dish dish : dishesByType){
                System.out.println("- "+ dish);
            }
        }
    }

    /***
     *
     * @return
     */
    public double getPrice(){
        double price = 0;
        for (Dish dish : dishes.values()){
            double dishPrice = dish.getPrice();
            price += dishPrice;
        }
        return price;    }

    @Override
    public String toString() {
        return "Name: " + name + ". Dishes: " + dishes;
    }
}
