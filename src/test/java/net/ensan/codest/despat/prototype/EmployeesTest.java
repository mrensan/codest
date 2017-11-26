package net.ensan.codest.despat.prototype;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeesTest {
    @Test
    public void prototypePatternTest() throws Exception {
        Employees emps = new Employees();
        emps.loadData();

        // Use the clone method to get the Employees object
        Employees empsNew = (Employees) emps.clone();

        assertEquals(emps.getEmpList().size(), empsNew.getEmpList().size());
        for (int i = 0 ; i < emps.getEmpList().size() ; i++) {
            assertEquals(emps.getEmpList().get(i), empsNew.getEmpList().get(i));
        }
    }
}