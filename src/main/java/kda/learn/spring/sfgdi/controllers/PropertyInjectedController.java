package kda.learn.spring.sfgdi.controllers;

import kda.learn.spring.sfgdi.services.GreetingServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PropertyInjectedController {

    @Autowired
    public GreetingServce greetingServce;

    public String getGreeting() {
        return greetingServce.sayGreeting();
    }
}
