package model.entities;

public class Cliente {

    private String name;
    private int contract;

    protected static final Integer privado = 1;
    protected static final Integer publico = 2;

    public Cliente (String name, int contract) {
        this.name = name;
        this.contract = contract;
    }

    @Override
    public String toString () {
        return "Cliente: " + this.name + " Contrct: " + this.contract;
    }

}
