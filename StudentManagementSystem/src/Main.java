import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List student= new ArrayList();
        Student st = new Student();
        List marks = new ArrayList();
        marks.add(80);
        marks.add(40);
        marks.add(50);
        st.marks=marks;
        st.name="Shwetant";
        st.rollNo=1;
        student.add(st);
        Iterator it = student.iterator();
        System.out.println(student);
        while(it.hasNext())
        {
           Student s = (Student) it.next();
           s.setName("Xyz");
            student.set(0,s);
            System.out.println(student);
        }
    }
}
