public class Factory {
    public Product createProduct(String type) {
        if (type == null) {
            return null;
        }
        switch (type) {
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
            default:
                return null;
        }
    }
}