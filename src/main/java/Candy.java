public class Candy extends Sweets{
    public void setTaste(String taste){
        this.taste = taste;
    }

    private String taste;
    @Override
        public void printInfo(){
            System.out.println("Это " + this.name + " весом: "+ this.weight + "кг по цене: "+ this.price + " руб. " + " со вкусом: " + this.taste);
        }

    public Candy(String name, Integer weight, Integer price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }
}

