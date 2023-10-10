import java.util.List;

public class Student {

    int rollNo;

    String name;
    List marks;


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getMarks() {
        return marks;
    }

    public void setMarks(List marks) {
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

}
