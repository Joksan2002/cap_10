public class PruebaFiguras {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[]{
                new Circulo(5),
                new Cuadrado(4),
                new Triangulo(3, 6),
                new Esfera(3),
                new Cubo(4),
                new Tetraedro(2)
        };

        for (Figura figura : figuras) {
            System.out.println(figura.obtenerDescripcion());

            if (figura instanceof FiguraBidimensional) {
                FiguraBidimensional figuraBidimensional = (FiguraBidimensional) figura;
                System.out.println("Área: " + figuraBidimensional.obtenerArea());
            } else if (figura instanceof FiguraTridimensional) {
                FiguraTridimensional figuraTridimensional = (FiguraTridimensional) figura;
                System.out.println("Área: " + figuraTridimensional.obtenerArea());
                System.out.println("Volumen: " + figuraTridimensional.obtenerVolumen());
            }

            System.out.println("---------------------");
        }
    }
}
