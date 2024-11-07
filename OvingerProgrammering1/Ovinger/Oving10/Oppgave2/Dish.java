public class Dish {
    private String name;
    private String type;
    private double price;
    private String recipe;

    /**
     * Validering av input
     */
    public Dish(String name, String type, double price, String recipe){
        if (name == null || type == null || recipe == null){
            throw new IllegalArgumentException("Arguments can not be null");
        }
        if (price<0){System.out.println("Price can not be negative");}
        this.name = name;
        this.type = type;
        this.price = price;
        this.recipe = recipe;
    }

    /**
     * Getters
     * @return attributtes
     */
    public String getName(){return name;}
    public String getType(){return type;}
    public double getPrice(){return price;}
    public String getRecipe(){return recipe;}

    /***
     *
     * @return
     */
    @Override
    public String toString() {
        return "Name: " + name + ".Type: " + type + ". Price: " + price + ". Recipe: " + recipe;
    }
    
    


}
