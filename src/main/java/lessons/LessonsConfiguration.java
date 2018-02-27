package lessons;


import lessons.services.GreetingService;
import lessons.services.GreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
public class LessonsConfiguration {

    @Bean(name = "name")
    @Description("just description")
    GreetingService greetingService() {
        return new GreetingServiceImpl();
    }
}
