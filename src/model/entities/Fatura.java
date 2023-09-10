package model.entities;

public interface Fatura {
    Double calculateTax();
    Double calculateBill();
    String displayBill();
}
