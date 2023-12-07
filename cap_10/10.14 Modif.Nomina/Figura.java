// Clase base Figura
abstract class Figura {
    abstract String obtenerDescripcion();
}

// Clase FiguraBidimensional (subclase de Figura)
abstract class FiguraBidimensional extends Figura {
    abstract double obtenerArea();
}

// Clase FiguraTridimensional (subclase de Figura)
abstract class FiguraTridimensional extends Figura {
    abstract double obtenerArea();
    abstract double obtenerVolumen();
}

// Subclases de FiguraBidimensional
class Circulo extends FiguraBidimensional {
    private double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    String obtenerDescripcion() {
        return "Círculo";
    }

    @Override
    double obtenerArea() {
        return Math.PI * radio * radio;
    }
}

class Cuadrado extends FiguraBidimensional {
    private double lado;

    Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    String obtenerDescripcion() {
        return "Cuadrado";
    }

    @Override
    double obtenerArea() {
        return lado * lado;
    }
}

class Triangulo extends FiguraBidimensional {
    private double base;
    private double altura;

    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    String obtenerDescripcion() {
        return "Triángulo";
    }

    @Override
    double obtenerArea() {
        return 0.5 * base * altura;
    }
}

// Subclases de FiguraTridimensional
class Esfera extends FiguraTridimensional {
    private double radio;

    Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    String obtenerDescripcion() {
        return "Esfera";
    }

    @Override
    double obtenerArea() {
        return 4 * Math.PI * radio * radio;
    }

    @Override
    double obtenerVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
}

class Cubo extends FiguraTridimensional {
    private double lado;

    Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    String obtenerDescripcion() {
        return "Cubo";
    }

    @Override
    double obtenerArea() {
        return 6 * lado * lado;
    }

    @Override
    double obtenerVolumen() {
        return Math.pow(lado, 3);
    }
}

class Tetraedro extends FiguraTridimensional {
    private double arista;

    Tetraedro(double arista) {
        this.arista = arista;
    }

    @Override
    String obtenerDescripcion() {
        return "Tetraedro";
    }

    @Override
    double obtenerArea() {
        return Math.sqrt(3) * arista * arista;
    }

    @Override
    double obtenerVolumen() {
        return (Math.pow(arista, 3) / (6 * Math.sqrt(2)));
    }
}