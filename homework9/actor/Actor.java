package actor;

public class Actor {
    private String name;

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void act() {
        System.out.println("배우 " + name + "은 연기합니다.");
    }
}
