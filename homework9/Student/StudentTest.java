public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("홍길동", "1111");
        Student s2 = new Student("홍길동", "1111");
        if(s1.equals(s2))
            System.out.println("같은학생" + s1);
        s1.setName("홍길순");
        if(s1.equals(s2))
            System.out.println("같은학생" + s1);
    }
}
