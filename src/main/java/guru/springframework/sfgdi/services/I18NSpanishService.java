package guru.springframework.sfgdi.services;

/**
 * Created by cr on 04/23/2021
 */
public class I18NSpanishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
