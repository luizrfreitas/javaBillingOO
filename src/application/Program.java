package application;

import model.entities.Cliente;
import model.entities.FaturaDefault;
import model.entities.Service;

public class Program {
    public static void main(String[] args)
    {
        Cliente client1 = new Cliente("Luiz Guilherme", 1);
        System.out.println(client1);

        Service service1 = new Service("Medical Service", 100.0, 10.0);
        Service service2 = new Service("Technical Service", 200.0, 10.0);
        Service service3 = new Service("Cafeteria", 300.0, 10.0);
        System.out.println(service1);
        System.out.println(service2);
        System.out.println(service3);

        FaturaDefault fatura1 = new FaturaDefault(client1);
        fatura1.addService(service1);
        fatura1.addService(service2);
        fatura1.addService(service3);

        System.out.println(fatura1.getServices());


        System.out.println(fatura1.calculateBill());


    }
}
