package model.entities;

import java.sql.Array;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import java.time.LocalDate;
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

    @Override
    public String displayBill () {

        StringBuilder multilineBuilder = new StringBuilder();

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        multilineBuilder.append("Client: " + this.cliente.getClientName());
        multilineBuilder.append("\n");
        multilineBuilder.append("Contract: " + this.cliente.getClientContract());
        multilineBuilder.append("\n");
        multilineBuilder.append("Date: " + currentDate.format(dateFormat));
        multilineBuilder.append("\n");
        multilineBuilder.append("<--------- Services --------->");
        multilineBuilder.append("\n");

        for (Service service : this.services) {
            multilineBuilder.append(service.toString());
            multilineBuilder.append("\n");
        }
        multilineBuilder.append("\n");
        multilineBuilder.append("Bill :" + this.calculateBill());
        multilineBuilder.append("\n");
        multilineBuilder.append("Tax :" + this.calculateTax());

        return multilineBuilder.toString();
    }


}
