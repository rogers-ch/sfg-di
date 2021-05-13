package guru.springframework.sfgdi.services;

/**
 * Created by cr on 04/23/2021
 */
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
