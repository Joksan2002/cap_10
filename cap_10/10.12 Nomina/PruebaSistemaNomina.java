
public class PruebaSistemaNomina {
    public static void main(String[] args){

        // crea objetos de las subclases
        EmpleadoAsalariado empleadoAsalariado =new EmpleadoAsalariado("Jhon", "Smith", 
        "111-11-1111", new Fecha(8, 9, 2020), 800.00);
        EmpleadoPorHoras empleadoPorHoras =new EmpleadoPorHoras("Karen", "Price", 
        "222-22-2222", new Fecha(4, 20, 2004), 16.75, 40);
        EmpleadoPorComision empleadoPorComision =new EmpleadoPorComision("Sue", "Jones", 
        "333-33-3333", new Fecha(3, 14, 2007), 10000, .06);
        EmpleadoBaseMasComision empleadoBaseMasComision =new EmpleadoBaseMasComision("Bob", "Lewis", 
        "444-44-4444", new Fecha(11, 30, 2013),  5000, .04, 300);     
        TrabajadorPorPiezas trabajadorPorPiezas = new TrabajadorPorPiezas("Mark", "Huck",
         "555-55-5555", new Fecha(17, 1, 2023), 3000, 6);
        
        System.out.println("Empleados procesados por separado:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n",
        empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());
        System.out.printf("%s%n%s: $%,.2f%n%n",
        empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());
        System.out.printf("%s%n%s: $%,.2f%n%n",
        empleadoPorComision, "ingresos", empleadoPorComision.ingresos());
        System.out.printf("%s%n%s: $%,.2f%n%n",empleadoBaseMasComision,
        "ingresos", empleadoBaseMasComision.ingresos());
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
        trabajadorPorPiezas, "ingresos", trabajadorPorPiezas.ingresos());

        // crea un arreglo Empleado de cuatro elementos
        Empleado2[] empleados = new Empleado2[5];

        // inicializa el arreglo con objetos Empleado
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;
        empleados[4] = trabajadorPorPiezas;

        System.out.printf("Empleados procesados en forma polimorfica:%n%n");

        // procesa en forma genérica a cada elemento en el arreglo de empleados
        for (Empleado2 empleadoActual : empleados){

            System.out.println(empleadoActual); // invoca a toString 

            // determina si el elemento es un EmpleadoBaseMasComision
            if (empleadoActual instanceof EmpleadoBaseMasComision){
                // conversión descendente de la referencia de Empleado
                // a una referencia de EmpleadoBaseMasComision
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;      
                empleado.establecerSalarioBase(1.10 * empleado.obtenerSalarioBase());

                System.out.printf("el nuevo salario base con 10%% de aumento es: $%,.2f%n",
                empleado.obtenerSalarioBase());
            } // fin de if

            System.out.printf("ingresos $%,.2f%n%n", empleadoActual.ingresos()); empleadoActual.ingresos();
        } // fin de for

        System.out.printf("Modificacion de Empleados procesados en forma polimorfica%n%n");

        // Obtener el mes actual (supongamos que es noviembre, por ejemplo)
        int mesActual = 11;

        //Calcular la nómina para cada empleado
        for (Empleado2 empleado : empleados) {
            System.out.println(empleado);

            // Agregar bonificación si es el mes de cumpleaños
            if (empleado.obtenerFechaNacimiento().obtenerMes() == mesActual) {
                System.out.println("¡Feliz cumpleaños! Se agrega una bonificación de $100.00");
                System.out.printf("Pago total: $%.2f%n", empleado.ingresos() + 100.00);
            } else {
                System.out.printf("Pago total: $%.2f%n%n", empleado.ingresos());
            }
        }    

        // obtiene el nombre del tipo de cada objeto en el arreglo de empleados
        for (int j = 0; j < empleados.length; j++)
            System.out.printf("%nEl empleado %d es un %s", j,
            empleados[j].getClass().getName());        
    } // fin de main
}    
