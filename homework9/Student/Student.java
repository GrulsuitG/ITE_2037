import java.util.Objects;

public class Student {
    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "이름='" + name + ", 학번=" + id;
    }

    @Override
    public boolean equals(Object obj) {
        boolean ok = false;
        if(obj instanceof Student){
            Student s = (Student) obj;
            if(name.equals(s.getName()) && id.equalsIgnoreCase(s.getId()))
                ok = true;
            else
                ok = false;
        }
        return ok;
    }
    /*
    @Override
    public boolean equals(Object obj) {
        boolean ok = false;
        if(obj == null)
            return ok;
        if(getClass() == obj.getClass()){
            Student s = (Student) obj;
            if(name.equals(s.getName()) && id.equalsIgnoreCase(s.getId()))
                ok = true;
            else
                ok = false;
        }
        return ok;
    }
     */

}
