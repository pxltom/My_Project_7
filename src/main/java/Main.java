public class Main {

    public static void main (String[] args) {
        Cat[] cats = {new Cat("Марсик", 150), new Cat("Рыжик", 100),
                new Cat("Пушок", 30)};
        Plate plate = new Plate(50);
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();

        }
    }
}





