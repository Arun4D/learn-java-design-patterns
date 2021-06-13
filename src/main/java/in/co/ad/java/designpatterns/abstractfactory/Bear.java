package in.co.ad.java.designpatterns.abstractfactory;

public class Bear implements Animal{
    @Override
    public String getAnimal() {
        return "Bear";
    }

    @Override
    public String makeSound() {
        return "moans";
    }
}
