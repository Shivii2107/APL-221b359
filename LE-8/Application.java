// Application.java
public class Application {
    public static void main(String[] args) {
        Crow crow = new IndianCrow();
        Swan crowAdapter = new CrowAdapter(crow);
        client(crowAdapter);
    }

    public static void client(Swan swan) {
        swan.eat();
        swan.swin();
        swan.sing();
    }
}
