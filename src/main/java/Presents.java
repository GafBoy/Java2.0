import java.util.ArrayList;
import java.util.List;

public class Presents {
    private List<Sweets> present = new ArrayList<Sweets>();
    public void addSweets (Sweets sweets){
        this.present.add(sweets);
    }
public void printAllInfo(){
    Integer sumOfWeight = 0;
    Integer sumOfPrice = 0;
    for (int i = 0; i < this.present.size(); i++) {
        Sweets sweet = present.get(i);
        sumOfWeight += sweet.getWeight();
        sumOfPrice += sweet.getPrice();
    }
    System.out.println("Общий вес подарка: "+ sumOfWeight + " кг.");
    System.out.println("Общая цена подарка: "+ sumOfPrice + " руб.");

    System.out.println("Общая информация о подарке: ");

    for (int i = 0; i < this.present.size(); i++) {
        Sweets sweet = present.get(i);
        sweet.printInfo();
    }
    }
}
