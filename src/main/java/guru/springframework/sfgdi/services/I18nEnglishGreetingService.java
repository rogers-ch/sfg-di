package guru.springframework.sfgdi.services;

/**
 * Created by cr on 04/23/2021
 */
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
