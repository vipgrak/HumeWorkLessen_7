public class Lessen_7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat ("Нюша", 15),
                new Cat ("Барсик", 5),
                new Cat ("Тузик", 8)};
        Plate plate = new Plate(20);
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        plate.addFood(40);
        for (Cat cat : cats) {
            cat.eat(plate);

        }
    }
}