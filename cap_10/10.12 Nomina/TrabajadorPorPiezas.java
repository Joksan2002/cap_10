public class TrabajadorPorPiezas extends Empleado {
    private double sueldo;
    private int piezas;

    public TrabajadorPorPiezas(String primerNombre, String apellidoPaterno,
        String numeroSeguroSocial, Fecha fechaNacimiento, double sueldo, int piezas){

        super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechaNacimiento);

        if (sueldo < 0.0)
        throw new IllegalArgumentException("El sueldo debe ser >= 0.0");

        if (piezas < 0.0)
        throw new IllegalArgumentException("Las nuemro de piezas debe ser >= 0.0");

        this.sueldo = sueldo;
        this.piezas = piezas;
    }

    // establece sueldo
    public void establecerSueldo(double sueldo){
       if (sueldo < 0.0)
        throw new IllegalArgumentException("El sueldo debe ser >= 0.0");

       this.sueldo = sueldo; 
    }

    // devuelve sueldo
    public double obtenerSueldo(){
        return sueldo;
    }

    // establece numero de piezas
    public void establecerPiezas(int piezas){
        if (piezas < 0.0)
        throw new IllegalArgumentException("Las nuemro de piezas debe ser >= 0.0");

        this.piezas = piezas;
    }

    // devuelve numero de piezas
    public int obtenerPiezas(){
        return piezas;
    }

    // calcula los ingresos del empleado
    @Override
    public double ingresos(){
        return (double)obtenerSueldo() * obtenerPiezas();
    }

    // devuelve representación String de un objeto TrabajadorPorPiezas
    @Override
    public String toString(){
        return String.format("empleado asalariado: %s%n%s: $%,.2f%n%s: %d",
        super.toString(), "Sueldo de piezas por mercancía producidas", obtenerSueldo(), "Cantidad de piezas", obtenerPiezas());
    }
}
