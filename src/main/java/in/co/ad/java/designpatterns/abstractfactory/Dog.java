package in.co.ad.java.designpatterns.abstractfactory;

public class Dog implements  Animal {
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "bark";
    }
}
