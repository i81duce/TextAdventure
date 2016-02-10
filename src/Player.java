import java.util.ArrayList;

/**
 * Created by KevinBozic on 2/3/16.
 */
public class Player extends Character {
    String weapon;
    String location;
    ArrayList<String> items = new ArrayList<>();


    public Player() {
        this.health = 100;
        this.damage = 40;
    }


    public void chooseName() {
        System.out.println("What is your name?");
        name = Game.nextLine();
        System.out.printf("Welcome, %s\n", name);  //souf
    }

    public void chooseWeapon() throws Exception {
        System.out.println("Choose your weapon [sword/mace]");
        weapon = Game.nextLine();

        if (weapon.equalsIgnoreCase("sword")) {
            System.out.println("A sword is a fine choice!");
        } else if (weapon.equalsIgnoreCase("mace")) {
            System.out.println("A mace is a fine choice!");
        } else {
            throw new Exception("Invalid weapon!");
        }
    }

    public void chooseLocation() throws Exception {
        System.out.println("Choose your location [forest/tunnel]");
        location = Game.nextLine();

        if (location.equalsIgnoreCase("forest")) {
            System.out.println("Entering forest...");
        } else if (location.equalsIgnoreCase("tunnel")) {
            System.out.println("Entering tunnel...");
        } else {
            throw new Exception("Invalid location.");
        }
    }

    public void findItem(String item) {
        System.out.printf("You found a %s! Pick it up? [y/n]\n", item);  //souf
        String answer = Game.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            items.add(item);
            System.out.println("You picked up an item!");
        }
    }

    public String getWeapon() {
        return weapon;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<String> getItems() {
        return items;
    }
}
