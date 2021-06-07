public class Plate {
    private int food;

    public Plate (int food) {
        this.food = food;
    }


    boolean decreaseFood (int n) {
        int foodInPlate = food - n;
        if (foodInPlate < 0) return false;
        food -= n;
        return true;
    }

    public void info () {
        System.out.println("plate: " + food);
    }
}






