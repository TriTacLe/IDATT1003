import java.util.ArrayList;

public class Restaurant {
    private ArrayList<MenuRegister> menus;

    public Restaurant(){
        this.menus = new ArrayList<>();
    }

    /***
     *
     * @param menu
     */
    public void registerNewMenu(MenuRegister menu){
        if (menu == null){
            System.out.println("Argument cannot be null");
        }
        for (MenuRegister m : menus){
            if (menu.equals(m.getName())){
                System.out.println("Menu already exist");
                return;
            }
        }
        menus.add(menu);
        System.out.println("Menu added: " + menu);
    }

    /***
     *
     * @param int1
     * @param int2
     */
    public void findMenuByPriceRange(double int1, double int2){
        ArrayList<MenuRegister> menusPrice = new ArrayList<>();
        System.out.println("All menus within this price range: " + int1 + " and " + int2);
        for (MenuRegister menu : menus){
            if (int1 <= menu.getPrice() && menu.getPrice() <= int2){
                menusPrice.add(menu);
            }
        }
        for (MenuRegister menu : menusPrice) {
            System.out.println("- Menu: " + menu.getName() + " .Price: " + menu.getPrice());
        }

        // Optional: Print a message if no menus are found in the range
        if (menusPrice.isEmpty()) {
            System.out.println("No menus found within this price range.");
        }
    }
}
