package paquetedos;

public class Profesor {
    
    private String nombre;
    private String apellido;
    private double sueldoB;
    private double sueldoT;
    private String cedula;

    public Profesor(double sB) {
        sueldoB = sB;
    }

    public Profesor(String n, String a, double sB, String c) {
        nombre = n;
        apellido = a;
        sueldoB = sB;
        cedula = c;
    }
// Establercer de cada variable

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerSueldoB(double sB) {
        sueldoB = sB;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void calcularSueldoT() {
        sueldoT = sueldoB + (0.2 * sueldoB);
    }
// Obtener de cada variable

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoB() {
        return sueldoB;
    }

    public double obtenerSueldoT() {
        return sueldoT;
    }

    public String obtenerCedula() {
        return cedula;
    }

     @Override
    public String toString(){
        
        String cadena = String.format("Nombre: %s\nApellido: %s\nSueldo Básico: %.2f\n"
                                                 +"Sueldo Total: %.2f\nCédula: %s\n", 
                                            nombre, 
                                            apellido, 
                                            sueldoB, 
                                            sueldoT, 
                                            cedula );
        return cadena;
    }
    
}
