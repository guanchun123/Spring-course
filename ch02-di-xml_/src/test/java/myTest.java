import com.bjpowernode.ba01.School;
import com.bjpowernode.ba01.Student;
import org.junit.Test;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan(value = "com.bjpowernode.ba01")
public class myTest {
    @Test
    public void test2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ba02/applicationContext2.xml");
        Student student = (Student) applicationContext.getBean("MyStudent");
//        从容器中获取Student
        System.out.println(student);



    }






}
