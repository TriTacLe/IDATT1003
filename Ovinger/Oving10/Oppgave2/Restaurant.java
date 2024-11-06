import java.util.ArrayList;

public class Restaurant {
    private ArrayList<MenuRegister> menus;

    public Restaurant(){
        this.menus = new ArrayList<>();
    }

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

    public void findMenuByPrice(double int1, double int2){
        
    }



}
