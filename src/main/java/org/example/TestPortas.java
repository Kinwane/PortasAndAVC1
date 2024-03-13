package org.example;
import org.example.PortaAnd2;
import org.example.PortaAnd3;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPortas {
    @Test
    public void testPortaAND2() {
        PortaAnd2 porta = new PortaAnd2(true, false);
        assertEquals(false, porta.getSaida());

        porta.setEntrada(true, true);
        assertEquals(true, porta.getSaida());
    }

    @Test
    public void testPortaAND3() {
        PortaAnd3 porta = new PortaAnd3(true, false, true);
        assertEquals(false, porta.getSaida(true, false, true));

        porta = new PortaAnd3(true, true, true);
        assertEquals(true, porta.getSaida(true, true, true));
    }
}
