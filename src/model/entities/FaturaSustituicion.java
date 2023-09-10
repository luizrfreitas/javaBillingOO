package model.entities;

import java.util.ArrayList;
import java.util.List;
import model.entities.Service;
import model.entities.Fatura;


public class FaturaSustituicion implements Fatura {

    private Cliente cliente;
    private List<Service> services;

    public FaturaSustituicion () {}

    @Override
    public Double calculateTax () {
        return 1.0;
    }

    @Override
    public Double calculateBill () {
        return 1.0;
    }

    @Override
    public String displayBill () {
        return "a";
    }


}
