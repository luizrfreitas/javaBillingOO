package model.entities;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import model.entities.Service;
import model.entities.Fatura;


public class FaturaDefault implements Fatura {

    private final Cliente cliente;
    private List<Service> services;
    public FaturaDefault (Cliente cliente, List<Service> services) {
        this.cliente = cliente;
        this.services = services;
    }

    public FaturaDefault (Cliente cliente) {
        this.cliente = cliente;
        this.services = new ArrayList<Service>();
    }

    public void addService (Service service) {
        this.services.add(service);
    }

    public List<Service> getServices () {
        return this.services;
    }

    public Cliente getCliente () {
        return this.cliente;
    }

    @Override
    public Double calculateTax () {
        return 1.0;
    }

    @Override
    public Double calculateBill () {
        Double sumValue = 0.0;
        for (Service service : this.services) {
            sumValue += service.getValue();
        }
        return sumValue;
    }


}
