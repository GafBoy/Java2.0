public class Twix extends Sweets{
    public void setSticks(Integer sticks) {
        this.sticks = sticks;
    }

    private Integer sticks;
    @Override
    public void printInfo() {
        System.out.println("Это " + this.name + " весом: "+ this.weight + "кг по цене: "+ this.price + " руб. " + "Кол-во палочек: " + sticks);
    }

    public Twix(String name, Integer weight, Integer price, Integer sticks) {
        super(name, weight, price);
        this.sticks = sticks;
    }
}
