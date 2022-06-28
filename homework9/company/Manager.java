public class Manager extends Employee{
    private String dept;

    public Manager(String name, String idnum, String dept) {
        super(name, idnum);
        this.dept = dept;
    }

    public void work() {
        System.out.println("Manager \"" + name +"\" works hard with his subordinates in " + dept + " dept.");
    }
}
