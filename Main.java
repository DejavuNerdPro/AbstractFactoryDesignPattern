public class Main {
    public static void main(String[] args) {
        // Using Concrete Factory 1
        AbstractFactory factory1 = new ConcreteFactory1();
        Client client1 = new Client(factory1);
        client1.someOperation();

        // Using Concrete Factory 2
        AbstractFactory factory2 = new ConcreteFactory2();
        Client client2 = new Client(factory2);
        client2.someOperation();
    }
}
