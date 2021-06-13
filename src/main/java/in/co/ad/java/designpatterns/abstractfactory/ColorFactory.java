package in.co.ad.java.designpatterns.abstractfactory;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String type) {
        if("white".equalsIgnoreCase(type)) {
            return new White();
        }else if("black".equalsIgnoreCase(type)) {
            return new Black();
        } else if("brown".equalsIgnoreCase(type)) {
            return new Brown();
        }
        return null;
    }
}
