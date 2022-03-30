import com.bjpowernode.ba01.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    @Test
    public void test2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ba02/applicationContext2.xml");
        Student student = (Student) applicationContext.getBean("MyStudent");
//        从容器中获取Student
        System.out.println(student);


    }






}
