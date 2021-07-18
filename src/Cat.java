public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false; }
    public void eat(Plate plate) {
        if (plate.coundFood(appetite) && !satiety) {
            System.out.println(name + " Ест");
            plate.decreaseFood(appetite);
            satiety = true;
        } else if (!plate.coundFood(appetite)) {
            System.out.println("Не хватает еды для " + name);
        } else if (satiety) {
            System.out.println(name + " уже поел");
        }

    }
}
