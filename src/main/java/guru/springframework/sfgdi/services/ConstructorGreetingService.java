package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by cr on 04/23/2021
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
