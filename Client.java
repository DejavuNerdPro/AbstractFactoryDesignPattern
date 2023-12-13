public class Client {
    private AbstractFactory factory;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public void someOperation() {
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
        System.out.println("OPERATION FOR PRODUCT A");
        System.out.println("OPERATION FOR PRODUCT B");
    }
}
