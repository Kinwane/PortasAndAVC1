package org.example;
// Porta AND com três entradas
public class PortaAnd3 {

        private PortaAnd2 porta2;
        private boolean entrada3;

        public PortaAnd3(boolean entrada1, boolean entrada2, boolean entrada3) {
            porta2 = new PortaAnd2(entrada1, entrada2);
            this.entrada3 = entrada3;
        }

        public boolean getSaida(boolean entrada1, boolean entrada2, boolean entrada3) {
            porta2.setEntrada(entrada1, entrada2);
            return porta2.getSaida() && entrada3;
        }
}
