package kda.learn.spring.sfgdi.controllers;

import kda.learn.spring.sfgdi.services.GreetingServce;

public class SetterInjectedController {

    private GreetingServce greetingService;

    public void setGreetingService(GreetingServce greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
