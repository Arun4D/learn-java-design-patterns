package in.co.ad.java.designpatterns.abstractfactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String type) {
        if("Animal".equalsIgnoreCase(type)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase(type)){
            return new ColorFactory();
        }

        return null;
    }
}
