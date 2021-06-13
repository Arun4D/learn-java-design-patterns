package in.co.ad.java.designpatterns.abstractfactory;

import lombok.extern.java.Log;

@Log
public class Application {
    public static void main(String[] args) {
        AbstractFactory animalAbstractFactory = FactoryProvider.getFactory("Animal");
        Animal animal = (Animal) animalAbstractFactory.create("Dog");
        log.info("Animal Name: "+ animal.getAnimal() + ", Make Sound: " + animal.makeSound());

        AbstractFactory colorAbstractFactory = FactoryProvider.getFactory("Color");
        Color color = (Color) colorAbstractFactory.create("white");
        log.info("Color : "+ color.getColor());
    }
}
