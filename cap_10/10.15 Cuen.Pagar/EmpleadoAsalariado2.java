// Fig. 10.14: EmpleadoAsalariado.java
// La clase EmpleadoAsalariado que implementa la interfaz PorPagar.
// método obtenerMontoPago

public class EmpleadoAsalariado2 extends Empleado2 {
    private double salariosemanal;  
    // constructor
    public EmpleadoAsalariado2(String primerNombre, String apellidoPaterno,
    String numeroSeguroSocial, double salariosemanal){

        super(primerNombre, apellidoPaterno, numeroSeguroSocial);   
        if (salariosemanal < 0.0)
        throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");

        this.salariosemanal = salariosemanal;

    }   

    // establece el salario
    public void establecerSalarioSemanal(double salariosemanal){

        if (salariosemanal < 0.0)
        throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");
        this.salariosemanal = salariosemanal;
    }   

    // devuelve el salario
    public double obtenerSalarioSemanal(){
        return salariosemanal;
    } 
    
    // fin del método obtenerSalarioSemanal   
    // calcula los ingresos; implementa el método de la interfaz PorPagar
    // que era abstracto en la superclase Empleado
    @Override
    public double obtenerMontoPago(){
        return obtenerSalarioSemanal();
    }  

    // devuelve representación String de un objeto EmpleadoAsalariado
    @Override
    public String toString(){
        return String.format("empleado asalariado: %s%n%s: $%,.2f",
        super.toString(), "salario semanal", obtenerSalarioSemanal());
    }
}
