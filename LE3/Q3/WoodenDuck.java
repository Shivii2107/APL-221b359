public class WoodenDuck extends Duck {
    public WoodenDuck() {
        super(new CannotFly(), new MuteQuack());
    }

    @Override
    void display() {
        System.out.println("I'm a Wooden Duck.");
    }
}
