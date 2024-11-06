
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

        System.out.println("• Å registrere en ny rett.");
        menu1.registerNewDish(pasta);
        menu1.registerNewDish(FriedChicken);
        System.out.println("• Å finne en rett, gitt navnet.");
        menu1.findDish(pasta);
        System.out.println("• Å finne alle retter av en gitt type.");
        menu1.findDishByType("Hovedrett");
        System.out.println("• Å registrere en ny meny som består av ett sett med retter.");
        restaurant.registerNewMenu(menu1);
        System.out.println("• Å finne alle menyer med totalpris innenfor et gitt intervall.");
        restaurant.findMenuByPriceRange(100,400);

    }
}