package Creational.Factory;

public class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);

        // IF it's not follow factory

        Computer pc1 = new PC("20 GB","500 GB","2.6 GHz");
        Computer server1 = new Server("16 GB","1 TB","3.9 GHz");

        System.out.println("Factory PC Config::"+pc1);
        System.out.println("Factory Server Config::"+server1);

    }
}
