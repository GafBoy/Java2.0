public abstract class Sweets {
    protected String name;
    protected Integer weight;
    protected Integer price;
    public abstract void printInfo();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getPrice() {
        return price;
    }

    public Sweets(String name, Integer weight, Integer price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


}
