public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int appetite) {
        if (!coundFood(appetite)) {
            System.out.println(" Недостаточно еды!");
        } else {
            food -= appetite; }
    }
    public boolean coundFood(int appetite){
        return appetite <= food;
    }
    public void addFood(int addFood){
        food += addFood;
    }
    public void info(){
        System.out.println("plate: " + food);
    }
}
