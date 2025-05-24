import org.accessok.create.D_Builder.Student;
import org.junit.Test;

public class StudentTest {

    @Test
    public void buildStudent(){
        Student.StudentBuilder studentBuilder=new Student.StudentBuilder();
        studentBuilder.buildAge("18");
        studentBuilder.buildAddress("China");
        studentBuilder.buildNumber("110");
        studentBuilder.buildName("ascc");
        Student student=studentBuilder.build();
        System.out.println(student);
    }
}
