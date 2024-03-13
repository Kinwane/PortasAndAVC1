package org.example;

public class PortaAnd2 {
    private boolean entrada1;
    private boolean entrada2;

    public PortaAnd2(boolean entrada1, boolean entrada2) {
        this.entrada1 = entrada1;
        this.entrada2 = entrada2;
    }

    public void setEntrada(boolean entrada1, boolean entrada2) {
        this.entrada1 = entrada1;
        this.entrada2 = entrada2;
    }

    public boolean getEntrada1() {
        return entrada1;
    }

    public boolean getEntrada2() {
        return entrada2;
    }

    public boolean getSaida() {
        return entrada1 && entrada2;
    }
}


