
package paquetedos;


public class Automotor {

    private String cedDuenio;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valVehiculo;
    private double valMatricula;
    
        public Automotor(String ced){
        cedDuenio = ced;
    }
        
    public Automotor(String ced, String marca, int anioFabri, double valorV){
        cedDuenio = ced;
        marcaVehiculo = marca;
        anioFabricacion = anioFabri;
        valVehiculo = valorV;
    }
    
// Establecer de cda variable 
    public void establecerCedDuenio(String ced) {
        cedDuenio = ced;
    }

    public void establecerMarVehiculo(String marca) {
        marcaVehiculo = marca;
    }

    public void establecerAnioFabricacion(int anioFabri) {
        anioFabricacion = anioFabri;
    }
    public void establecerValorVehiculo(double valorV){
         valVehiculo = valorV;   
    }

    public void calcularValMatricula() {
       valMatricula =( 0.00002*valVehiculo)*(2023-anioFabricacion);
    }
// Obtener de cada variable
    public String obtenerCedDuenio() {
        return cedDuenio;
    }

    public String obtenertMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int obtenerAnioFabricacion() {
        return anioFabricacion;
    }
  
    public double obtenerValVehiculo() {
        return valVehiculo;
    }
    public double obtenerValMatricula() {
        return valMatricula;
    }
      @Override
    public String toString(){
        
        String cadena = String.format("Cédula: %s\nMarca del Vehiculo: %s\nAño de Fabricación: %d\n"
                                                 +"Valor del Vehiculo: %.2f\nValor de la Matricula: %.2f\n", 
                                            cedDuenio, 
                                            marcaVehiculo, 
                                            anioFabricacion, 
                                            valVehiculo, 
                                            valMatricula );
        return cadena;
    }
}
