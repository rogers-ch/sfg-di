package guru.springframework.sfgdi.services;

/**
 * Created by cr on 04/23/2021
 */
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
