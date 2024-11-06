
public class test {
    public static void main(String[] args) {
        /*
        String [] types = {"Forrett, Dessert, Hovedrett"};
        Random random = new Random();
        int randomIndex = random.nextInt(types.length);
        String randomTypes = types[randomIndex];
        */
        Restaurant restaurant = new Restaurant();
        MenuRegister menu1 = new MenuRegister("Bulk");

        Dish pasta = new Dish("Pasta","Hovedrett" , 149, "Paste, Oil, Garlic, Chicken");
        Dish FriedChicken = new Dish("Fried Chicken", "Hovedrett", 129, "Chicken, Wheate, Cornflower, Oil");
        
        menu1.registerNewDish(pasta);
        menu1.registerNewDish(FriedChicken);
        menu1.findDish(pasta);
        menu1.findDishByType("Hovedrett");

        restaurant.registerNewMenu(menu1);

        menu1.setPrice();
    }
}