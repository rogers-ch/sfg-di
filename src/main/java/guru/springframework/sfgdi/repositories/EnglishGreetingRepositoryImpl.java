package guru.springframework.sfgdi.repositories;

/**
 * Created by cr on 05/13/2021
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
