public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = true;
    }

    public int getAppetite () {
        return appetite;
    }

    public boolean isFull () {
        return isFull;
    }

    public void eat (Plate plate) {
        if (isFull && plate.decreaseFood(appetite))
            isFull = false;
    }

    public void info () {
        String isEmpty = !isFull ? "поел" : "голоден";
        System.out.println(name + ": " + isEmpty);
    }
}


