package pl.pingwit.classwork_6;

/**
 * @author Pavel Radkevich
 * @since 9.02.23
 */
public class Student {

    static final String groupName;

    int age;
    String name;
    String email;

    static {
        System.out.println("Hello from static!");
        System.out.println("Loading group from database...............");
        groupName = "112233";
    }

    {
        System.out.println("Some dummy logic");
    }

    public Student(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
