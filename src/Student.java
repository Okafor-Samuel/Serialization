import java.io.Serializable;

public class Student implements Serializable {
    int rollNumber;
    String name;
    String department;

    public Student(){}

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
