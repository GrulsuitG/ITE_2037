package actor;

public class Director {
    private Actor[] actors;
    private int num;

    public Director() {
        actors = new Actor[10];
        num = 0;
    }

    public void cast(Actor actor) {
        if (num > 10) {
            System.out.println("가득 찼습니다.");
            return;
        }
        actors[num++] = actor;
    }

    public void cast(String name) {
        if (num > 10) {
            System.out.println("가득 찼습니다.");
            return;
        }
        Actor actor = new Actor(name);
        actors[num++] = actor;
    }

    public void cast(String name, String ability) {
        if (num > 10) {
            System.out.println("가득 찼습니다.");
            return;
        }
        Actor actor = new ActionActor(name, ability);
        actors[num++] = actor;
    }

    public void direct() {
        for (int i = 0; i < actors.length; i++) {
            if(actors[i] == null) break;
            if (actors[i] instanceof ActionActor) {
                ActionActor actor = (ActionActor) actors[i];
                actor.practice();
            }
            actors[i].act();
        }
    }

    public static void main(String[] args) {
        Director d = new Director();
        Actor a = new Actor("조인성");
        Actor b = new ActionActor("장혁", "돌려차기");
        d.cast(a);
        d.cast(b);
        d.cast("장나라");
        d.cast("공효진", "발차기");

        d.direct();
    }
}
