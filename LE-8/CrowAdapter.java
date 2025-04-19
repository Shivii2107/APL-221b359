// CrowAdapter.java
public class CrowAdapter implements Swan {
    private Crow crow;

    public CrowAdapter(Crow crow) {
        this.crow = crow;
    }

    public void sing() {
        crow.cry();
    }

    public void swin() {
        crow.fly();
    }

    public void eat() {
        crow.eat();
    }
}
