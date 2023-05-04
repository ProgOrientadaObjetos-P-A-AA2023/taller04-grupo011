package paquetedos;

public class Cheque {

    private String nombreC;
    private String nombreB;
    private double valorCh;
    private double comision;

    public Cheque(String nC) {
        nombreC = nC;
    }

    public Cheque(String nC, String nB, double vCh) {
        nombreC = nC;
        nombreB = nB;
        valorCh = vCh;
    }
    // 

    public void establecerNombreC(String nC) {
        nombreC = nC;
    }

    public void establecerNombreB(String nB) {
        nombreB = nB;
    }

    public void establecerValorCh(double vCh) {
        valorCh = vCh;
    }

    public void calcularComision() {
        comision = valorCh * 0.00003;
    }

    // Obtener
    public String obtenerNombreC() {
        return nombreC;
    }

    public String obtenertNombreB() {
        return nombreB;
    }

    public double obtenerValorCh() {
        return valorCh;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {

        String cadena = String.format("Nombre: %s\nNombre del Banco: %s\nValor del cheque: %.2f\n"
                + "Comision: %.2f\n", nombreC,
                nombreB,
                valorCh,
                comision);

        return cadena;
    }
}
