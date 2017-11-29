package net.ensan.codest.despat.decorator;

public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.println("Adding features of Sports car.");
    }
}
