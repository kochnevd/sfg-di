package kda.learn.spring.sfgdi.controllers;

import kda.learn.spring.sfgdi.services.GreetingServce;

public class ConstructorInjectedController {
    private final GreetingServce greetingServce;

    public ConstructorInjectedController(GreetingServce greetingServce) {
        this.greetingServce = greetingServce;
    }

    public String getGreeting() {
        return greetingServce.sayGreeting();
    }
}
