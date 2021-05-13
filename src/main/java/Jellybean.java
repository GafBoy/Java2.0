public class Jellybean extends Sweets{
    public void setOld(String old) {
        this.old = old;
    }

    private String old;
    @Override
    public void printInfo() {
        System.out.println("Это " + this.name + " весом: "+ this.weight + "кг по цене: "+ this.price + " руб. " + "Срок годности: " + old);
    }
}
