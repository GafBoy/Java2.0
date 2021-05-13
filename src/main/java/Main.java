public class Main {
    public static void main(String[] args) {
        Candy candy = new Candy();
        candy.setName("Конфеты");
        candy.setWeight(2);
        candy.setPrice(20);
        candy.setTaste("Горький");

        Jellybean jellybean = new Jellybean();
        jellybean.setName("Мармеладки");
        jellybean.setWeight(1);
        jellybean.setPrice(25);
        jellybean.setOld("Срок годности: два месяца");

        Snikers snikers = new Snikers();
        snikers.setName("Сникерс");
        snikers.setWeight(1);
        snikers.setPrice(55);
        snikers.setSize("Кинг");

        Twix twix = new Twix();
        twix.setName("Твикс");
        twix.setWeight(2);
        twix.setPrice(60);
        twix.setSticks(2);

        Presents present = new Presents();
        present.addSweets(candy);
        present.addSweets(jellybean);
        present.addSweets(snikers);
        present.addSweets(twix);

        present.printAllInfo();
    }
    
}
