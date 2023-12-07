// Fig. 10.13: Empleado.java
// La superclase abstracta Empleado que implementa a PorPagar.

public abstract class Empleado2 implements PorPagar {
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial; 

    // constructor
    public Empleado2(String primerNombre, String apellidoPaterno, 
    String numeroSeguroSocial){

    this.primerNombre = primerNombre;
    this.apellidoPaterno = apellidoPaterno;
    this.numeroSeguroSocial = numeroSeguroSocial;

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

    // devuelve representación String de un objeto Empleado
    @Override
    public String toString(){
        return String.format("%s %s%nnumero de seguro social: %s",
        obtenerPrimerNombre(), obtenerApellidoPaterno(),     obtenerNumeroSeguroSocial());
    }   
    // Nota: Aquí no implementamos el método obtenerMontoPago de PorPagar, así que
    // esta clase debe declararse como abstract para evitar un error de compilación.

    public Fecha obtenerFechaNacimiento() {
        return null;
    }
}
