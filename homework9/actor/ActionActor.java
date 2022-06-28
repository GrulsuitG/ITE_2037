package actor;

public class ActionActor extends Actor{
    private String ability;

    public ActionActor(String name, String ability) {
        super(name);
        this.ability = ability;
    }

    public void practice() {
        System.out.println("액션배우 " + getName() + "은 " + ability + "를 연습합니다.");
    }

    public void act() {
        System.out.println("액션배우 " + getName() +"은 액션 연기합니다.");
    }
}
