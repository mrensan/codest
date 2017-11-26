package net.ensan.codest.despat.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Prototype pattern is used when the Object creation is a costly
 * affair and requires a lot of time and resources and you have
 * a similar object already existing.
 *
 * <p>So this pattern provides a mechanism to copy the original object
 * to a new object and then modify it according to our needs. This pattern
 * uses java cloning to copy the object.
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public class Employees implements Cloneable {

    private List<String> empList;

    public Employees() {
        empList = new ArrayList<String>();
    }

    public Employees(List<String> list) {
        this.empList = list;
    }

    public void loadData() {
        //read all employees from database and put into the list
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lis");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getEmpList()) {
            temp.add(s);
        }
        return new Employees(temp);
    }
}
