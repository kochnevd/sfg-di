package kda.learn.spring.sfgdi.controllers;

import kda.learn.spring.sfgdi.services.GreetingServce;

public class PropertyInjectedController {

    public GreetingServce greetingServce;

    public String getGreeting() {
        return greetingServce.sayGreeting();
    }
}
