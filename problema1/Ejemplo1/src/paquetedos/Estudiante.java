
package paquetedos;

public class Estudiante {
     private String nombreEstudiante;
    private double materiaUno;
    private double materiaDos;
    private double materiaTres;
    private double promedioCalificaciones;    
    
    public Estudiante(){
     nombreEstudiante= "Juan Carlos Alvarez Torres";
}
    public Estudiante(String nom1, double m1, double m2, double m3){
         nombreEstudiante = nom1;
         materiaUno = m1;
         materiaDos = m2;
         materiaTres = m3;
    }

    
    


// Setter de cada variable
    public void establecerNombreEstudiante(String nom) {
        this.nombreEstudiante = nom;
    }
    public void establecerMateriaUno(double mUno) {
        this.materiaUno = mUno;
    }

    public void establecerMateriaDos(double mDos) {
        this.materiaDos = mDos;
    }

    public void establecerMateriaTres(double mTres) {
        this.materiaTres = mTres;
    }
        public void  calcularPromedioCalificaciones(){
      promedioCalificaciones = (materiaUno + materiaDos + materiaTres)/3;
      
    }
    
        // Obtener de cada variable
    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerMateriaUno() {
        return materiaUno;
    }

    public double obtenerMateriaDos() {
        return materiaDos;
    }

    public double obtenerMateriaTres() {
        return materiaTres;
    }
    public  double obtenerPromedioCalificaicones(){
        return promedioCalificaciones;
    }
 
    


    
    @Override
    public String toString(){
        
        String cadena = String.format("Nombre: %s\nMateria Uno: %.2f\nMateria Dos: %.2f\n"
                                                 +"Materia Tres: %.2f\nPromedio Total: %.2f\n", 
                                            nombreEstudiante, 
                                            materiaUno, 
                                            materiaDos, 
                                            materiaTres, 
                                            promedioCalificaciones );
        return cadena;
    }
    
    
    
}
