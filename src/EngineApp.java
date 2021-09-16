public class EngineApp {
    public static void main(String[] args) {
        Engine engine1 = new Engine(5.0, 2000, 20);
        Engine engine2 = new Engine(4.0, 3000, 30);
        Engine engine3 = new Engine(5.0, 2000, 20);
        Engine engine4 = new Engine(6.0, 1500, 15);

        System.out.println(engine1.compareTo(engine2));
        System.out.println(engine1.compareTo(engine3));
        System.out.println(engine1.compareTo(engine4));
    }
}
