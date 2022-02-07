import com.learning.service.SpeakerService;
import com.learning.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
    public static void main(String args[]){
//        1. using the applicationContext.xml to set the application context
        ApplicationContext appContext= new ClassPathXmlApplicationContext("applicationContext.xml");
//        2. commented the hardcoded instance creation using new for SpeakerServiceImpl
//        SpeakerService service = new SpeakerServiceImpl();

//        3. Let's create the SpeakerService object through the xml
        SpeakerService service = appContext.getBean("speakerService",SpeakerService.class);
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
