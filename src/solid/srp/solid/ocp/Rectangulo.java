package solid.ocp;

public class Rectangulo extends Forma {
    private double ancho;
    private double alto;
    
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
