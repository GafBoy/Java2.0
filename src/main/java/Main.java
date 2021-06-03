public class Main {
    public static void main(String[] args) {
        Candy candy = new Candy("Конфеты", 2, 20, "Горький");

        Jellybean jellybean = new Jellybean("Мармеладки", 1, 25, "Срок годности: два месяца");

        Snikers snikers = new Snikers("Сникерс", 1, 55, "Кинг");

        Twix twix = new Twix("Твикс", 2, 60, 2);

        Presents present = new Presents();
        present.addSweets(candy);
        present.addSweets(jellybean);
        present.addSweets(snikers);
        present.addSweets(twix);

        present.printAllInfo();
    }
    
}
