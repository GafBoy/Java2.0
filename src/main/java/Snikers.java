public class Snikers extends Sweets{
    public void setSize(String size) {
        this.size = size;
    }

    private String size;
    @Override
    public void printInfo() {
        System.out.println("Это " + this.name + " весом: "+ this.weight + "кг по цене: "+ this.price + " руб. "+ "Размер: " + size);
    }
}
