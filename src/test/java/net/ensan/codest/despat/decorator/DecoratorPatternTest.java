package net.ensan.codest.despat.decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecoratorPatternTest {
    @Test
    public void decoratorPatternTest() throws Exception {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }

}