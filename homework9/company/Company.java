public class Company {
    private Employee[] employees;

    public Company() {
        employees = new Employee[4];
        employees[0] = new Manager("Choi Jong Myung", "F99847", "Finance");
        employees[1] = new Manager("Kim Young Chul", "F99832", "Develop");
        employees[2] = new Employee("park", "F99792");
        employees[3] = new Employee("lee", "F94732");
    }

    public void makeMoney() {
        for (int i = 0; i < employees.length; i++) {
            employees[i].work();
        }
    }

    public static void main(String[] args) {
        Company mycom = new Company();
        mycom.makeMoney();
    }
}
