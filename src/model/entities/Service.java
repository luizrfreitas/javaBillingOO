package model.entities;

public class Service {

    private String name;
    private Double value;
    private Double tax;


    public Service (String name, Double value, Double tax) {
        this.name = name;
        this.value = value;
        this.tax = tax;
    }
    public Service (String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public String getName () {
        return this.name;
    }
    public Double getValue () {
        return this.value;
    }
    public Double getTax () {
        return this.tax;
    }

    @Override
    public String toString () {
        return "Name: " + this.name + "Value: " + this.value + "Tax: " + this.tax;
    }
}
