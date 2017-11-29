package net.ensan.codest.despat.templatemethod;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemplateMethodPatternTest {
    @Test
    public void templateMethodTest() throws Exception {
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();

        System.out.println("******************");
        houseType = new GlassHouse();
        houseType.buildHouse();
    }

}