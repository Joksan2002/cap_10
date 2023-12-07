// Fig. 10.4: Empleado.java
// La superclase abstracta Empleado.

public abstract class  Empleado {

    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    private Fecha fechaNacimiento;

    // constructor
    public Empleado(String primerNombre, String apellidoPaterno, 
    String numeroSeguroSocial, Fecha fechaNacimiento){
    this.primerNombre = primerNombre;
    this.apellidoPaterno = apellidoPaterno;
    this.numeroSeguroSocial = numeroSeguroSocial;
    this.fechaNacimiento = fechaNacimiento;
    } 

    // devuelve el primer nombre
    public String obtenerPrimerNombre(){
        return primerNombre;
    }

    // devuelve el apellido paterno
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    } 
    
    // devuelve el número de seguro social
    public String obtenerNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }

    public Fecha obtenerFechaNacimiento() {
        return fechaNacimiento;
    }

    // devuelve representación String de un objeto Empleado
    @Override
    public String toString(){
        return String.format("%s %s%nnumero de seguro social: %s%nFecha de nacimiento: %s",
        obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial(), obtenerFechaNacimiento());
    }

    // método abstracto sobrescrito por las subclases concretas
    public abstract double ingresos(); // aquí no hay implementación
    // fin de la clase abstracta Empleado    
}
