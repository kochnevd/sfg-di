package kda.learn.spring.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServceImpl implements GreetingServce {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
